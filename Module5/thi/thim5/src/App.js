import logo from './logo.svg';
import './App.css';
import {toast,ToastContainer} from "react-toastify";
import {Link,NavLink,Route,Routes} from "react-router-dom"
import {DisplayProduct} from './components/ProductList.js' 
import {EditProduct} from './components/UpdateProduct.js' 
import { AddNewProduct } from './components/CreateProduct.js';


function App() {
  return (
    <div>
         <NavLink to="/">Trang Chủ</NavLink> 

         <NavLink to="/create">Tạo Mới Sản Phẩm</NavLink>
   <Routes>
    <Route path='/' element={<DisplayProduct/>}></Route>
    <Route path='update/:id' element={<EditProduct/>}></Route>
    <Route path='/create' element={<AddNewProduct/>}></Route>
   </Routes>
   <ToastContainer></ToastContainer>
    </div>
  );
}

export default App;
