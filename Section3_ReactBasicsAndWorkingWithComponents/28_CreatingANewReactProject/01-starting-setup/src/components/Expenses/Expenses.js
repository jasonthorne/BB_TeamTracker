//imports:
import React, {useState} from 'react';
import './Expenses.css'; //add stylesheet for this component's jsx
import ExpenseItem from './ExpenseItem'; //import ExpenseDate component
import Card from '../UI/Card';
import ExpensesFilter from './ExpensesFilter';

function Expenses(props){

    const [selectedYear, setSelectedYear] = useState('2020'); //call usestate 

    const filterChangeHandler = (selectedYear) =>{
        //console.log("in app.js");
        //console.log("year is: ", selectedYear);
        setSelectedYear(selectedYear); //save state with selected year
        console.log("saved state of year is: ", selectedYear);
      };




    /*

    for props.items (the array of expenses passed in app.js):
    use built in array method (.map()) from standard js.
    this provideds a new array, with the results of calling the provided function on every element in the original array.
    
    here were retunring sa list of ExpenseItems, holding the values of each expense in the passed list

    */

    return (
        <Card className='expenses'>
            <ExpensesFilter selected={selectedYear} onFilterChange={filterChangeHandler}/>
            {props.expenses.map((expense) => (
                <ExpenseItem
                    title={expense.title}
                    amount={expense.amount}
                    date={expense.date}
                />
            ))}
        </Card>
    );
}

export default Expenses; //Remember to export it, to make it useable outside of this file ++++++