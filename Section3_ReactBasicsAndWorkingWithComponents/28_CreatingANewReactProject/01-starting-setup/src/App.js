
/*
importing our custom componenet:

MUST start with capital. lowercase html tags  are read as standar html,
uppercase are read by react as custom components 
*/
//import ExpenseItem from './components/ExpenseItem'; //+++++++++ NOTE: NO .js extension
import Expenses from './components/Expenses'; //+++++++++ NOTE: NO .js extension

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
      <Expenses expenses={expenses} />
    </div>
  );
}

export default App;
