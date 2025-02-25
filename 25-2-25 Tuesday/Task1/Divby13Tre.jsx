import React from 'react';
import ReactDOM from 'react-dom/client';

function Divby13Tre(props)
{
    const isNum=props.num;
   
    return <h1>The number is{isNum % 13 === 0 ? "":" not"} divisible by 13</h1>;
  
}
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<Divby13Tre num={26} />);
export default Divby13Tre