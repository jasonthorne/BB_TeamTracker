

import './ExpenseItem.css'; //add stylesheet for this component's jsx

/*
A component is just a function, returning JSX html code 
*/

function ExpenseItem(){ //convention is to repeat the filename
    return (
        <div>
            <div>Date</div>
            <div><h2>Title</h2></div>
            <div>Amount</div>
        </div>
    );
} // NOTE that ONE root html element must be returned (div in this case)


//++++++++++++++ REMEMBER - function neeeds exported - THEN imported in another file to use: 
export default ExpenseItem; //export this function as the 'default' for this file