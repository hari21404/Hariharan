import React from "react";
import ReactDOM from "react-dom/client";

function CheckCard({ hasAadhar, hasPAN }) {
  return (
    <p>
      You have {hasAadhar || hasPAN ? (hasAadhar && hasPAN ? "both Aadhar and PAN cards." : hasAadhar ? "an Aadhar card." : "a PAN card.") : "neither Aadhar nor PAN card."}
    </p>
  );
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<CheckCard hasAadhar={true} hasPAN={false} />);

export default CheckCard;
