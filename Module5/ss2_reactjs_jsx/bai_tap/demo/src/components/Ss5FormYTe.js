import { Formik,ErrorMessage,Field,Form } from "formik";
import 'react-toastify/dist/ReactToastify.css';
import { toast , ToastContainer } from "react-toastify";
import * as Yup from 'yup'
import { Bars } from "react-loader-spinner";

export function FormYTe(){
    const initValues = {
        hoTen : '',
        cmnd : '',
        namSinh : '',
        gioiTinh : true ,
        quocTich : '' ,
        congTyLamViec : '' ,
        boPhanLamViec : '' ,
        coTheBaoHiemYTe : false ,
        tinhThanh : '' ,
        quanHuyen : '' ,
        phuongXa : '' ,
        soNha : '' ,
        dienThoai : '' ,
        email : '' ,
    }
    const validateObject = {
        hoTen : Yup.string().required("Không Được Để Rỗng"),
        cmnd : Yup.string().required("Không Được Để Rỗng"),
        namSinh : Yup.string().required("Không Được Để Rỗng").test("Năm Sinh Phải Sau 1900",(namSinh) => {
            return + namSinh > 1900;
        }),
        quocTich : Yup.string().required("Không Được Để Rỗng"),
        tinhThanh : Yup.string().required("Không Được Để Rỗng"),

        quanHuyen : Yup.string().required("Không Được Để Rỗng"),

        phuongXa : Yup.string().required("Không Được Để Rỗng"),

        soNha : Yup.string().required("Không Được Để Rỗng"),

        dienThoai : Yup.string().required("Không Được Để Rỗng"),
        email : Yup.string().required("Không Được Để Rỗng").matches(/^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,"Vui Lòng Nhập Đúng Định dạng"),
    }
    return (
        <>
        <Formik initialValues={initValues}
        validationSchema={Yup.object(validateObject)}
        onSubmit = {(values , {setSubmitting}) => {
        setTimeout(() => {
            setSubmitting(false)
            toast(`Add Form ${values.name} OK`)
        },2000)
        }}
        >
{
({isSubmitting}) => (
    <div className="container"> 
    <h1>Tờ Khai Y Tế</h1>
    <Form>
        <label htmlFor="hoTen" className="form-label">Họ Tên</label>
        <Field id="hoTen" type="text" name="hoTen" /><br></br>
        <ErrorMessage name="hoTen" component='span'  className='form-err'/><br></br>
        <label htmlFor="cmnd" className="form-label">Số Hộ Chiếu/CMND</label>
        <Field id="cmnd" type="text" name="cmnd" /><br></br>
        <ErrorMessage name="cmnd" component='span'  className='form-err'/><br></br>
        <label htmlFor="namSinh" className="form-label">Năm Sinh</label>
        <Field id="namSinh" type="text" name="namSinh" /><br></br>
        <ErrorMessage name="namSinh" component='span'  className='form-err'/><br></br>
        <label htmlFor="gender" className="form-label">
            Giới Tính
        </label>
        <label htmlFor="nam">Nam</label>
        <Field id="nam" type="radio" name="gioiTinh"></Field>
        <label htmlFor="nu">Nữ</label>
        <Field id="nu" type="radio" name="gioiTinh"></Field>
        <label htmlFor="quocTich" className="form-label">Quốc Tịch</label>
        <Field id="quocTich" type="text" name="quocTich" /><br></br>
        <ErrorMessage name="quocTich" component='span'  className='form-err'/><br></br>
        <label htmlFor="congTyLamViec" className="form-label">Công Ty Đang Làm Việc</label>
        <Field id="congTyLamViec" type="text" name="congTyLamViec" /><br></br>
        <ErrorMessage name="congTyLamViec" component='span'  className='form-err'/><br></br>
        <label htmlFor="boPhanLamViec" className="form-label">Bộ Phận Làm Việc</label>
        <Field id="boPhanLamViec" type="text" name="boPhanLamViec" /><br></br>
        <ErrorMessage name="boPhanLamViec" component='span'  className='form-err'/><br></br>
        <label>Có Thẻ Bảo Hiểm Y Tế </label>
        <Field name="coTheBaoHiemYTe" type="checkbox"></Field>
        <h1>Địa Chỉ Liên Lạc Tại Việt Nam</h1>
        <label htmlFor="tinhThanh" className="form-label">Tỉnh Thành</label>
        <Field id="tinhThanh" type="text" name="tinhThanh" /><br></br>
        <ErrorMessage name="tinhThanh" component='span'  className='form-err'/><br></br>
        <label htmlFor="quanHuyen" className="form-label">Quận Huyện</label>
        <Field id="quanHuyen" type="text" name="quanHuyen" /><br></br>
        <ErrorMessage name="quanHuyen" component='span'  className='form-err'/><br></br>
        <label htmlFor="phuongXa" className="form-label">Phường Xã</label>
        <Field id="phuongXa" type="text" name="phuongXa" /><br></br>
        <ErrorMessage name="phuongXa" component='span'  className='form-err'/><br></br>
        <label htmlFor="soNha" className="form-label">Số Nhà</label>
        <Field id="soNha" type="text" name="soNha" /><br></br>
        <ErrorMessage name="soNha" component='span'  className='form-err'/><br></br>
        <label htmlFor="dienThoai" className="form-label">Số Điện Thoại</label>
        <Field id="dienThoai" type="text" name="dienThoai" /><br></br>
        <ErrorMessage name="dienThoai" component='span'  className='form-err'/><br></br>
        <label htmlFor="email" className="form-label">Email</label>
        <Field id="email" type="text" name="email" /><br></br>
        <ErrorMessage name="email" component='span'  className='form-err'/><br></br>
{isSubmitting ? <Bars  height="80"
  width="80"
  radius="9"
  color="green"
  ariaLabel="loading"
  wrapperStyle
  wrapperClass
  visible={true} /> :  <button type="submit" className="btn btn-primary">Submit</button> } 
    </Form>
    </div>



   

)
}          

        </Formik>
        <ToastContainer></ToastContainer>
    
        </>
    )
}