import logo from './logo.svg';
import {Route, Routes} from "react-router-dom";
import './App.css';
import { HomePage } from './components/Home';
import { LoginAccount } from './components/Login';
import { RegisterAccount } from './components/Register';
import { CartBook } from './components/Cart';
import { DetailOfBook } from './components/DetailBook';
import { ManageDetailAccount } from './components/DetailAccount';
import { ManagerAdmin } from './components/Admin';

function App() {
  return (
  <>
  <Routes>
   <Route path='/home' element={<HomePage></HomePage>}></Route>
   <Route path='/login' element={<LoginAccount></LoginAccount>}></Route>
   <Route path='/register' element={<RegisterAccount></RegisterAccount>}></Route>
   <Route path='/cart' element={<CartBook></CartBook>}></Route>
   <Route path='/book/:id' element={<DetailOfBook></DetailOfBook>}></Route>
   <Route path='/account/:id' element={<ManageDetailAccount></ManageDetailAccount>}></Route>
   <Route path='/admin' element={<ManagerAdmin></ManagerAdmin>}></Route>
  </Routes>
  </>
  );
}

export default App;
