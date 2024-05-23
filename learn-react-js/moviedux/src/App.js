
import './App.css';
import './styles.css';

//import components:
import Header from './components/Header'; 
import Footer from './components/Footer';
import MoviesGrid from './components/MoviesGrid';

function App(){
  return(
    //contrainer class div below just sets a width for element within page 
    <div className="App">

      <div className='container'>
        <Header/>
        <MoviesGrid/>
      </div>

      <Footer/>

    </div>
  );
}

export default App;
