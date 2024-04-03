import { register } from '../service/AccountService';
import '../styles/Register.css'
import { FooterBook } from './Footer'
import { HeaderBook } from './Header'
import SweetAlert from "sweetalert";
import * as Yup from 'yup';
import {ErrorMessage, Field, Form, Formik} from "formik";
import { useEffect } from 'react';
import { Link, useNavigate } from "react-router-dom";


export function RegisterAccount(){
  const navigate = useNavigate();

  useEffect(() => {
    const isLogin = localStorage.getItem("isLogin");
    if (isLogin){
      navigate("/home")
    }
  },[])
  

  
  const registerAccount = async (values, {setErrors}) => {
    try {
        if (values.gender === "male") {
            values.gender = true;
        } else {
            values.gender = false;
        }
        const result = await register(values);
        await SweetAlert(
            "Đăng kí thành công!",
            `Xin mời bạn đăng nhập để vào hệ thống!`,
            "success"
        );
    } catch (err) {
        setErrors(err.data)
        await SweetAlert(
            "Đăng kí thất bại!",
            `Vui lòng nhập lại thông tin!`,
            "error"
        );

    }

}
const today = new Date();
const minAgeDate = new Date(today.getFullYear() - 16, today.getMonth(), today.getDate());

const initValues = {
    accountName: "",
    fullName: "",
    password: "",
    idCard: "",
    birthday: "",
    phoneNumber: "",
    gender: true,
    email: "",
    address: "",
}
const validateObject = {
  accountName: Yup.string().required("Tài Khoản không được để trống").min(6, "Tài Khoản từ 6 - 20 kí tự").max(20, "Tài Khoản từ 6 - 20 kí tự").matches("^[a-z0-9_-]+$", "Tài Khoản Vui Lòng Nhập Đúng Định Dạng"),
    fullName: Yup.string()
        .required("Họ Và Tên không được để rỗng")
        .min(6, "Họ và Tên từ 6 - 45 kí tự")
        .max(45, "Họ và Tên từ 6 - 45 kí tự")
        .matches(
            /^[A-Za-zÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*(?:\s+[A-Za-zÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*)*\s*$/,
            "Họ Và Tên vui lòng nhập đúng định dạng"
        ),

    password: Yup.string().required("Mật Khẩu không được để rỗng").min(6, "Mật Khẩu độ dài từ 6-20 kí tự").max(20, "Mật Khẩu độ dài từ 6-20 kí tự"),
    phoneNumber: Yup.string().required("Số Điện Thoại không được để rỗng").matches("^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$", "Số điện thoại vui lòng nhập đúng định dạng"),
    email: Yup.string()
        .required("Email Không được để rỗng")
        .matches(/^[\w\-.]+@([\w\-]+\.)+[\w\-]{2,}$/, "Email vui lòng nhập đúng định dạng"),
    address: Yup.string().required("Địa chỉ không được để rỗng"),
    birthday: Yup.date()
        .max(minAgeDate, "Bạn phải từ 16 tuổi trở lên để đăng ký!")
        .required("Ngày sinh không được để trống!")


}


    return (

        <>
        <>
       <HeaderBook></HeaderBook>
  <div className="form_wrapper">
  <Formik initialValues={initValues} validationSchema={Yup.object(validateObject)}   
      onSubmit={(values , {setErrors}) => registerAccount(values,{setErrors} ,console.log("cc") )}
      
      > 
      {

      ({isSubmitting}) => (
    <div className="form_container">
         <Form >
      <div className="title_container">
        <h2>Đăng Kí</h2>
      </div>
      <div className="row clearfix">
        <div className="">
       
            <div className="input_field">
              {" "}
              <span>
              <i aria-hidden="true" className="fa fa-user" />
              </span>
              <Field
                type="text"
                name="accountName"
                placeholder="Tài Khoản"
                className="input"
              />
                 <ErrorMessage name="accountName" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
            </div>
        
            <div className="input_field">
              {" "}
              <span>
                <i aria-hidden="true" className="fa fa-lock" />
              </span>
              <Field
                type="password"
                name="password"
                placeholder="Mật Khẩu"
                required=""
              />
                 <ErrorMessage name="password" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
            </div>
            <div className="input_field">
              {" "}
              <span>
 <i aria-hidden="true" className="fa fa-envelope" />
              </span>
              <Field
                type="text"
                name="email"
                placeholder="Email"
                required=""
              />
                 <ErrorMessage name="email" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
            </div>
            <div className="row clearfix">
              <div className="col_half">
                <div className="input_field">
                  {" "}
                  <span>
                    <i aria-hidden="true" className="fa fa-user" />
                  </span>
                  <Field
                type="text"
                name="fullName"
                placeholder="Họ Và Tên"
                required=""
              />
                 <ErrorMessage name="fullName" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
                </div>
              </div>
              <div className="col_half">
                <div className="input_field">
                
                  <Field
                type="date"
                name="birthday"
                style={{height : '35px'}}
              
      
              
              />
                 <ErrorMessage name="birthday" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
                </div>
              </div>
            </div>
            <div className="input_field radio_option">
              <Field value="male" type="radio" name="gender" id="rd1" checked />
              <label htmlFor="rd1">Nam</label>
              <Field value="female" type="radio" name="gender" id="rd2" />
              <label htmlFor="rd2">Nữ</label>
            </div>
            <div className="input_field">
              {" "}
              <span>
              <i class="fa-solid fa-location-dot"></i>
              </span>
              <Field
                type="text"
                name="address"
                placeholder="Địa Chỉ"
                required=""
              />
                 <ErrorMessage name="address" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
            </div>
            <div className="input_field">
              {" "}
              <span>
              <i class="fa-solid fa-phone"></i>
              </span>
              <Field
                type="text"
                name="phoneNumber"
                placeholder="Số Điện Thoại"
                required=""
              />
                 <ErrorMessage name="phoneNumber" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
            </div>
            <div className="input_field">
              {" "}
              <span>
              <i class="fa-solid fa-id-card"></i>
              </span>
              <Field
                type="text"
                name="idCard"
                placeholder="CMND/CCCD"
                required=""
              />
                 <ErrorMessage name="idCard" component='span' className="form-err" style={{color: 'red' , display : 'contents'}}/>
            </div>
            <button  className="button" type="submit">Đăng Kí </button>
        </div>
      </div>
      </Form>
    </div>
  
      )
    }
      </Formik>
    
  </div>
 <FooterBook></FooterBook>
</>

        
        </>
    )
}