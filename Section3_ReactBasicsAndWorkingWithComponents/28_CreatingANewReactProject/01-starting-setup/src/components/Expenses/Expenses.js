//imports:
import './Expenses.css'; //add stylesheet for this component's jsx
import ExpenseItem from './ExpenseItem'; //import ExpenseDate component
import Card from '../UI/Card';
import ExpensesFilter from './ExpensesFilter';

function Expenses(props){


    const filterYearHandler = (year) =>{
        //console.log("in app.js");
        console.log("year is: ", year);
      };





    return (
        <Card className='expenses'>
            <ExpensesFilter onSelectYear={filterYearHandler}/>
            <ExpenseItem title={props.expenses[0].title} amount={props.expenses[0].amount} date={props.expenses[0].date} />
            <ExpenseItem title={props.expenses[1].title} amount={props.expenses[1].amount} date={props.expenses[1].date} />
            <ExpenseItem title={props.expenses[2].title} amount={props.expenses[2].amount} date={props.expenses[2].date} />
            <ExpenseItem title={props.expenses[3].title} amount={props.expenses[3].amount} date={props.expenses[3].date} />
        </Card>
    );
}

export default Expenses; //Remember to export it, to make it useable outside of this file ++++++