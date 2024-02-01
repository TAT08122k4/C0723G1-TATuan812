import logo from './logo.svg';
import './App.css';
import {Link,NavLink,Route,Routes} from "react-router-dom"
import Demo from './components/Demo';
import DisplayStudent from './components/Ss2SinhVien';
import DisplayFormLogin from './components/formLogin';
import { ListStudent } from './components/Ss3Student';
import { Todo } from './components/Todo';
import { Counter } from './components/Ss4ComponentCounter';
import { FormLienHe } from './components/Ss5FormLienHe';
import { FormYTe } from './components/Ss5FormYTe';
import { TodoList } from './components/Ss7TodoList';
import { CrudBook } from './components/Ss7CrudBook';
import { FormCreate } from './components/Ss7CrudBook2';
import {toast,ToastContainer} from "react-toastify";



function App() {
  
  return (
    // <div className="App">
    // <Demo></Demo>
    // </div>
    // ss2 Sinh Viên
    // <div>
    //   <table>
    //     <thead>
    //       <th>
    //         Tên Công Ty :
    //       </th>
    //       <th>
    //          Hợp Đồng :
    //       </th>
    //       <th>
    //          Đất Nước :
    //       </th>
    //     </thead>
    //     <DisplayStudent />
    //   </table>
    // </div>
  // ss2 form login
  //  <div>
  //   <DisplayFormLogin></DisplayFormLogin>
  //  </div>
  // ss3 Hiển thị list sinh viên
  // <div>
  //   <table>
  //   <table>
  //       <thead>
  //         <th>
  //           Id :
  //         </th>
  //         <th>
  //           Name :
  //         </th>
  //         <th>
  //            Age :
  //         </th>
  //         <th>
  //            Address :
  //         </th>
  //       </thead>
  //       <ListStudent />
  //     </table>
  //   </table>
  // </div>
  // ss3 Todo List
  <div>
    {/* <Todo>  </Todo> */}
    {/* ss4 Bài Đếm */}
    {/* <Counter></Counter> */}
    {/* <FormLienHe></FormLienHe> */}
    {/* <FormYTe> </FormYTe> */}
     {/* ss6 toDoList */}
     {/* <TodoList></TodoList> */}
   <NavLink to="/">Home</NavLink>
   <NavLink to="/create" className='ms-2'>Create</NavLink>

   <Routes>
    <Route path='/' element={<CrudBook />}></Route>
    <Route path='/create' element={<FormCreate></FormCreate>}></Route>
   </Routes>
   <ToastContainer></ToastContainer>
  
    
  </div>

  
  );
}

export default App;
