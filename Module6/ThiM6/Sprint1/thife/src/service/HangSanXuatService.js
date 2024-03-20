import axios from "axios";

export const getAllhangSanXuat = async () => {
    try {
        let rs = await axios.get(`http://localhost:8080/hangsanxuat/danhSach`)
      return rs.data
    } catch (error) {
        throw error.response
    }
}