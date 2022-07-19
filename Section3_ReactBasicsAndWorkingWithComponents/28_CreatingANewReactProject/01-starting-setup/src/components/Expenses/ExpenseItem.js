
//imports:
import React, {useState} from 'react'; //+++++++++++++++IMPORTANT FOR CHANGING STATE (inside component function) :P 
import './ExpenseItem.css'; //add stylesheet for this component's jsx
import ExpenseDate from './ExpenseDate'; //import ExpenseDate component
import Card from '../UI/Card'; //import Card component

/*
A component is just a function, returning JSX html code 
*/

/*react passes ONE param (props) as an arg when passing propoerites to a component +++++++++
This is an object holding all of the recieved attributes as properties. 
*/
function ExpenseItem(props){ //convention is to repeat the filename
    /*
    now bundled into its own component (ExpenseDate):
    const month = props.date.toLocaleString('en-US', { month: 'long'});
    const day = props.date.toLocaleString('en-US', { day: '2-digit'});
    const year = props.date.getFullYear();*/

    /*
    IMPORTANT+++++++++++++++++:
    + a react 'hook' (all start with 'use') called for changing title state upon click. 
    + MUST only be called within react component functions.
    + needs passed a 'default state'
    RETURNS AND ARRAY WITH 2 THINGS:
        - var holding the current value
        - a function for changing the value
    */
    const [title, setTitle] = useState(props.title); //making 2 varables from array returned from useState() +++++++++

    const clickHandler = () =>{
      setTitle('yo!'); //call setTitle to change value of title ++++++++
    };

    return (
        <Card className='expense-item'>
            <ExpenseDate date={props.date} />
            <div className='expense-item__description'>
                <h2>{title}</h2>
            </div>
            <div className='expense-item__price'>${props.amount}</div>
            <button onClick={clickHandler}>Change Title</button>
        </Card>
    );
} 
// NOTE that ONE root html element must be returned (div in this case)
// NOTE 'className' instead of 'class' for adding css stling 
// NOTE props.something has to equal the name given to componment attribute in App.js
// NOTE 'onCick' is adding a react click event listener REMEBER - events take functions :P
// NOTE: if passing an existing function to the listener, just POINT at it, dont invoke it: 'doThis' 'dontDoThis()'
// NOTE Name the above function somethingHandler if its an event handler +++++++++++

//++++++++++++++ REMEMBER - function neeeds exported - THEN imported in another file to use: 
export default ExpenseItem; //export this function as the 'default' for this file