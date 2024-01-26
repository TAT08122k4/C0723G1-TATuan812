import logo from './logo.svg';
import './App.css';
import Demo from './components/Demo';
import DisplayStudent from './components/Ss2SinhVien';
import DisplayFormLogin from './components/formLogin';
import { ListStudent } from './components/Ss3Student';
import { Todo } from './components/Todo';

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
    <Todo></Todo>
  </div>
  );
}

export default App;
