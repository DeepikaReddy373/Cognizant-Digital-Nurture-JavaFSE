import { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello! Member1");
  }

  function increase() {
    increment();
    sayHello();
  }

  function welcome(msg) {
    alert(msg);
  }

  function clicked() {
    alert("I was clicked");
  }

  return (
    <div style={{ margin: "20px" }}>

      <h2>{count}</h2>

      <button onClick={increase}>Increment</button>
      <br /><br />

      <button onClick={decrement}>Decrement</button>
      <br /><br />

      <button onClick={() => welcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={clicked}>
        Click on me
      </button>

      <hr />

      <CurrencyConvertor />

    </div>
  );
}

export default App;