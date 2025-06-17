export function postMessageLeafletBoxes(json) {
    const data = JSON.parse(json);
    window.parent.postMessage({ type: 'leafletBoxesUpdate', data }, '*');
}
