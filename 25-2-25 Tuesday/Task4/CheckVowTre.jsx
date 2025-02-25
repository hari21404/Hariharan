import React from "react";
import ReactDOM from "react-dom/client";

function CheckVowTre({ text = "" }) {
  const hasVowel = /[aeiou]/i.test(text);

  return <p>{hasVowel ? "The string "+{text}+" contains vowels." : "The string "+{text}+" does not contain vowels."} </p>;
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckVowTre text="Hello" />);

export default CheckVowTre;
