
import './ExpenseForm.css'; //add stylesheet for this component's jsx
import React, {useState} from 'react'; // +++++ FOR STORING STATE OF INPUTTED VALUES INCASE COMPONENT IS EVER CALLED AGAIN 

const ExpenseForm = (props) =>{ //instead of function like in other examples (both obv work)

    //==========USESTATES: ==========
    //useState for title:
    //grabbing a var for entered title (set as empty initially) and an object for updating title from useState()
    const [enteredTitle, setEnteredTitle] = useState(''); //call usestate 

    //useState for amount:
    const [enteredAmount, setEnteredAmount] = useState(''); //call usestate
    //useState for date:
    const [enteredDate, setEnteredDate] = useState(''); //call usestate

    //Single useState with a passed object:
    /*const [userInput, setUserInput] = useState({ 
        enteredTitle: '',
        enteredAmount: '',
        enteredDate: '',
    });*/


    //==============HANDLERS FOR USESTATES: ============

    //change listener for title label input +++REMEMBER: we just POINT at the function with the listener. dont execute it there :P
    const titleChangeHandler = (event) =>{ //EVENT object is passed to this automatically on change
        console.log(event.target.value); //get value of input entered +++++++
        setEnteredTitle(event.target.value); //set enteredTitle var as value of entered input +++++
       
       //+++++++++++++++++SIMPLE WAY OF UPDATING VALUE WITH ONE SHARED STATE:
        /// setUserInput({
            //++++++++++++++++spread below is needed as othewrwise amount and date would revert to their defualt values of '' 
          //  ...userInput, //++++++++++++++++++using spread opperator to set all keys of userInput with their values.
          //  enteredTitle: event.target.value //++++++++THEN overriding title key with new value
        //});

        //+++++++++++++++++BETTER WAY OF UPDATING VALUE WITH ONE SHARED STATE:
        //better because react SCHEDULES state changeds, it doesnt perform them instantly. Therefore youy could be depending onm outdated values with your snapshot of this state.
        //prfevious state is passed by default as arg:
        //+++++++++SO IF YOUR STATE UPDATE DEPENDS ON YOUR PREVIOUS STATE< YOU SHOULD DEFINITATELY SE THIS METHOD INSTEAD +++++
        /*setUserInput((previousState) =>{
            return {...previousState, enteredTitle: event.target.value} //return obj with previous state and updated value
        });*/
            
    };

    const amountChangeHandler = (event) =>{
        console.log(event.target.value);
        setEnteredAmount(event.target.value);
       /* setUserInput({
            //++++++++++++++++spread below is needed as othewrwise amount and date would revert to their defualt values of '' 
            ...userInput, //++++++++++++++++++using spread opperator to set all keys of userInput with their values.
            enteredAmount: event.target.value //++++++++THEN overriding title key with new value
        });*/
    }

    const dateChangeHandler = (event) =>{
        console.log(event.target.value);
        setEnteredDate(event.target.value);
        /*setUserInput({
            //++++++++++++++++spread below is needed as othewrwise amount and date would revert to their defualt values of '' 
            ...userInput, //++++++++++++++++++using spread opperator to set all keys of userInput with their values.
            enteredDate: event.target.value //++++++++THEN overriding title key with new value
        });*/
    }

    //++++++++++++++++IF a btnm with type="submit" inside a form is clicked, the form itself will omit a submit event, which we can listen for:
    //n <form onSubmit={name of some function to trigger on submit}

    const submitHandler = (event) => {
        event.preventDefault(); //prevent the default of this request being sent whenever button is clicked. Stopping page from reloading in response :) ++++++++++++++++++++
        
        //create object holding entered form data: (creating date object from date string)
        const expenseData = {
            title: enteredTitle,
            amount: enteredAmount,
            date: new Date(enteredDate)
        };

        console.log(expenseData);
        //+++++++++++++++++set fields back to empty: (This works because of value={enteredFieldVariable} on the field tags)
        setEnteredTitle(''); //set entered title back to empty string. 
        setEnteredAmount(''); //set amount title back to empty string. 
        setEnteredDate(''); //set date title back to empty string. 

    };

    return (
        <form onSubmit={submitHandler}> 
            <div className='new-expense__controls'>
                <div className='new-expense__control'>
                    <label>Title</label>
                    <input type="text" onChange={titleChangeHandler} value={enteredTitle} />
                </div>
                <div className='new-expense__control'>
                    <label>Amount</label>
                    <input type="number" min="0.01" step="0.01" onChange={amountChangeHandler} value={enteredAmount} />
                </div>
                <div className='new-expense__control'>
                    <label>Date</label>
                    <input type="date" min="2019-01-01" max="2022-12-31" onChange={dateChangeHandler} value={enteredDate} />
                </div>
            </div>
            <div className='new-expense__actions'>
                <button type="submit">Add Expense</button>
            </div>
        </form>
    );
};

export default ExpenseForm;