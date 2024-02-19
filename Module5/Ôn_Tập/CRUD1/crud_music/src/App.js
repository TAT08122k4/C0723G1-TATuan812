import logo from './logo.svg';
import {Link,NavLink,Route,Routes} from "react-router-dom"
import './App.css';
import { MusicList } from './components/MusicList';
import { FormCreate } from './components/AddNewMusic';
import { EditMusic } from './components/EditMusic';
import {toast,ToastContainer} from "react-toastify";

function App() {
  return (
    <div>
      <NavLink to="/">Home</NavLink>
      <NavLink to="/create">Create</NavLink>
   <Routes>
    <Route path='/' element={<MusicList />}></Route>
    <Route path='/create' element={<FormCreate />} ></Route>
    <Route path='update/:id' element={<EditMusic></EditMusic>}></Route>
   </Routes>
   <ToastContainer></ToastContainer>
  
    </div>

  );
}

export default App;
