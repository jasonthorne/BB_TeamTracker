class Human{
    gender = "Male"; //property (without using constructor as per javascript 6)
   
    printMyGender =()=>{ //method, using arrow function
        console.log("I am", this.gender); //+++++++++++'this' is STILL needed to target gender
    }
}

class Person extends Human{ //++++++++++NOTE: call to super NOT needed here, as nothing is declared in constructor of parent
    name = "Jay";
   
    printMyName =()=>{
        console.log("My name is", this.name);
    }
}

//create perosn obj:
const person = new Person();
//call person's method:
person.printMyName();
//call person's inherited method:
person.printMyGender();