import React from "react";
import ReactDOM from "react-dom/client";

function CheckFlowerif({ name = "" }) {
  const flowers = ["Rose", "Jasmine", "Lotus"];
 
    if(flowers.includes(name))
        { return <p>{name}  is a flower.</p>;}
    return <p>{name}  is not a flower.</p>;    
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckFlowerif name="Rose" />); 
export default CheckFlowerif;
