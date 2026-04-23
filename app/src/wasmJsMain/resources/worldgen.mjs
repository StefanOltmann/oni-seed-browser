import init, {worldgen} from '@tigin-backwards/oxygen-not-included-worldgen';

const api = {
    async init() {
        await init();
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
