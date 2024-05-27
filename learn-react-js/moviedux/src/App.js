
import './App.css';
import './styles.css';

//import components:
import Header from './components/Header'; 
import Footer from './components/Footer';
import MoviesGrid from './components/MoviesGrid';
import Watchlist from './components/Watchlist';
//router contains routes (a collection of single routes), link is like an A tag
import { BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom'; //import router ++++++++

function App(){
  return(
    //'contrainer' class div below just sets a width for element within page

    /*ROUTING:

    + A router contains routes.
    + routes contain one or more route
    + rout has a path to direct to ("/" is for home) 
    and an element to show on that path (a component in examples below)
    so:
    <Route path="/" element={<MoviesGrid/>}></Route> 
    means: on home page, show MoviesGrid component.
    + Link tag to="" links user to the route path with the given component

    */
    <div className="App">

      <div className='container'>
        <Header/>

        <Router>
          <nav>
            <ul>
              <li>
                <Link to="/">Home</Link>
              </li>
              <li>
                <Link to="/watchlist">Watchlist</Link>
              </li>
            </ul>
          </nav>

          <Routes>
            <Route path="/" element={<MoviesGrid/>}></Route>
            <Route path="/watchlist" element={<Watchlist/>}></Route> 
          </Routes>
        </Router>

      </div>

      <Footer/>

    </div>
  );
}

export default App;
