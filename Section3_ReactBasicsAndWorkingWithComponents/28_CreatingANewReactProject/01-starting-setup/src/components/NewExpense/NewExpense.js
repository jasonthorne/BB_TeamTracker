
import './NewExpense.css'; //add stylesheet for this component's jsx

import ExpenseForm from  './ExpenseForm'; //import expense form component

const NewExpense = () =>{ //instead of function like in other examples (both obv work)
    return (
        <div className='new-expense'>
            <ExpenseForm />
        </div>
    );
};

export default NewExpense;