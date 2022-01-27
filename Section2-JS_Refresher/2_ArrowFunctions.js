// ordinary function:
function myOrdinaryFunct(myArg){
    console.log("I'm an ordinary function. myArg is: ", myArg);
}

myOrdinaryFunct("sup!"); //call ordinary func

//arrow function: ++++++++ NOTE THAT THIS IS A CONST
const myArrowFunct = (myArg) => {
    //+++++++++++++can omit 'return' (and brackets) if only a return statement is used
    return console.log("I'm an arrow function. myArg is: ", myArg);
}

myArrowFunct("yo!"); //call arrow func