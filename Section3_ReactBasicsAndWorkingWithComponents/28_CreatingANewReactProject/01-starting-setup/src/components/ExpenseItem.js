
import './ExpenseItem.css'; //add stylesheet for this component's jsx

/*
A component is just a function, returning JSX html code 
*/

/*react passes ONE param (props) as an arg when passing propoerites to a component +++++++++
This is an object holding all of the recieved attributes as properties. 
*/
function ExpenseItem(props){ //convention is to repeat the filename
    const month = props.date.toLocaleString('en-US', { month: 'long'});
    const day = props.date.toLocaleString('en-US', { day: '2-digit'});
    const year = props.date.getFullYear();
    
    return (
        <div className='expense-item'> 
            <div>
                <div>{month}</div>
                <div>{year}</div>
                <div>{day}</div>
            </div>
            <div className='expense-item__description'>
                <h2>{props.title}</h2>
            </div>
            <div className='expense-item__price'>${props.amount}</div>
        </div>
    );
} 
// NOTE that ONE root html element must be returned (div in this case)
// NOTE 'className' instead of 'class' for adding css stling 
// NOTE props.something has to equal the name given to componment attribute in App.js


//++++++++++++++ REMEMBER - function neeeds exported - THEN imported in another file to use: 
export default ExpenseItem; //export this function as the 'default' for this file