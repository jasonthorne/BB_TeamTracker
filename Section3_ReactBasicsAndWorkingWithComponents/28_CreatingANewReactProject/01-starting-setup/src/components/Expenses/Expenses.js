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





    return (
        <Card className='expenses'>
            <ExpensesFilter selected={selectedYear} onFilterChange={filterChangeHandler}/>
            <ExpenseItem title={props.expenses[0].title} amount={props.expenses[0].amount} date={props.expenses[0].date} />
            <ExpenseItem title={props.expenses[1].title} amount={props.expenses[1].amount} date={props.expenses[1].date} />
            <ExpenseItem title={props.expenses[2].title} amount={props.expenses[2].amount} date={props.expenses[2].date} />
            <ExpenseItem title={props.expenses[3].title} amount={props.expenses[3].amount} date={props.expenses[3].date} />
        </Card>
    );
}

export default Expenses; //Remember to export it, to make it useable outside of this file ++++++