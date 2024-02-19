import { ErrorMessage, Field, Form, Formik } from "formik";
import 'react-toastify/dist/ReactToastify.css'
import * as Yup from 'yup';
import {Bars} from 'react-loader-spinner';
import {toast,ToastContainer} from "react-toastify";
import {useNavigate} from 'react-router-dom'
import { useEffect, useState } from "react";
import { addNew } from "../service/MusicService";

export function FormCreate(){
    const nagivate = useNavigate();
    async function createMusic(value){
    const result = await addNew(value);
    nagivate("/")
    toast("Add New Music Success")
    
    }
    const initValues = {
        baiHat : " ",
        caSi : " ",
        tacGia : " ",
        thoiGianPhat : "00:00",
        soLuotThich : 0,
        trangThai : false  
    }
    const validateObject = {
        baiHat : Yup.string().required("Không Được Để Rỗng"),
        caSi : Yup.string().required("Không Được Để Rỗng").max(30,"tối đa 30 ký tự"),
        tacGia : Yup.string().required("Không được để Rỗng"),
        thoiGianPhat : Yup.string().required("Không Được Để Rỗng").matches(/^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$/,
        'Định dạng thời gian không hợp lệ (hh:mm)'),
        soLuotThich : Yup.number().required("Không Được Để Rỗng"),
    }

    return (
        <>
        <Formik initialValues={initValues} validationSchema={Yup.object(validateObject)} onSubmit={(value,{setSubmitting})=> {
        createMusic(value)
        }}>
        {
        ({isSubmitting}) => (
        <div className="container">
        <h1>Add New Music</h1>
        <Form>
        <label htmlFor="baiHat">Tên Bài Hát</label><br></br>
        <Field type='text' id='baiHat' name='baiHat' /> <br></br>
        <ErrorMessage name="baiHat" component='span' /> <br></br>
        <label htmlFor="caSi">Ca Sĩ</label><br></br>
        <Field type='text' id='caSi' name='caSi' /> <br></br>
        <ErrorMessage name="caSi" component='span' /> <br></br>
         <label htmlFor="tacGia">Tác Giả</label><br></br>
        <Field type='text' id='tacGia' name='tacGia' /> <br></br>
        <ErrorMessage name="tacGia" component='span' /> <br></br>
           <label htmlFor="thoiGianPhat">Thời Gian Phát</label><br></br>
        <Field type='text' id='thoiGianPhat' name='thoiGianPhat' /> <br></br>
        <ErrorMessage name="thoiGianPhat" component='span' /> <br></br>
            <label htmlFor="soLuotThich">Số Lượt Thích</label><br></br>
        <Field type='text' id='soLuotThich' name='soLuotThich' /> <br></br>
        <ErrorMessage name="soLuotThich" component='span' /> <br></br>
        {isSubmitting ? <h1>Đang Tải</h1> : <button type="submit">submit</button>}
        </Form>
        </div>
        )
        }
        
        
        </Formik>
        
        </>
    )
}
