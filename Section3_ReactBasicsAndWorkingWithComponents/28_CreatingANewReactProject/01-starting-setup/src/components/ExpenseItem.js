
/*
A component is just a function, returning JSX html code 
*/

function ExpenseItem(){ //convention is to repeat the filename
    return <h2>Im an Expense Item!</h2>;
}


//++++++++++++++ REMEMBER - function neeeds exported - THEN imported in another file to use: 
export default ExpenseItem; //export this function as the 'default' for this file