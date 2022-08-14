
import './NewExpense.css'; //add stylesheet for this component's jsx

import ExpenseForm from  './ExpenseForm'; //import expense form component

const NewExpense = () =>{ //instead of function like in other examples (both obv work)

    /*+++++++++++++++IMPORTANT: Adding a new prop to our expense form WHOS VALUE IS A FUNCTION to be triggered whenever something happens inside of this component
    in this case whever the user saves the expense data. */
    return (
        <div className='new-expense'>
            <ExpenseForm onSaveExpenseData />
        </div>
    );
};

export default NewExpense;