import "../styles/DetailAccount.css";
import { HeaderBook } from "./Header";
import { HeaderBookIsLogin } from "./HeaderIsLogin";
import SweetAlert from "sweetalert";
import * as Yup from "yup";
import { ErrorMessage, Field, Form, Formik } from "formik";
import { useEffect, useState } from "react";
import { editAccount, getAccount } from "../service/AccountService";
import {getDownloadURL, ref, uploadBytes} from 'firebase/storage'
import {v4} from "uuid";
import {imageDb, storage} from '../config/FirebaseUpload';
export function ManageDetailAccount() {
    const [img,setImg] =useState(null)
    const [imgUrl,setImgUrl] =useState([])
  const isLogin = localStorage.getItem("isLogin");
  var idUser = localStorage.getItem("idAccount");
  const [account , setAccount] = useState({})
const editInforAccount = async (values,{setErrors}) => {
  try {
    const result = await editAccount(values,idUser);
    await SweetAlert(
      "Sửa Thông Tin Thành Công",
      `Bạn đã thay đổi thông tin tài khoản thành công`,
      "success"
    );
  } catch (error) {
    setErrors(error.data)
    await SweetAlert(
        "Sửa Thông Tin Thất Bại!",
        `Vui lòng kiểm tra kỹ lại thông tin!`,
        "error"
    );
    
  }
}




  const handleClick = async () => {
    try {
        // Tạo reference tới vị trí lưu trữ ảnh trên Firebase Storage
        const imageRef = ref(imageDb, `files/${v4()}`);

        // Tải lên ảnh lên Firebase Storage
        await uploadBytes(imageRef, img);

        // Lấy URL của ảnh sau khi tải lên thành công
        const imageUrl = await getDownloadURL(imageRef);
       
        
        // Lưu URL vào state hoặc thực hiện các thao tác khác với URL
        setImgUrl([...imgUrl, imageUrl]);
        console.log(imageUrl);
        setImg(imageUrl)
        
        // In URL của ảnh ra console
        console.log('URL của ảnh:', imageUrl);
        console.log(img);
        account.avatarUser = img;
        console.log(account.avatarUser);
    } catch (error) {
        console.error('Lỗi khi tải lên ảnh:', error);
    }
}
  useEffect(() => {
    const manageAccount = async (id) => {
        try {
            const rs = await getAccount(id);
            setAccount(rs);
        } catch (error) {
            
        }
    }
    manageAccount(idUser)
    
  },[])

  const today = new Date();
  const minAgeDate = new Date(today.getFullYear() - 16, today.getMonth(), today.getDate());
  const initValues = {
    id : account.id,
    avatarUser : img || account.avatarUser,
    accountName: account.accountName,
    fullName: account.fullName,
    idCard: account.idCard,
    birthday: account.birthday,
    phoneNumber: account.phoneNumber,
    gender: account.gender,
    email: account.email,
    address: account.address,
    password : account.password,
}
const validateObject = {
   
  
      phoneNumber: Yup.string().required("Số Điện Thoại không được để rỗng").matches("^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$", "Số điện thoại vui lòng nhập đúng định dạng"),
      email: Yup.string()
          .required("Email Không được để rỗng")
          .matches(/^[\w\-.]+@([\w\-]+\.)+[\w\-]{2,}$/, "Email vui lòng nhập đúng định dạng"),
      address: Yup.string().required("Địa chỉ không được để rỗng"),
      birthday: Yup.date()
          .max(minAgeDate, "Bạn phải từ 16 tuổi trở lên để đăng ký!")
          .required("Ngày sinh không được để trống!")
  
  
  }
  const handleGenderChange = (e) => {
    setAccount({...account , gender: e})
    console.log(account.gender);
}

  

  return (
    <>
      {isLogin ? (
        <HeaderBookIsLogin></HeaderBookIsLogin>
      ) : (
        <HeaderBook></HeaderBook>
      )}
      <div className="container rounded bg-white mt-5 mb-5">
        <Formik enableReinitialize={true} initialValues={initValues} validationSchema={Yup.object(validateObject)}onSubmit={(values , {setErrors}) => editInforAccount(values,{setErrors}) }>
            {({isSubmitting,resetForm  }) => (
 <Form>


 <div className="row">
   <div className="col-md-3 border-right">
     <div className="d-flex flex-column align-items-center text-center p-3 py-5">
       <img
         className="rounded-circle mt-5"
         width="150px"
         src={img != null ? img : account.avatarUser}
       />
       <Field type="hidden" name="avatarUser"></Field>
       <Field type="hidden" name="id"></Field>
       <div className="App">
    <input type="file" onChange={(e) => setImg(e.target.files[0])}></input>
    <button type="button" onClick={handleClick}>Thay Đổi Ảnh</button>
       </div>

       
       <span className="font-weight-bold">{account.fullName}</span>
       <span className="text-black-50">{account.email}</span>
       <span> </span>
     </div>
   </div>
   <div className="col-md-5 border-right">
     <div className="p-3 py-5">
       <div className="d-flex justify-content-between align-items-center mb-3">
         <h4 className="text-right">Chỉnh Sửa Thông Tin Cá Nhân</h4>
       </div>
       <div className="row mt-2">
         <div className="col-md-6">
           <label className="labels">Tài Khoản</label>
           <Field
           disabled
             type="text"
             className="form-control"
             name="accountName"
           />
      <ErrorMessage  name="accountName" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
         </div>
         <div className="col-md-6">
           <label className="labels">Họ Và Tên</label>
           <Field
           disabled 
             type="text"
             className="form-control"
             name="fullName"
           />
           <Field
           
             type="hidden"
             className="form-control"
             name="password"
           />
           
      <ErrorMessage name="fullName" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
         </div>
       </div>
       <div className="row mt-3">
         <div className="col-md-12">
           <label className="labels">Số Điện Thoại</label>
           <Field
             type="text"
             className="form-control"
             name="phoneNumber"
           />
      <ErrorMessage name="phoneNumber" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
         </div>
         <div className="col-md-12">
           <label className="labels">Địa Chỉ</label>
           <Field
             type="text"
             className="form-control"
             name="address"
           />
      <ErrorMessage name="address" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
         </div>
         <div className="col-md-12">
           <label className="labels">CMND/CCCD</label>
           <Field
             type="text"
             className="form-control"
             name="idCard"
           />
      <ErrorMessage name="idCard" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
           
         </div>
         <div className="col-md-12">
           <label className="labels">Ngày Sinh</label>
           <Field
             type="date"
             className="form-control"
             name="birthday"
           />
         </div>
         <div className="col-md-12">
           <>
             <label className="labels">Giới Tính</label>
             <br></br>
             <div className="form-check form-check-inline">
               <Field
               checked={account.gender === true}
               onChange={() => handleGenderChange(true)}
                 className="form-check-input"
                 type="radio"
                 name="gender"
                 id="inlineRadio1"
               />
               <label
                 className="form-check-label"
                 htmlFor="inlineRadio1"
               >
                 Nam
               </label>
             </div>
             <div className="form-check form-check-inline">
               <Field
               checked={account.gender === false}
               onChange={() => handleGenderChange(false)}
                 className="form-check-input"
                 type="radio"
                 name="gender"
                 id="inlineRadio2"
               />
               <label
                 className="form-check-label"
                 htmlFor="inlineRadio2"
               >
                 Nữ
               </label>
             </div>
           </>
         </div>
       </div>
       <div className="mt-5 text-center">
         <button
           style={{ marginRight: "5px" }}
           className="btn btn-primary profile-button"
           type="submit"
         >
           Lưu
         </button>

         <button
           className="btn btn-primary profile-button"
           type="button"
           onClick={() => {
            resetForm();
           }}
         >
           Huỷ
         </button>
       </div>
     </div>
   </div>
 
 </div>
</Form>
            )}
         
        </Formik>
      </div>




        {/* <div className="col-md-4">
<div className="p-3 py-5">
<div className="d-flex justify-content-between align-items-center experience">
<span>Edit Experience</span>
<span className="border px-3 p-1 add-experience">
 <i className="fa fa-plus" />
 &nbsp;Experience
</span>
</div>
<br />
<div className="col-md-12">
<label className="labels">Experience in Designing</label>
<input
 type="text"
 className="form-control"
 placeholder="experience"
 defaultValue=""
/>
</div>{" "}
<br />
<div className="col-md-12">
<label className="labels">Additional Details</label>
<input
 type="text"
 className="form-control"
 placeholder="additional details"
 defaultValue=""
/>
</div>
</div>
</div> */}
    </>
  );
}
