import { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { getAllCongCu } from "../service/CongCuService";
import ReactPaginate from "react-paginate";


export function CongCuList(){
    const [congCus,setCongCus] = useState([]);
    const [searchName ,setSearchName] = useState("");
    const [totalPages, setTotalPages] = useState(0);
  const [currentPage, setCurrentPage] = useState(0);
  const [tenCongCu , setTenCongCu] = useState("");
  const [idHsx , setIdHsx] = useState (0);
    useEffect(() =>{
        const hienThi = async () =>{
            try {
                const result = await getAllCongCu()
                console.log(congCus);
                console.log(result);
                setCongCus(result);
                document.title = "Danh sách Công Cụ";
            } catch (error) {
                console.log(error);
            }
        }
        hienThi();
    }, []);
    const handleSearchName = (value) => {
        setTenCongCu(value);
      };
      const submitSearch = async () => {
        try {
          let res = await getAllCongCu( tenCongCu,idHsx,0);
          setCongCus(res);
          setTotalPages(res.totalPages);
          setCurrentPage(0);
          console.log(congCus);
        } catch (e) {
          console.log(e);
        }
      };
    const handlePageClick = async (event) => {
        try {
            const pageNumber = event.selected;
            setCurrentPage(pageNumber)
            const res = await getAllCongCu(tenCongCu,idHsx,0)
            setCongCus(res)
            setTotalPages(res.totalPages);
        } catch (error) {
            console.log(error);
        }
    }
    return (
        <>
        <table>
            <thead>
                <tr>
                <th>#</th>
                <th>Mã CCDC</th>
                <th>Tên CCDC</th>
                <th>Hãng sản xuất</th>
                <th>Đơn Vị</th>
                <th>Số Lượng</th>
                <th>Chức Năng</th>
                </tr>
            </thead>
            <tbody>
                {
                    congCus ? (
                        congCus.map((congcu,index) =>(
                            <tr key = {congcu.id}>
                                <td>{index + 1}</td>
                                <td>CCDC-{congcu.id}</td>
                                <td>{congcu.tenCongCu}</td>
                                <td>{congcu.hangSanXuat.tenHangSanXuat}</td>
                                <td>{congcu.donVi}</td>
                                <td>{congcu.soLuong}</td>
                                <td><Link to={'/muon/' + congcu.id}>
                                <button>Mượn</button>
                                </Link></td>
                            </tr>
                        ))
                    ) : (<tr>
                        <td colSpan="7">Không Tìm Thấy Dữ Liệu</td>
                    </tr>)}
            </tbody>
        </table>
        </>
    )
}

