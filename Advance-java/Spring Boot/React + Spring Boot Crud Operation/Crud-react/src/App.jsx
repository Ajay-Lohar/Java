import './App.css'
import { BrowserRouter,Routes ,Route, Link } from 'react-router-dom'  
import AddStudent from './componants/AddStudent'
import ViewStudent from './componants/ViewStudent'
import Home from './componants/Home'

function App() {

  return (
    <>
   
  <BrowserRouter>
  <Routes>
    <Route path="/"  element={<Home />}  />  {/* Default route */}
    <Route path="/AddStudent"  element={<AddStudent />}  />
    <Route path="/ViewStudents" element={<ViewStudent />} />
  </Routes>
  </BrowserRouter>
    </>
  )
}

export default App
