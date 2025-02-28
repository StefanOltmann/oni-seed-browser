/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de/oni-seed-browser
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ui.filter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiAnd
import io.github.stefanoltmann.app.generated.resources.uiOr
import io.github.stefanoltmann.app.generated.resources.uiSelectRule
import model.filter.FilterQuery
import org.jetbrains.compose.resources.stringResource
import ui.DashedHorizontalSeparator
import ui.theme.FillSpacer
import ui.theme.defaultPadding

@Composable
fun RuleEditor(
    filterQueryState: MutableState<FilterQuery>,
    filterSelection: MutableState<FilterSelection?>
) {

    val density = LocalDensity.current.density
    val smallScreen = remember { mutableStateOf(false) }
    val query = filterQueryState.value

    if (query.cluster == null) {

        Text(
            text = stringResource(Res.string.uiSelectRule),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7F),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.height(48.dp)
        )

        return
    }

    Column(
        modifier = Modifier.onSizeChanged {
            smallScreen.value = it.width / density < 400
        }
    ) {

        for ((rulesIndex, orConnectedRules) in query.rules.withIndex()) {

            for ((ruleIndex, rule) in orConnectedRules.withIndex()) {

                val text = if (rulesIndex == 0 && ruleIndex == 0)
                    null
                else if (ruleIndex == 0)
                    stringResource(Res.string.uiAnd)
                else
                    stringResource(Res.string.uiOr)

                RuleEditorRow(text) {

                    FilterPanelEntry(
                        rule = rule,
                        onAsteroidFilterClicked = {

                            filterSelection.value = FilterSelection(
                                rulesIndex,
                                ruleIndex,
                                FilterSelectionType.ASTEROID
                            )
                        },
                        onItemFilterClicked = {

                            filterSelection.value = FilterSelection(
                                rulesIndex,
                                ruleIndex,
                                FilterSelectionType.ITEM
                            )
                        },
                        onConditionFilterClicked = {

                            /* Update the query */
                            filterQueryState.value = filterQueryState.value.switchCondition(
                                rulesIndex = rulesIndex,
                                ruleIndex = ruleIndex
                            )
                        },
                        onValueChanged = {

                            if (it.isNotBlank() && it.all(Char::isDigit)) {

                                /* Update the query */
                                filterQueryState.value = filterQueryState.value.setValue(
                                    rulesIndex = rulesIndex,
                                    ruleIndex = ruleIndex,
                                    value = it.toInt()
                                )

                            } else if (it.isBlank()) {

                                /* Update the query */
                                filterQueryState.value = filterQueryState.value.setValue(
                                    rulesIndex = rulesIndex,
                                    ruleIndex = ruleIndex,
                                    value = null
                                )
                            }
                        },
                        onDeleteClicked = {
                            filterQueryState.value = query.removeRule(rulesIndex, ruleIndex)
                        },
                        smallScreen.value

                    )
                }
            }

            RuleEditorRow(null) {

                AddRuleButton(
                    text = stringResource(Res.string.uiOr),
                    onClick = {
                        filterQueryState.value = query.addEmptyOrRule(rulesIndex)
                    }
                )
            }

            DashedHorizontalSeparator()
        }

        RuleEditorRow(null) {

            AddRuleButton(
                text = stringResource(Res.string.uiAnd),
                onClick = {
                    filterQueryState.value = query.addEmptyAndRule()
                }
            )
        }
    }
}

@Composable
private fun RuleEditorRow(
    text: String? = null,
    content: @Composable () -> Unit
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.defaultPadding()
    ) {

        if (text != null) {

            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(40.dp)
            )

        } else {

            Spacer(modifier = Modifier.width(40.dp))
        }

        content()

        FillSpacer()
    }
}



