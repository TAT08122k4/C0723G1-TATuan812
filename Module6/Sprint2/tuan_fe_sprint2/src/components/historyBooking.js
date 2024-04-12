import { FooterBook } from "./Footer";
import { HeaderBook } from "./Header";
import { HeaderBookIsLogin } from "./HeaderIsLogin";
import "../styles/table.css"
import { useEffect, useState } from "react";
import { getHistoryBookingList } from "../service/CartService";
import { ToastContainer, toast } from 'react-toastify';
import SweetAlert from "sweetalert";
import { Link, useNavigate , useLocation , useParams } from "react-router-dom"; 
import ReactPaginate from "react-paginate";
import {ErrorMessage, Field, Form, Formik} from "formik";

import * as Yup from 'yup';





export function DisplayHistoryBooking() {
  const isLogin = localStorage.getItem("isLogin");
  const [historyBookingList,setHistoryBookingList] = useState([])
  const location = useLocation();
  const [currentPage,setCurrentPage] = useState(0);
  const [startDay, setStartDay] = useState("2024-04-01");
    const [endDay, setEndDay] = useState("2024-04-15");
	const [nameBook,setNameBook] = useState("");
	const [idAccount,setIdAccount] = useState(localStorage.getItem("idAccount"));
	const [totalPages , setTotalPages] = useState(0);
	const [reload,setReload] = useState(false);
	const [checkPayment,setCheckPayment] = useState(location.state ?.data || "");


  useEffect (( ) => {
	const historyListBooking = async (page,id,nameBook,startDay,endDay) => {
		try {
			const rs = await getHistoryBookingList(page,id,nameBook,startDay,endDay);
			console.log(rs);
			setHistoryBookingList(rs.content);
			setTotalPages(rs.totalPages)
			document.title = "HistoryBooking"
			if(checkPayment == "OK"){
				setCheckPayment("");
				await SweetAlert(
				  "Thanh Toán Thành Công",
				  `Vui Lòng Check Kĩ Lại Thông Tin Hàng Bạn Đã Đặt`,
				  "success"
			  );}
			  if(checkPayment == "NO"){
				setCheckPayment("");
				await SweetAlert(
				  "Thanh Toán Không Thành Công",
				  `Vui Lòng Check Kĩ Lại Thông Tin Hàng Bạn Đã Đặt`,
				  "errors"
			  );
			  } 
		} catch (error) {
			console.log(error);
			
		}
	}
	historyListBooking(currentPage,idAccount,nameBook,startDay,endDay);
  },[currentPage,idAccount,reload])
  const handleChangeStartDay = (event) => {
	setStartDay(event)

  }
  const handleChangeEndDay = (event) => {
	setEndDay(event)
  }
  const handleChangeNameBook = (event) => {
	setNameBook(event)
  }
  const today = new Date();
  const  handlePageClick = async (event) =>{
    try {
      const pageNumber = event.selected;
      setCurrentPage(pageNumber);
      const result = await getHistoryBookingList(pageNumber,idAccount,nameBook,startDay,endDay);
      setTotalPages(result.totalPages);
      setCurrentPage(result.currentPage);    
    } catch (error) {
      console.log(error);
      
    }
  }
  function formatNumber(number) {
    return number.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
}


return (
    <>
       {isLogin ? (
        <HeaderBookIsLogin></HeaderBookIsLogin>
      ) : (
        <HeaderBook></HeaderBook>
      )}
    <div className="container rounded mt-5 mb-5">
    <h1 style={{color :"#566787"}}>Lịch Sử Đặt Hàng Của Bạn</h1>
<Formik enableReinitialize={true} initialValues={{
	nameBook : nameBook,
	startDay : startDay,
	endDay : endDay,
}} validationSchema={Yup.object({
	startDay : Yup.date().required("Vui lòng không để trống ngày bắt đầu").max(today,"Ngày Bắt Đầu Không Được Lớn Hơn Ngày Hôm Nay").max(Yup.ref('endDay'),"Ngày bắt đầu không thể sau ngày kết thúc"),
	endDay : Yup.date()
})}
onSubmit={(values) => {
	const submitValue = async () => {
		setStartDay(values.startDay);
		setEndDay(values.endDay);
		setReload(!reload)
	};
	submitValue();
}}>

{({handleSubmit}) => (
   <form onSubmit={handleSubmit}>
   <div className="d-flex">
	   <table className="containerTable2">
		   <tbody>
		   <tr>
			   <td style={{fontWeight: "normal" , width : "6%"}}>
				   <label htmlFor="startDay">
					   Từ ngày
				   </label>
			   </td>
			   <td style={{paddingLeft: "30px"}}>
				   <Field
					   className="form-control"
					   type="date"
					   id="startDay"
					   name="startDay"
					//    onChange={(event) => handleChangeStartDay(event.target.value)}
				   />
                 <div style={{color: 'red'}}><ErrorMessage  name="startDay" /></div>

			   </td>
			   <td style={{paddingLeft: "30px"}}>
				   <label htmlFor="endDay">
					   Đến ngày:{" "}
				   </label>
			   </td>
			   <td style={{paddingLeft: "30px"}}>
				   <Field
					   className="form-control"
					   type="date"
					   id="endDay"
					   name="endDay"
					//    onChange={(event) => handleChangeEndDay(event.target.value) }
				   />
			   </td>
			   <td style={{paddingLeft: "30px"}}>
				   <label htmlFor="nameBook">
					   Tên Sách:{" "}
				   </label>
			   </td>
			   <td style={{paddingLeft: "30px"}}>
				   <Field
					   className="form-control"
					   type="text"
					   id="nameBook"
					   name="nameBook"
					   value={nameBook}
					   onChange={(event) => handleChangeNameBook(event.target.value)}
				   />
			   </td>
			   <td style={{paddingLeft: "30px"}}>
				   <button
					   className="btn__add" style={{width: "100%"}}

					   type="submit"
				   >
					   Tìm kiếm
				   </button>
			   </td>
		   </tr>
		   </tbody>
	   </table>
   </div>
</form>

)}

</Formik>

<table className="containerTable">
	<thead>
		<tr>
			<th><h1>Tên Sách </h1></th>
			<th><h1>Tên Tác Giả</h1></th>
			<th><h1>Thể Loại</h1></th>
			<th><h1>Giá Tiền</h1></th>
			<th><h1>Số lượng Đã Mua</h1></th>
			<th><h1>Số Tiền Thanh Toán</h1></th>
			<th><h1>Trạng Thái Thanh Toán</h1></th>
			<th><h1>Ngày Mua</h1></th>
		</tr>
	</thead>
	<tbody>
    {
		historyBookingList ? (historyBookingList.map((booking,index) => (
			<tr>
			<td>{booking.nameBook}</td>
			<td>{booking.nameAuthor}</td>
			<td>{booking.nameGenre}</td>
			<td>{formatNumber(booking.price)}đ</td>
			<td>{booking.quantity}</td>
			<td>{formatNumber(booking.price * booking.quantity)}đ</td>
			<td>
			{booking.modeOfPayment === 1 ? (
    "Đã Thanh Toán Online"
  ) : (
    "Nhận Hàng Rồi Mới Thanh Toán"
  )}
				<td>
 
</td>
</td>
			<td>{booking.buyDate}</td>
		</tr>
		))) : (
			<h3>Bạn chưa có đơn hàng nào</h3>
		)
	}
		
	</tbody>
</table>
<div style={{marginLeft: "43%", marginTop: "1%"}}>
<ReactPaginate 
                          forcePage={currentPage}
                          breakLabel="..."
                          nextLabel="Trang Sau"
                          onPageChange={handlePageClick}
                          pageRangeDisplayed={2}
                          marginPagesDisplayed={2}
                          pageCount={totalPages}
                          previousLabel="Trang Trước"
                          pageClassName="page-item"
                          pageLinkClassName="page-link"
                          previousClassName="page-item"
                          previousLinkClassName="page-link"
                          nextClassName="page-item"
                          nextLinkClassName="page-link"
                          breakClassName="page-item"
                          breakLinkClassName="page-link"
                          containerClassName="pagination"
                          activeClassName="active"
                      />
</div>
    </div>
    <FooterBook></FooterBook>
    
    </>
)
    
}