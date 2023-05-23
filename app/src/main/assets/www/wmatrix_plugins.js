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
      "wmatrix.plugin.app"
    ],
    "file": "plugins/wmatrix-plugin-app/www/app.js",
    "pluginId": "wmatrix-plugin-app",
    "id": "wmatrix-plugin-app.app"
  },
  {
    "clobbers": [
      "wmatrix.plugin.screenRecorder"
    ],
    "file": "plugins/wmatrix-plugin-screenrecorder/www/screenRecorder.js",
    "pluginId": "wmatrix-plugin-screenrecorder",
    "id": "wmatrix-plugin-screenrecorder.screenRecorder"
  },
  {
    "clobbers": [
      "wmatrix.plugin.misc"
    ],
    "file": "plugins/wmatrix-plugin-misc/www/misc.js",
    "pluginId": "wmatrix-plugin-misc",
    "id": "wmatrix-plugin-misc.misc"
  },
  {
    "clobbers": [
      "wmatrix.plugin.websquare"
    ],
    "file": "plugins/wmatrix-plugin-websquare/www/websquare_plugin.js",
    "pluginId": "wmatrix-plugin-websquare",
    "id": "wmatrix-plugin-websquare.websquare"
  }
];
// BOTTOM OF MODULE
module.exports.metadata =
// TOP OF METADATA
{
  "wmatrix-plugin-camera": "4.0.1",
  "wmatrix-plugin-network-information": "2.0.1",
  "wmatrix-plugin-mvaccine": "1.1.2",
  "wmatrix-plugin-app": "1.1.0",
  "wmatrix-plugin-screenrecorder": "1.0.0",
  "wmatrix-plugin-misc": "1.2.0",
  "wmatrix-plugin-websquare": "1.1.0"
};
// BOTTOM OF METADATA
});