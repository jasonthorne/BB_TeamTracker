class Human{
    constructor(){
        this.gender = "Male";
    }

    printMyGender(){
        console.log("I am", this.gender);
    }
}

class Person extends Human{
    constructor(){
        super(); // ++++++++++++++++MUST CALL SUPER of inherited class in this classe's constructor to first initialize parent class 
        this.name = "Jay"; //constructor creates & sets name
    }

    printMyName(){
        console.log("My name is", this.name);
    }
}

//create perosn obj:
const person = new Person();
//call person's method:
person.printMyName();
//call person's inherited method:
person.printMyGender();