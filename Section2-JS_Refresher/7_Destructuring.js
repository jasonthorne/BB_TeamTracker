
// Extract array elements or object properties and store them as variables

//ARRAY DESTRUCTURING:

myArray = ["a","b"];
[destructedA, destructedB] = myArray; //+++++++ORDER defines which property we take

console.log("my array: ", myArray);
console.log("destructed a:", destructedA);
console.log("destructed b:", destructedB);

//OBJECT DESTRUCTURING:

//myObj = {myA: "a", myB: "b"};
//APPARENTLY THIS WORKS :P +++++++++++++++++++ #Not working for him either though :D 
/*{myB} = {myA:"a", myB:"b"}; //++++++++++++NAME of property defines which property we take
console.log("my b:", myB);*/
