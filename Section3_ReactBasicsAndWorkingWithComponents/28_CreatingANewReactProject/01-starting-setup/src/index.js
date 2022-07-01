import ReactDOM from 'react-dom/client';

import './index.css';
import App from './App'; //this is App.js - you omit the .js - only OTHER file types get referenced like.css above 

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App />);
