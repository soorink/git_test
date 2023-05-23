wmatrix.define('wmatrix/plugin_list', function(require, exports, module) {
module.exports =
// TOP OF MODULE
[
  {
    "id": "wmatrix-plugin-camera.Camera",
    "file": "plugins/wmatrix-plugin-camera/www/CameraConstants.js",
    "pluginId": "wmatrix-plugin-camera",
    "clobbers": [
      "Camera"
    ]
  },
  {
    "id": "wmatrix-plugin-camera.CameraPopoverOptions",
    "file": "plugins/wmatrix-plugin-camera/www/CameraPopoverOptions.js",
    "pluginId": "wmatrix-plugin-camera",
    "clobbers": [
      "CameraPopoverOptions"
    ]
  },
  {
    "id": "wmatrix-plugin-camera.camera",
    "file": "plugins/wmatrix-plugin-camera/www/Camera.js",
    "pluginId": "wmatrix-plugin-camera",
    "clobbers": [
      "navigator.camera"
    ]
  },
  {
    "id": "wmatrix-plugin-camera.CameraPopoverHandle",
    "file": "plugins/wmatrix-plugin-camera/www/CameraPopoverHandle.js",
    "pluginId": "wmatrix-plugin-camera",
    "clobbers": [
      "CameraPopoverHandle"
    ]
  },
  {
    "id": "wmatrix-plugin-network-information.network",
    "file": "plugins/wmatrix-plugin-network-information/www/network.js",
    "pluginId": "wmatrix-plugin-network-information",
    "clobbers": [
      "navigator.connection",
      "navigator.network.connection"
    ]
  },
  {
    "id": "wmatrix-plugin-network-information.Connection",
    "file": "plugins/wmatrix-plugin-network-information/www/Connection.js",
    "pluginId": "wmatrix-plugin-network-information",
    "clobbers": [
      "Connection"
    ]
  },
  {
    "clobbers": [
      "device"
    ],
    "file": "plugins/wmatrix-plugin-device/www/device.js",
    "pluginId": "wmatrix-plugin-device",
    "id": "wmatrix-plugin-device.device"
  },
  {
    "clobbers": [
      "wmatrix.plugin.biometric"
    ],
    "file": "plugins/wmatrix-plugin-biometric/www/biometric.js",
    "pluginId": "wmatrix-plugin-biometric",
    "id": "wmatrix-plugin-biometric.biometric"
  },
  {
    "clobbers": [
      "wmatrix.plugin.contents"
    ],
    "file": "plugins/wmatrix-plugin-contents/www/contents.js",
    "pluginId": "wmatrix-plugin-contents",
    "id": "wmatrix-plugin-contents.contents"
  },
  {
    "clobbers": [
      "navigator.geolocation"
    ],
    "file": "plugins/wmatrix-plugin-geolocation/www/geolocation.js",
    "pluginId": "wmatrix-plugin-geolocation",
    "id": "wmatrix-plugin-geolocation.geolocation"
  },
  {
    "clobbers": [
      "wmatrix.plugin.app"
    ],
    "file": "plugins/wmatrix-plugin-app/www/app.js",
    "pluginId": "wmatrix-plugin-app",
    "id": "wmatrix-plugin-app.app"
  }
];
// BOTTOM OF MODULE
module.exports.metadata =
// TOP OF METADATA
{
  "wmatrix-plugin-camera": "4.0.1",
  "wmatrix-plugin-network-information": "2.0.1",
  "wmatrix-plugin-device": "2.1.0",
  "wmatrix-plugin-biometric": "1.0.3",
  "wmatrix-plugin-contents": "1.1.0",
  "wmatrix-plugin-geolocation": "1.0.0",
  "wmatrix-plugin-app": "1.1.0"
};
// BOTTOM OF METADATA
});