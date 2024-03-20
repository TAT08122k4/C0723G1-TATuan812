import { ErrorMessage, Field, Form, Formik } from "formik";
import * as Yup from 'yup';
import {useState,useEffect} from 'react'
import { addNewCongCu } from "../service/CongCuService";
import SweetAlert from "sweetalert";
import {Bars} from 'react-loader-spinner';
import { getAllhangSanXuat } from "../service/HangSanXuatService";
import { Link, useNavigate } from "react-router-dom";

export function TaoMoi (){
    const navigate = useNavigate();
    const [hangSanXuats,setHangSanXuats] = useState([]);
    useEffect(() =>{
        const hienThi = async () =>{
            try {
                const result = await getAllhangSanXuat()
                console.log(hangSanXuats);
                console.log(result);
                setHangSanXuats(result);
                document.title = "Tạo Mới Công Cụ";
            } catch (error) {
                console.log(error);
            }
        }
        hienThi();
    }, []);
    async function createCongCu(values){
        const rs = await addNewCongCu(values);
        navigate("/")
        await SweetAlert(
            "Thêm Mới Công Cụ Thành Công",
            `Đã Thêm Mới Thành Công`,
            "success"
        );
    }
    const initValues = {
        tenCongCu : "",
        donVi : "",
        soLuong : 0,
        hangSanXuatId : 0,
    }
    const validateObject = {
        tenCongCu : Yup.string().required("Tên Công Cụ Không Được Để Rỗng"),
        donVi : Yup.string().required(" Đơn Vị Không Được Rỗng"),
        soLuong : Yup.number().required("Số Lượng Không Được Rỗng").min(1,"SỐ Lượng Phải Lớn Hơn 0"),
    }
    return (
        <>
        <Formik initialValues={initValues} validationSchema={Yup.object(validateObject)} onSubmit={(values,{setSubmitting}) =>{
        createCongCu(values)
        }} >
         {
            ({isSubmitting}) =>(
                <div className="container">
              <h1>Thêm Mới Công Cụ</h1>
              <Form>
                    <label htmlFor="tenCongCu" className="form-label">Tên Công Cụ :</label><br></br>
                    <Field type='text' id='tenCongCu' name='tenCongCu' /><br></br>
                    <ErrorMessage style={{color : "red"}}  name="tenCongCu" component='span' className="form-err" /><br></br>
                    <label htmlFor="donVi" className="form-label">Đơn Vị</label><br></br>
                    <Field type='text' id='donVi' name='donVi' /><br></br>
                    <ErrorMessage style={{color : "red"}} name="donVi" component='span' className="form-err" /><br></br>
                    <label htmlFor="soLuong" className="form-label">Số Lượng</label><br></br>
                    <Field type='number' id='soLuong' name='soLuong' /><br></br>
                    <ErrorMessage name="soLuong" component='span' className="form-err" /><br></br>
                    <label htmlFor="hangSanXuatId" className="form-label">Hãng Sản Xuất</label><br></br>
                    <Field as='select' id='hangSanXuatId' name='hangSanXuatId' > 
                    {hangSanXuats.map((hangsanxuat)=> (
                    <option key={hangsanxuat.id} value={hangsanxuat.id}>{hangsanxuat.tenHangSanXuat}</option>

                    ))}
                    
                    
                    </Field><br></br>
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