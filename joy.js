var five = require("johnny-five");
var board = new five.Board({port:"COM4"});

board.on("ready", function() {
  var dx = 0;
  var dy = 0;
  var joystick = new five.Joystick({
    //   [ x, y ]
    pins: ["A0", "A1"],
  });
  
  var matrix = new five.Led.Matrix({
    pins: {
      data: 2,
      clock: 3,
      cs: 4
    },
    devices: 1


  });
  

  joystick.on("change", function() {
    console.log("Joystick");
    console.log("  x : ", this.x);
    console.log("  y : ", this.y);
    console.log("--------------------------------------");
    
  });

  while(joystick.x > 1){
    dx++;
    matrix.led(dx, dy, 1);
  }

 /* -----------------------------------------------------------------------------------------
  
 var matrix = new five.Led.Matrix({
    pins: {
      data: 2,
      clock: 3,
      cs: 4
    },
    devices: 1
  });

  var dot = [
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