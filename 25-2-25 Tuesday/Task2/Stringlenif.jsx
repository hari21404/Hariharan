import React from 'react';
import ReactDOM from 'react-dom/client';

function Stringlenif(prop)
{
    const isNum=(prop.text).length;
    if((isNum%2)==0)
    { return <div><p>{prop.text} is EvenNumber</p> </div>;}
    return <div><p>{prop.text} length is odd</p></div>;
}
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<Stringlenif text="HelloWorld" />);

export default Stringlenif