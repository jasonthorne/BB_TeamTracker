

//things to be EXPORTED need to be defined as such within their files:

const person = {
    name: "Jay"
}
export default person; //DEFAULT export

// NAMED (i.e non default) exports:
export const yo = () => {"..."};
export const myNum = 10;


//IMPORTING:

//When importing defaults, can name them whatever you want:
import person from './person.js';
import gbgbgb from './person.js';

//When importing named exports you MUST provide the name of what your importing:
import {yo} from './yolo.js'; 
import {gbgbgb as myNewName} from './gbgbgb.js'; //assigning new name to import
import * as everythingImported from './yolo.js'; //import EVERYTHING as new named object

