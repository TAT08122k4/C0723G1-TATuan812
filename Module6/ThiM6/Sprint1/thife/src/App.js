import logo from './logo.svg';
import {NavLink, Route, Routes} from "react-router-dom";
import './App.css';
import { CongCuList } from './components/DanhSachCongCu';
import { TaoMoi } from './components/TaoMoiCongCu';
import { MuonCongCu1 } from './components/MuonCongCu';

function App() {
  return (
   <>
   <NavLink to="/">
  Danh Sách
   </NavLink> 

  
   <NavLink to="/taomoi">
  Tạo Mới
   </NavLink>
   <Routes>
   <Route path='/' element={<CongCuList/>}> </Route>
   <Route path='/taomoi' element={<TaoMoi/>}> </Route>
   <Route path='/muon/:id' element={<MuonCongCu1/>}></Route>
   </Routes>
   </>
  );
}

export default App;
