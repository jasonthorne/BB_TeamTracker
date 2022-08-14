
import './NewExpense.css'; //add stylesheet for this component's jsx

import ExpenseForm from  './ExpenseForm'; //import expense form component

const NewExpense = (props) =>{ //instead of function like in other examples (both obv work)

    /*+++++++++++++++IMPORTANT: Adding a new prop to our expenseForm WHOS VALUE IS A FUNCTION to be triggered whenever something happens inside of this component
    in this case whever the user saves the expense data. */
    const onSaveExpenseDataHandler = (enteredExpenseData)=>{
        //create expense data with copied in entered expense data, and an id:
        const expenseData = {
            ...enteredExpenseData,
            id: Math.random().toString()
        };
        props.onAddExpense(expenseData); //call method property 'onAddExpence', passing it expenseData

    };

    //sending onSaveExpenseDataHandler (which is a FUNCTION) as a prop to expense form: 
    return (
        <div className='new-expense'>
            <ExpenseForm onSaveExpenseData={onSaveExpenseDataHandler} /> 
        </div>
    );
};

export default NewExpense;