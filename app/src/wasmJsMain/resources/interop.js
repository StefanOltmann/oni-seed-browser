/*
 * Oxygen Not Included Seed Browser
 * Copyright (C) 2025 The Maps Not Included Authors
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
 *
 * See the AUTHORS file in the project root for a full list of contributors.
 */

let boxesJson;

async function addLeafletBoxSendEventListener() {
    // Only send the message if the iframe is loaded
    if (window && window.app) {
        const exports = await window.app;
        window.addEventListener("message", (event) => {
            // Optional: Validate origin
            if (event.data === "getLeafletBoxes") {
                // const startTime = performance.now();
                boxesJson = exports.getActiveLeafletBoxesJson();
                // console.log(`boxesJson time: ${performance.now() - startTime} ms`)
                // console.log(boxesJson);
                event.source.postMessage({type: "leafletBoxes", boxesJson}, event.origin);
            }
        });
        console.log("Seed browser: Leaflet boxes event listener registered")
    } else {
        requestAnimationFrame(addLeafletBoxSendEventListener); // Keep looping
    }

}

// Start polling via requestAnimationFrame
requestAnimationFrame(addLeafletBoxSendEventListener);

const isInBox = (boxes, x, y) => {
    return boxes.some(box => (
        x >= box.left &&
        x <= box.right &&
        y >= box.top &&
        y <= box.bottom
    ));
};

const forwardEvent = (type, originalEvent, stopEvent, extra = {}) => {
    const { clientX, clientY } = originalEvent;

    if (!stopEvent) {
        originalEvent.preventDefault();
        originalEvent.stopPropagation();
        originalEvent.stopImmediatePropagation();
    }

    const data = {
        type: "iframe:" + type,
        clientX,
        clientY,
        pageX: originalEvent.pageX,
        pageY: originalEvent.pageY,
        screenX: originalEvent.screenX,
        screenY: originalEvent.screenY,
        ctrlKey: originalEvent.ctrlKey,
        metaKey: originalEvent.metaKey,
        shiftKey: originalEvent.shiftKey,
        altKey: originalEvent.altKey,
        button: originalEvent.button,
        buttons: originalEvent.buttons,
        pointerType: originalEvent.pointerType,
        key: originalEvent.key,
        deltaX: originalEvent.deltaX,
        deltaY: originalEvent.deltaY,
        deltaZ: originalEvent.deltaZ,
        deltaMode: originalEvent.deltaMode,
        bubbles: true,
        cancelable: true,
        composed: true,
        ...extra
    };

    window.parent.postMessage(data, "*");
};

const mouseEvents = [
    "click", "dblclick", "mousedown", "mouseup",
    "mouseover", "mouseout", "mousemove", "contextmenu", "preclick"
];

const pointerEvents = [
    "pointerdown", "pointerup", "pointermove", "pointercancel"
];

const keyboardEvents = ["keypress", "keydown", "keyup"];

const dragEvents = ["dragstart", "drag", "dragend"];

const allEvents = [...mouseEvents, ...pointerEvents, "wheel", ...keyboardEvents, ...dragEvents];

for (const type of allEvents) {
    document.addEventListener(type, (e) => {
        const stopEvent = (type === "wheel" && !(e.ctrlKey || e.metaKey)); // Let ordinary scroll through

        // Load cached Leaflet bounds from the Compose app's JS exports
        if (boxesJson === undefined) {
            return;
        }
        const leafletBoxData = JSON.parse(boxesJson);
        const mapBoxes = (leafletBoxData && leafletBoxData["map-containers"]) || [];
        const renderBounds = (leafletBoxData && leafletBoxData["visible-scroll-bounds"]) || [];
        const visible = (leafletBoxData && leafletBoxData["visible"]) || false;

        const { clientX, clientY } = e;
        if (!visible) return;
        if (!isInBox(renderBounds, clientX, clientY)) return;
        if (!isInBox(mapBoxes, clientX, clientY)) return;

        forwardEvent(type, e, stopEvent);
    }, { passive: false, capture: true });
}
