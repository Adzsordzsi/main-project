import './App.css';
import {Menu, MenuItem} from "@mui/material";
import {useEffect, useState} from "react";

function App() {
  const [count, setCount] = useState("");

  useEffect( () => {  fetch('http://localhost:8080/')
      .then(response => response.json())
      .then(data => setCount(data));}, [])


  console.log('data: ',count)

  return (
    <div className="App">

      <Menu open={true}>
        <MenuItem>{count.first}</MenuItem>
        <MenuItem>{count.second}</MenuItem>
      </Menu>
    </div>
  );
}

export default App;
