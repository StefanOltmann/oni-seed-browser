/*
 * ONI Seed Browser
 * Copyright (C) 2026 Stefan Oltmann
 * https://stefan-oltmann.de
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

import init, {worldgen} from '@tigin-backwards/oxygen-not-included-worldgen';

let initialized = false;

self.onmessage = async (event) => {

    const {id, type, payload} = event.data;

    try {

        if (type === 'init') {

            if (!initialized) {
                await init();
                initialized = true;
            }

            self.postMessage({id, type: 'init', result: null});

        } else if (type === 'version') {

            const result = worldgen.version();

            self.postMessage({id, type: 'version', result});

        } else if (type === 'generate') {

            const raw = worldgen.generate(payload.coordinate);

            delete raw.element_table;

            for (const world of raw.worlds) {

                delete world.element_idx;
                delete world.mass;
                delete world.temperature;
                delete world.disease_idx;
                delete world.disease_count;
                delete world.pickupables;

                for (const cell of world.biome_cells) {
                    delete cell.type;
                }

                for (const geyserSpawn of world.geysers) {
                    delete geyserSpawn.cell;
                }

                for (const entitySpawn of world.other_entities) {
                    delete entitySpawn.cell;
                }

                for (const entitySpawn of world.buildings) {
                    delete entitySpawn.cell;
                    delete entitySpawn.connections;
                    delete entitySpawn.rotationOrientation;
                }
            }

            for (const poi of raw.starmap_pois) {
                delete poi.capacity_roll;
                delete poi.recharge_roll;
                delete poi.total_capacity;
                delete poi.recharge_time;
            }

            const result = JSON.stringify(raw);

            self.postMessage({id, type: 'generate', result});

        } else {

            self.postMessage({id, type: 'error', error: 'Unknown message type: ' + type});
        }

    } catch (e) {

        self.postMessage({id, type: 'error', error: e.message ?? String(e)});
    }
};
