
/*
importing our custom componenet:

MUST start with capital. lowercase html tags  are read as standar html,
uppercase are read by react as custom components 
*/
import ExpenseItem from './components/ExpenseItem'; //+++++++++ NOTE: NO .js extension

function App() {

  const expenses = [ //list of objects for expenses:
    { id: 'e1', title: 'Toilet Paper', amount: 94.12, date: new Date(2020, 7, 14)},
    { id: 'e2', title: 'New TV', amount: 799.49, date: new Date(2021, 2, 12)},
    { id: 'e3', title: 'Car Insurance', amount: 294.67, date: new Date(2021, 2, 28)},
    { id: 'e4', title: 'New Desk (Wooden)', amount: 450, date: new Date(2021, 5, 12)},
  ];

  //setting properties for ExpenseItem components, using expenses array above: ++++++++
  return (
    <div>
      <h2>Let's get started dawg!</h2>
      <ExpenseItem title={expenses[0].title} amount={expenses[0].amount} date={expenses[0].date}></ExpenseItem>
      <ExpenseItem title={expenses[1].title} amount={expenses[1].amount} date={expenses[1].date}></ExpenseItem>
      <ExpenseItem title={expenses[2].title} amount={expenses[2].amount} date={expenses[2].date}></ExpenseItem>
      <ExpenseItem title={expenses[3].title} amount={expenses[3].amount} date={expenses[3].date}></ExpenseItem>
    </div>
  );
}

export default App;
