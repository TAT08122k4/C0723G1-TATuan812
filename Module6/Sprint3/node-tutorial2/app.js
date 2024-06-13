// var Emitter = require("./emitter");
// var Emitter = require("events")

var emitter = new Emitter();
function response() {
    console.log('An event occurred!');
}
emitter.on("test",response);

emitter.on("loiChao",function () {
    console.log("Xin Chào");
});
emitter.on("hello",function () {
    console.log("Hi There");
});
emitter.once("hallo",function () {
    console.log("Hallo bro");
});
var xinChao = ["VIE","ENG"];

for(var xc of xinChao){
    if(xc == "VIE"){
        emitter.emit("hallo")
        emitter.emit("hallo")
    }else{
        // emitter.emit("hallo")
        // emitter.emit("hallo")
    }
}