import { ErrorMessage, Field, Form, Formik } from "formik";
import 'react-toastify/dist/ReactToastify.css'
import * as Yup from 'yup';
import {Bars} from 'react-loader-spinner';
import {toast,ToastContainer} from "react-toastify";
import 'bootstrap/dist/css/bootstrap.min.css';
import { useEffect, useState } from "react";
import { getAll } from "../service/BookService";
import { addNewBook } from "../service/BookService";
import {useNavigate} from 'react-router-dom'

export function FormCreate(){
    const [books,setBooks] = useState([])
    const nagivate = useNavigate();
    async function createBook(values){
        const result = await addNewBook(values);
        nagivate("/")
        toast("Add New Book Success")
    
    }
    const initValues = {
        name : "book name",
        author : "Ai mà Biết",
        description : "ko bik nốt",
        quanlity : 5,
    }
    const validateObject = {
        name : Yup.string().required("Không Được Để Rỗng"),
        author :  Yup.string().required("Không Được Để Rỗng"),
        description :  Yup.string().required("Không Được Để Rỗng"),
        quanlity : Yup.number().required("Không Được Để Rỗng").min(1,"Phải Lớn Hơn 0")
    }
    return (
        <>
        <Formik initialValues={initValues} validationSchema={Yup.object(validateObject)} onSubmit={(values,{setSubmitting}) => {
            createBook(values)
        }}
        >
            {
                ({isSubmitting}) =>(
                    <div className="container">
                <h1>Add New book</h1>
                <Form>
                    <label htmlFor="name" className="form-label">Name Book :</label><br></br>
                    <Field type='text' id='name' name='name' /><br></br>
                    <ErrorMessage name="name" component='span' className="form-err" />
                    <label htmlFor="author" className="form-label">Author Book :</label><br></br>
                    <Field type='text' id='author' name='author' /><br></br>
                    <ErrorMessage name="author" component='span' className="form-err" />
                    <label htmlFor="description" className="form-label">description Book :</label><br></br>
                    <Field type='text' id='description' name='description' /><br></br>
                    <ErrorMessage name="description" component='span' className="form-err" />
                    <label htmlFor="quanlity" className="form-label">Quanlity Book :</label><br></br>
                    <Field type='number' id='quanlity' name='quanlity' /><br></br>
                    <ErrorMessage name="quanlity" component='span' className="form-err" />
                    {isSubmitting ? <Bars height="80"
   width="80"
   radius="9"
   color="green"
   ariaLabel="loading"
   wrapperStyle
   wrapperClass
   visible={true} /> : <button type="submit" className="btn btn-primary">Submit</button>}
                </Form>
                    </div>
                )
            }

        </Formik>
        </>
    )


    
}