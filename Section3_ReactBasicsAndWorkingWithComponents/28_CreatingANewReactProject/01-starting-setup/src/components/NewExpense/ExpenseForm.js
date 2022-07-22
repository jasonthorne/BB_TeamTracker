
import './ExpenseForm.css'; //add stylesheet for this component's jsx

const ExpenseForm = () =>{ //instead of function like in other examples (both obv work)
    return (
        <form>
            <div className='new-expense__controls'>
                <div className='new-expense__control'>
                    <label>Title</label>
                    <input type="text" />
                </div>
                <div className='new-expense__control'>
                    <label>Amount</label>
                    <input type="number" min="0.01" step="0.01" />
                </div>
            </div>
            <div className='new-expense__control'>
                <label>Date</label>
                <input type="date" min="2019-01-01" max="2022-12-31"/>
            </div>
        </form>
    );
};

export default ExpenseForm;