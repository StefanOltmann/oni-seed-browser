package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ui.theme.FillSpacer
import ui.theme.ctaColor
import ui.theme.defaultPadding
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.halfSpacing

@Composable
fun RuleEditor() {

    Column {

        RuleEditorRow(null) {

            FilterPanelEntry()
        }

        RuleEditorRow("OR") {

            FilterPanelEntry()
        }

        RuleEditorRow(null) {

            AddRuleButton(
                text = "OR",
                onClick = { println("add OR rule") }
            )
        }

        HorizontalSeparator(Modifier.padding(horizontal = defaultSpacing))

        RuleEditorRow(null) {

            AddRuleButton(
                text = "AND",
                onClick = { println("add AND rule") }
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
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(60.dp)
            )

        } else {

            Spacer(modifier = Modifier.width(60.dp))
        }

        content()

        FillSpacer()
    }
}

@Composable
private fun AddRuleButton(
    text: String,
    onClick: () -> Unit
) {

    val fontColor = MaterialTheme.colorScheme.onBackground

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(halfSpacing, Alignment.CenterHorizontally),
        modifier = Modifier
            .drawBehind {

                val dashLength = 8.dp.toPx()
                val gapLength = 8.dp.toPx()
                val strokeWidth = 2.dp.toPx()

                drawRoundRect(
                    color = fontColor,
                    size = this.size,
                    cornerRadius = CornerRadius(
                        8.dp.toPx(),
                        8.dp.toPx()
                    ),
                    style = Stroke(
                        width = strokeWidth,
                        pathEffect = PathEffect.dashPathEffect(floatArrayOf(dashLength, gapLength))
                    )
                )
            }
            .size(120.dp, 48.dp)
            .clickable { onClick() }
    ) {

        Text(
            text = "ADD",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Box(
            modifier = Modifier
                .padding()
                .background(
                    ctaColor,
                    defaultRoundedCornerShape
                )
        ) {

            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(halfSpacing)
            )
        }

        Text(
            text = "RULE",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

