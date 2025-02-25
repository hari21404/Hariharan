import React from "react";
import ReactDOM from "react-dom/client";

function CheckArrayTre(props) {
  const arr = props.numbers || [];
  const length = arr.length;
  const condition=(length % 3 === 0)
  
  return <p>The number of elements in the array {arr.length % 3 === 0 ? "is" : "is not"} a multiple of 3.</p>;

}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckArrayTre numbers={[9, 4, 24]} />);

export default CheckArrayTre;
