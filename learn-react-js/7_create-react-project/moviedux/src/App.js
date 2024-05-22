
import './App.css';
import './styles.css';
import Header from './components/Header' //import header component

function App() {
  return (
    //contrainer class div below just sets a width for element within page 
    <div className="App">


      <div className='container'>
        <Header></Header>
      </div>

      
      <footer className="footer">
        <p className="footer">Footer content be here</p>
      </footer>
    </div>
  );
}

export default App;
