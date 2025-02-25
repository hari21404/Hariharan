import React from 'react';
import ReactDOM from 'react-dom/client';

function Divby13if(props)
{
    const isNum=props.num;
    
  if (isNum % 13 === 0) {
    return <h1>The number {isNum} is divisible by 13</h1>;
  }
  return <h1>The number {isNum} is not divisible by 13</h1>;
}
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<Divby13if num={26} />);
export default Divby13if