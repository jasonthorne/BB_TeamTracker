

import './ExpenseItem.css'; //add stylesheet for this component's jsx

/*
A component is just a function, returning JSX html code 
*/

function ExpenseItem(){ //convention is to repeat the filename

    const expenseDate = new Date(2022, 2, 21); //create date with js ++++++ 2 is March as 0 indexed
    const expenseTitle = 'title here'; //create title
    const expenseAmount = 333.33; //create title

    return (
        <div className='expense-item'> 
            <div>{expenseDate.toISOString()}</div>
            <div className='expense-item__description'>
                <h2>{expenseTitle}</h2> 
            </div>
            <div className='expense-item__price'>${expenseAmount}</div>
        </div>
    );
} // NOTE that ONE root html element must be returned (div in this case)
// NOTE className instead of class for adding css stling 


//++++++++++++++ REMEMBER - function neeeds exported - THEN imported in another file to use: 
export default ExpenseItem; //export this function as the 'default' for this file