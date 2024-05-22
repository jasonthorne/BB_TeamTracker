
// SPREAD OPERATOR:
//Spread is used to split up array elements OR object properties.

//----------splitting array elements:-------------
const oldArray = [1,2,3];
//new array made with split elements from old array:
const newArray = [...oldArray, 4,5,6];

console.log(oldArray);
console.log(newArray);


//----------splitting object properties:-------------

const oldObj = {prop1:"a", prop2:"b"};

//new object made with properties (and their values) from old object:
const newObj = {...oldObj, newProp: "c"}

console.log(oldObj);
console.log(newObj);

//===================================================================

// REST OPERATOR:
//used to merge a list of funtion arguements INTO an arrray.


function sortArgs(...myArgs){
    return myArgs.sort();
}

console.log(sortArgs(3,1,2)); //pass unordered args into function