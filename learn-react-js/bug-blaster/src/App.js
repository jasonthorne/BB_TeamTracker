
import './App.css';
import './styles.css';

import TicketForm from './components/TicketForm';
import ticketReducer from './reducers/ticketReducer';
import { useReducer } from 'react';
import TicketList from './components/TicketList';

function App() {

  //initial state consists of just empty tickets:
  const initialState = {tickets: [] };

  //register a reducer using an initial state  (obj with tiockets array) and our ticker teducer
  const [state, dispatch] = useReducer(ticketReducer, initialState);

  //ticketform is given a dispatch function equal to the dispatch fucntion defined in userReducer 
  return (
    <div className="App">
      <div className='container'>

        <h1>Bug Blaster</h1>
        <TicketForm dispatch = {dispatch}></TicketForm>

        { 
          //+++++++++++++++++
          //if we have tickets, THEN (this is used here asa THEN not an AND) show h2 tags:
          state.tickets.length>0 && (<h2>All Tickets</h2>)
        }

      </div>
    </div>
  );
}

export default App;
