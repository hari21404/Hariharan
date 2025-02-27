import React, { Suspense, lazy } from "react";
import C5 from "../../C5"; // Static Import

const C3 = lazy(() => import("./C3")); // Dynamic Import
const C4 = lazy(() => import("../../C4")); // Dynamic Import

function C2() {
  return (
    <div>
      <h2>C2</h2>
      <Suspense fallback={<p>Loading C3...</p>}>
        <C3 />
      </Suspense>

      <Suspense fallback={<p>Loading C4...</p>}>
        <C4 />
      </Suspense>

      <C5 />
    </div>
  );
}

export default C2;
