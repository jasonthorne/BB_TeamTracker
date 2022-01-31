const num1 = 1; //primitive type
const num2 = num1 //reference type. this stores a COPY of num1

console.log(num2);


const obj1 = {
    myVar: "yo"
};

const obj2 = obj1; //holds REFERENCE to obj1

obj1.myVar = "dawg";

console.log(obj2); //shows dawg (obv :P)


//make proper copy (ie new object, not sharing reference):
const obj3 = {
    ...obj1 //spread opperator copies all properties and their values from obj1
};

obj1.myVar = "woohoo!";

console.log(obj3); //still shows dawg, as not pointing to obj1
