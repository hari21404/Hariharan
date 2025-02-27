import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import Component1 from './Task/Component1.jsx'
import Component2 from './Task/Component2.jsx'
import Component3 from './Task/Component3.jsx'
import Component4 from './Task/Component4.jsx'
import Component5 from './Task/Component5.jsx'



createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App />
    <Component1 />
    <Component2 />
    <Component3 />
    <Component4  />
    <Component5  />
    
  </StrictMode>,
)
