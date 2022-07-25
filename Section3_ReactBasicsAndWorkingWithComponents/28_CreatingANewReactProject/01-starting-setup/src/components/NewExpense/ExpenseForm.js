
import './ExpenseForm.css'; //add stylesheet for this component's jsx

const ExpenseForm = () =>{ //instead of function like in other examples (both obv work)

    const titleChangeHandler = () =>{ //change listener for title label input +++REMEMBER: we just POINT at the function with the listener. dont execute it there :P
        console.log("sup dawg!");
    };

    return (
        <form>
            <div className='new-expense__controls'>
                <div className='new-expense__control'>
                    <label>Title</label>
                    <input type="text" onChange={titleChangeHandler} />
                </div>
                <div className='new-expense__control'>
                    <label>Amount</label>
                    <input type="number" min="0.01" step="0.01" />
                </div>
                <div className='new-expense__control'>
                    <label>Date</label>
                    <input type="date" min="2019-01-01" max="2022-12-31"/>
                </div>
            </div>
            <div className='new-expense__actions'>
                <button type="submit">Add Expense</button>
            </div>
        </form>
    );
};

export default ExpenseForm;