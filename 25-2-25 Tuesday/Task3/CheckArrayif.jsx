import React from "react";
import ReactDOM from "react-dom/client";

function CheckArrayif(props) {
  const arr = props.numbers || [];
  const length = arr.length;

  if (length % 3 === 0) {
    return <p>The number of elements in the array is a multiple of 3.</p>;
  }
  return <p>The number of elements in the array is not a multiple of 3.</p>;
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckArrayif numbers={[9, 4, 24]} />);

export default CheckArrayif;
