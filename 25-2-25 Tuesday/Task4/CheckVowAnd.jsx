import React from "react";
import ReactDOM from "react-dom/client";

function CheckVowAnd({ text = "" }) {
  const hasVowel = /[aeiou]/i.test(text);

  return <p>The string {text} {hasVowel ||"does not"} contains vowels. </p>;
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckVowAnd text="Hello" />);

export default CheckVowAnd;
