
import './App.css';
import './styles.css';
import Header from './components/Header'; //import header component
import Footer from './components/Footer'; //import footer component

function App() {
  return (
    //contrainer class div below just sets a width for element within page 
    <div className="App">

      <div className='container'>
        <Header/>
      </div>

      <Footer/>

    </div>
  );
}

export default App;
