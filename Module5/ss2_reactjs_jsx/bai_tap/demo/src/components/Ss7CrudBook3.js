import { ErrorMessage, Field, Form, Formik } from "formik";
import 'react-toastify/dist/ReactToastify.css'
import * as Yup from 'yup';
import {Bars} from 'react-loader-spinner';
import {toast,ToastContainer} from "react-toastify";
import 'bootstrap/dist/css/bootstrap.min.css';
import { useEffect, useState } from "react";
import {useNavigate , useParams} from "react-router-dom";
import { findById } from "../service/BookService";
import { updateBook } from "../service/BookService";


export function EditBook() {
    const  {id} = useParams();
    const [book,setBook] = useState();
    const navigate = useNavigate();
  
useEffect (() => {
    const a = async () => {
        const b = await findById(id);
        setBook(b)
    }
    a()
    
},[id])
console.log(book);
    // useEffect (() => {
    //     const a =  async() => {
    //         const b = await findById(id);
    //         setBook(b)
    //     };
    //     a()
    //     console.log(book); 
    // },[id])
    // const getBookById = async () =>{
    //     const result = await findById(param)
    //     setBook(result)
    //     console.log(result);
    //     console.log("Đây Là Book" + book);
    // }

    const validateObject = { 
        name : Yup.string().required("Không Được Để Rỗng"),
        author :  Yup.string().required("Không Được Để Rỗng"),
        description :  Yup.string().required("Không Được Để Rỗng"),
        quanlity : Yup.number().required("Không Được Để Rỗng").min(1,"Phải Lớn Hơn 0")
    }
    //    const initValues = {
    //     id : book.id,
    //     name : book.name,
    //     author : book.author,
    //     description : book.description,
    //     quanlity : book.quanlity,
    // }
    async function editBook(book){
        await updateBook(book)
        toast("Edit Success")
        navigate("/")

    }
    if (!book)   {
        return null;
    }
    return (
        <>
        <Formik 
        initialValues={{
            id : book.id,
            name : book.name,
            author : book.author,
            description : book.description,
            quanlity : book.quanlity,
        }}
        validationSchema={Yup.object(validateObject)}
        onSubmit={(values,isSubmitting) => {
        editBook(values)
        }}
        >
       {
        ({isSubmitting}) => (
            <div className="container">
                  <h1>Edit {book.name}</h1>
                  <Field name='id' type='hidden'></Field>
                <Form>
                    <label htmlFor="name1" className="form-label">Name Book :</label><br></br>
                    <Field type='text' id='name1' name='name' /><br></br>
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