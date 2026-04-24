import init, {worldgen} from '@tigin-backwards/oxygen-not-included-worldgen';

const api = {
    async init() {
        await init();
    },
    version() {
        return worldgen.version();
    },
    generate(coordinate) {

        const result = worldgen.generate(coordinate);

        delete result.element_table;

        for (const world of result.worlds) {

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

        for (const poi of result.starmap_pois) {
            delete poi.capacity_roll;
            delete poi.recharge_roll;
            delete poi.total_capacity;
            delete poi.recharge_time;
        }

        return JSON.stringify(result);
    }
};

export default api;
