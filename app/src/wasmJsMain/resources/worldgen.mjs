import init, {worldgen} from '@tigin-backwards/oxygen-not-included-worldgen';

const api = {
    async init() { await init(); },
    generate(coordinate) { return JSON.stringify(worldgen.generate(coordinate)); }
};

export default api;
