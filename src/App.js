import logo from './logo.svg';
import './App.css';
import { BrowserRouter } from "react-router-dom";
import ListNumbersComponent from './Components/ListNumbersComponent';

function App() {
  return (
      <div className="container">
          <ListNumbersComponent/>
      </div>
  );
}

export default App;
