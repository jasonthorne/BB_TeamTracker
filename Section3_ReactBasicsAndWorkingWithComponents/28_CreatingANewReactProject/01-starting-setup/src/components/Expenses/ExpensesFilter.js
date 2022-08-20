
import './ExpensesFilter.css';


/*++++++++++++++++IMPORTANT:+++++++++++++

This is a CONTROLLED component. As its parent component (Expenses) deals with its value and changes to its value
These are mearley passed to it by props: selected={selectedYear} and  onFilterChange={filterChangeHandler}

*/

const ExpensesFilter = (props) => {

  const yearChangeHandler = (event) =>{ //handle change in year
    /////console.log(event.target.value);
    ///setSelectedYear(event.target.value);

    props.onFilterChange(event.target.value); //call method passed as prop, passing selected year
  };

  //++++++++++Note the 2 way binding here, of setting selected value as props.selected
  return (
    <div className='expenses-filter'>
      <div className='expenses-filter__control'>
        <label>Filter by year</label>
        <select value={props.selected} onChange={yearChangeHandler}>
          <option value='2022'>2022</option>
          <option value='2021'>2021</option>
          <option value='2020'>2020</option>
          <option value='2019'>2019</option>
        </select>
      </div>
    </div>
  );
};

export default ExpensesFilter;