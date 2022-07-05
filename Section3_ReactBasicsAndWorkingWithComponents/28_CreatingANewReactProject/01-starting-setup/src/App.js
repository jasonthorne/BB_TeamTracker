
/*
importing our custom componenet:

MUST start with capital. lowercase html tags  are read as standar html,
uppercase are read by react as custom components 
*/
import ExpenseItem from './components/ExpenseItem'; //+++++++++ NOTE: NO .js extension

function App() {
  return (
    <div>
      <h2>Let's get started dawg!</h2>
      <ExpenseItem></ExpenseItem>
    </div>
  );
}

export default App;
