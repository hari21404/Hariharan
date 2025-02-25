import React from 'react';
import ReactDOM from 'react-dom/client';

function StringlenAnd(prop)
{
    const isNum=(prop.text).length;
    return <p> The given number is {isNum%2==0 && "Even"} { isNum%2==1 && "Odd"}</p>
}
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<StringlenAnd text="HelloWorld" />);

export default StringlenAnd