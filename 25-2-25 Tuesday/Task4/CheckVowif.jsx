import React from "react";
import ReactDOM from "react-dom/client";

function CheckVowif({ text = "" }) {
  const hasVowel = /[aeiou]/i.test(text);
  if(hasVowel)
  {
    return <p>The string {text} contains vowels.</p>
  }

  return <p>The string {text} does not contain vowels. </p>;
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckVowif text="Hello" />);

export default CheckVowif;
