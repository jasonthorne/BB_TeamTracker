
/*
importing our custom componenet:

MUST start with capital. lowercase html tags  are read as standar html,
uppercase are read by react as custom components 
*/

import Expenses from './components/Expenses/Expenses'; //+++++++++ NOTE: NO .js extension
import NewExpense from './components/NewExpense/NewExpense'; 
import React, {useState} from 'react'; //import useState, for updasting state whenever a new expense is added to expenses

const INITIAL_EXPENSES = [ //list of objects for expenses:
    { id: 'e1', title: 'Toilet Paper', amount: 94.12, date: new Date(2020, 7, 14)},
    { id: 'e2', title: 'New TV', amount: 799.49, date: new Date(2021, 2, 12)},
    { id: 'e3', title: 'Car Insurance', amount: 294.67, date: new Date(2021, 2, 28)},
    { id: 'e4', title: 'New Desk (Wooden)', amount: 450, date: new Date(2021, 5, 12)},
  ];

const App = () => { // alternative function ++++++++++++ (arrow function)

  //call useState, passing initial lexpenses as an inital state value:
  const [expenses, setExpenses] = useState(INITIAL_EXPENSES);


  //passed to NewExpense child component and recieves fcrokm it a new expense: 
  const addExpenseHandler = (expense) =>{
    console.log(expense);
    //update expenses with new expense:
    //use anon funct to return new array holding expense as first item, and use spread opperator to add the other prev expense list items to follow it
    //++++++++++++IMPORTANT: Passing the anonfunction ensures an older snapshot of the data is being passed, preventing any issues with the live data being changed elsewhere (as setExpenses isnt always processed instantly)
    setExpenses(previousExpenses => {
      return [expense, ...previousExpenses];
    });

  };

  //setting properties for Expenses component, using expenses array above: ++++++++
  // setting onAddExpense property as the 'addExpenseHandler' function called 'onAddExpense'
  return (
    <div>
      <NewExpense onAddExpense={addExpenseHandler} />
      <Expenses expenses={expenses} />
    </div>
  );
}

export default App;
