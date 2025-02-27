import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
//import App from './App.jsx'
import C1 from './C1.jsx'



createRoot(document.getElementById('root')).render(
  <StrictMode>
    
    <C1 />
    
  </StrictMode>,
)
