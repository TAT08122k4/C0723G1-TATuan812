import { ErrorMessage, Field, Form, Formik } from "formik";
import * as Yup from 'yup';
import {useState,useEffect} from 'react'
import { addNewCongCu, findById, getAllNhanVien, muonCongCu } from "../service/CongCuService";
import SweetAlert from "sweetalert";
import {Bars} from 'react-loader-spinner';
import { Link, useNavigate ,useParams } from "react-router-dom";

export function MuonCongCu1 (){
    const {id} = useParams();
    const [congCu,setCongCu] = useState();
    const [hangSanXuat,setHangSanXuat] = useState();
    const [nhanViens,setNhanViens] = useState([]);
    const navigate = useNavigate();

    useEffect(() =>{
        const findbyIdCongCu = async () =>{
            const a = await findById(id);
            const b = await getAllNhanVien();
            setNhanViens(b);
            setCongCu(a);
        }
        findbyIdCongCu();
    }, [id]);
    
    async function borrowCongCu(values){
       try {
        await muonCongCu(values);
        navigate("/")
        await SweetAlert(
            "Mượn Công Cụ Thành Công!",
            `Vui Lòng nhận Công Cụ  bạn đã mượn ở kho`,
            "success"
        );
       } catch (error) {
        console.log(error);
    
       }
    }
    // const initValues = {
        
    // }
    const validateObject = {
        soLuongMuon : Yup.number().required("Số Lượng Mượn Không Được Để Rỗng"),
    }
    if(!congCu){
        return null;
    }
    return (
        <>
        <Formik initialValues={{
        id : congCu.id,
        tenCongCu : congCu.tenCongCu,
        donVi : congCu.donVi,
        soLuong : congCu.soLuong ,
        hangSanXuat : congCu.hangSanXuat.tenHangSanXuat,
        soLuongMuon : 0,
        nhanVienId : 1, 
        congCuId : congCu.id,
    }} validationSchema={Yup.object(validateObject)} onSubmit={(values,{setSubmitting}) =>{
        borrowCongCu(values)
        }} >
         {
            ({isSubmitting}) =>(
                <div className="container">
              <h1>Thêm Mới Công Cụ</h1>
              <Form>
              <Field type='hidden' id='congCuId' disabled name='congCuId' /><br></br>
              <label htmlFor="nhanVienId" className="form-label">Hãng Sản Xuất</label><br></br>
                    <Field as='select' id='nhanVienId' name='nhanVienId' > 
                    {nhanViens.map((nhanvien)=> (
                    <option key={nhanvien.id} value={nhanvien.id}>{nhanvien.tenNhanVien}</option>

                    ))}
                    
                    
                    </Field><br></br>
              <label htmlFor="id" className="form-label">Mã Công Cụ</label><br></br>
              <Field type='text' id='id' name='id'  disabled /><br></br>
                    <label htmlFor="tenCongCu" className="form-label">Tên Công Cụ :</label><br></br>
                    <Field type='text' id='tenCongCu' disabled name='tenCongCu' /><br></br>
                    <ErrorMessage style={{color : "red"}}  name="tenCongCu" component='span' className="form-err" /><br></br>
                    <label htmlFor="hangSanXuat" className="form-label">Hãng Sản Xuất</label><br></br>
                    <Field type='text' id='hangSanXuat' disabled name='hangSanXuat' /><br></br>
                    <ErrorMessage name="hangSanXuat" component='span' className="form-err" /><br></br>
                    <label htmlFor="donVi" className="form-label">Đơn Vị</label><br></br>
                    <Field type='text'  id='donVi' disabled name='donVi' /><br></br>
                    <ErrorMessage style={{color : "red"}} name="donVi" component='span' className="form-err" /><br></br>
                    <label htmlFor="soLuong"  className="form-label">Số Lượng Còn Lại trong kho</label><br></br>
                    <Field type='number' disabled id='soLuong'  name='soLuong' /><br></br>
                    <ErrorMessage name="soLuong" component='span' className="form-err" /><br></br>
                    <label htmlFor="soLuongMuon" className="form-label">Số Lượng Mượn</label><br></br>
                    <Field type='number' id='soLuongMuon' name='soLuongMuon' /><br></br>
                    <ErrorMessage name="soLuongMuon" component='span' className="form-err" /><br></br>
                  
                    
                    
            
                    {<button type="submit" className="btn btn-primary">Submit</button>}
                </Form>


                </div>


            )
         }




        </Formik>
        </>
    )


}