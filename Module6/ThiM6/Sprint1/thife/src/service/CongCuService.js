import axios from "axios";

export const getAllCongCu = async (tenCongCu,idHsx,page) => {
    try {
        let rs = await axios.get(`http://localhost:8080/congCu/danhSach`)
      return rs.data
    } catch (error) {
        throw error.response
    }
}
export const addNewCongCu = async (congCu) =>{
    try {
       return await axios.post("http://localhost:8080/congCu/themMoi",congCu)
    } catch (error) {
        console.log(error);
        
    }

}
export const findById = async (id) =>{
    try {
     const res = await axios.get(`http://localhost:8080/congCu/${id}`)
    return res.data;
    } catch (error) {
        console.log(error);   
    }
}
export const muonCongCu = async (chiTietMuon) => {
    try {
        return await axios.post(`http://localhost:8080/chitiet/muon`,chiTietMuon)
    } catch (error) {
        throw error.data;
    
    }
}

export const getAllNhanVien = async () => {
    try {
        let rs = await axios.get(`http://localhost:8080/chitiet/nhanVien`)
      return rs.data
    } catch (error) {
        throw error.response
    }
}