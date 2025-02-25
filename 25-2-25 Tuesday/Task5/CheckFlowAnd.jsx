import React from "react";
import ReactDOM from "react-dom/client";

function CheckFlowerAnd({ name = "" }) {
  const flowers = ["Rose", "Jasmine", "Lotus"];
    return <p>{name} is {!(flowers.includes(name)) && "not"} a flower.</p>
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckFlowerAnd name="Rose" />); 
export default CheckFlowerAnd;
