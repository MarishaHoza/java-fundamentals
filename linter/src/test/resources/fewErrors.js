use strict;

function iHaveNoError(){
    let randomVariable = null
    return randomVariable
}

let broken = "no semicolon"
let arr = [1,2,3,4,5];
for ( var i = 0; i < arr.length; i++ ){
 if (typof arr[i] == "number"){
    causeAProblem()
 } else {
    causeNoProblem();
 }
}

function causeAProblem(){
    return "more problems"
}

function causeNoProblem(){
    return "no problem at all";
}