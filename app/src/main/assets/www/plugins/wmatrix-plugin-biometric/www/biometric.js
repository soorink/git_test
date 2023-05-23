wmatrix.define("wmatrix-plugin-biometric.biometric", function(require, exports, module) {
var biometricExport = {};

var argscheck = require('wmatrix/argscheck'),
    exec = require('wmatrix/exec');

biometricExport.deleteData = function (callback, data){
    exec(callback,"BiometricPlugin","deleteData",data);
}

biometricExport.checkData = function (callback, data){
    exec(callback,"BiometricPlugin","checkData",data);
}

biometricExport.encryptData = function (callback, data){
    exec(callback,"BiometricPlugin","encryptData",data);
}

biometricExport.decryptData = function (callback, data){
    exec(callback,"BiometricPlugin","decryptData",data);
}

module.exports = biometricExport;
});