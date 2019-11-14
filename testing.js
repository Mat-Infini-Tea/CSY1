var five = require("johnny-five");
var board = new five.Board({port:"COM4"});

board.on("ready", function() {

  var matrix = new five.Led.Matrix({
    pins: {
      data: 2,
      clock: 3,
      cs: 4
    },
    devices: 1
  });

  matrix.led(2, 2, 1);
  
  /*var dot = [
    "00000000",
    "00000000",
    "00000000",
    "00011000",
    "00011000",
    "00000000",
    "00000000",
    "00000000"
  ];


  matrix.draw(dot);*/

});