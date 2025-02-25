import React from 'react';
import ReactDOM from 'react-dom/client';

function StringlenTre(prop)
{
    const isNum=(prop.text).length;
    return  <p>The given number is {isNum%2==0?"Even":"Odd"}</p>
    
}
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<StringlenTre text="HelloWorld" />);

export default StringlenTre