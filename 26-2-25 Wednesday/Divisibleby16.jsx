import React from "react";
import ReactDOM from "react-dom/client";

function Divisibleby16(props)
{
    const isNum=props.num

    if(isNum%16==0)
    {
        return <p>{isNum} is divisible by 16</p>
    }
    else
    {
        return <p>{isNum} is not divisible by 16</p>
    }
}


const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<Divisibleby16 num={32} />);

export default Divisibleby16