import logo from './logo.svg';
import './App.css';
import Demo from './components/Demo';
import DisplayStudent from './components/Ss2SinhVien';
import DisplayFormLogin from './components/formLogin';

function App() {
  
  return (
    // <div className="App">
    // <Demo></Demo>
    // </div>
    // ss2 Sinh Viên
    // <div>
    //   <table>
    //     <DisplayStudent />
    //   </table>
    // </div>

  // ss2 form login
   <div>
    <DisplayFormLogin></DisplayFormLogin>
   </div>
  );
}

export default App;
