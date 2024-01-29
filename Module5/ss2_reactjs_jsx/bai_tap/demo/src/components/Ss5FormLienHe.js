import {ErrorMessage,Field,Form,Formik} from "formik";
import 'react-toastify/dist/ReactToastify.css'
import * as Yup from 'yup';
import {Bars} from 'react-loader-spinner';
import {toast,ToastContainer} from "react-toastify";
import 'bootstrap/dist/css/bootstrap.min.css';



export function FormLienHe(){
    const initValues = {
        name : "",
        email : "",
        phone : "",
        message : "",
    };
    const validateObject = {
        name : Yup.string().required("Tên Không Được Để Trống"),
        email : Yup.string().required("Email Không Được Để Trống").matches(/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,"Vui lòng nhập đúng định dạng"),
        phone : Yup.string().required("Số Điện Thoại Không Được Để Trống").matches(/^\+?[0-9]{10,12}$/,"Vui Lòng Nhập Đúng Định Dạng"),
    };
    return (
        <>
        <Formik initialValues={initValues}
        validationSchema = {Yup.object(validateObject)}
        onSubmit={(values ,{setSubmitting}) => {
            setTimeout(()=> {
                setSubmitting(false)
                toast(`Gửi Form Liên Hệ Của ${values.name} Thành Công`);
            },10000)
        }}
        >
           {
            ({isSubmitting}) => (
                <div className="container">
                 <h1>Contact Form</h1>
                 <Form>
                    <label htmlFor="name" className="form-label">Name</label><br></br>
                    <Field id="name" type="text" name="name" /><br></br>
                    <ErrorMessage name="name" component='span'  className='form-err'/><br></br>
                    <label htmlFor="email" className="form-label">Email</label><br></br>
                    <Field id="email" type="text" name="email" /><br></br>
                    <ErrorMessage name="email" component='span' /><br></br>
                    <label htmlFor="phone" className="form-label">Phone</label><br></br>
                    <Field id="phone" type="text" name="phone" /><br></br>
                    <ErrorMessage name="phone" component='span' /><br></br>
                    <label htmlFor="message" className="form-label">Message</label><br></br>
                    <Field id="message" type="text" name="message" /><br></br>
                    <ErrorMessage name="message" component='span' /><br></br>
                    {isSubmitting ? <Bars
  height="80"
  width="80"
  radius="9"
  color="green"
  ariaLabel="loading"
  wrapperStyle
  wrapperClass
  visible={true}

                    /> : <button type="submit" className="btn btn-primary">Submit</button>}
                 </Form>
                </div>
            )
           }
        </Formik>
        <ToastContainer></ToastContainer>
        </>
    )
}