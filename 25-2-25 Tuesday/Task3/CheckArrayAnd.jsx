import React from "react";
import ReactDOM from "react-dom/client";

function CheckArrayAnd(props) {
  const arr = props.numbers || [];
  const length = arr.length;

return <p>The number of elements in the array {arr.length % 3 === 0 && "is"} {arr.length % 3 !== 0 && "is not"} a multiple of 3.</p>;

}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckArrayAnd numbers={[9, 4, 24]} />);

export default CheckArrayAnd;
