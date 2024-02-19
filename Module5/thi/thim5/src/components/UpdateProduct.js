import { ErrorMessage, Field, Form, Formik } from "formik";
import "react-toastify/dist/ReactToastify.css";
import * as Yup from "yup";
import { toast, ToastContainer } from "react-toastify";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { findById, updateProduct } from "../service/ProductService";

export function EditProduct() {
  const { id } = useParams();
  const [product, setProduct] = useState();
  const navigate = useNavigate();

  async function editProduct(value) {
    await updateProduct(value);
    toast("Edit A Product Success");
    navigate("/");
  }

  useEffect(() => {
    const getProduct = async () => {
      const product = await findById(id);
      setProduct(product);
      console.log("Test:" + product);
    };
    getProduct();
  }, [id]);
  const validateObject = {
    tenSanPham: Yup.string()
      .max(100, "Không Được Dài Quá 100 kí tự")
      .required("Không Được Để Trống"),
    ngayNhap: Yup.date()
      .max(new Date(), "Ngày nhập không được lớn hơn ngày hiện tại")
      .required("Không Được Để Trống"),
    soLuong: Yup.number()
      .min(0, "Số Lượng Phải Lớn Hơn 0")
      .required("Không Được Để Trống"),
  };
  if (!product) {
    console.log("Rỗng");
    return null;
  }
  return (
    <>
      <Formik
        initialValues={{
          id: product.id,
          tenSanPham: product.tenSanPham,
          ngayNhap: product.ngayNhap,
          soLuong: product.soLuong,
          loaiSanPham: product.loaiSanPham,
        }}
        validationSchema={Yup.object(validateObject)}
        onSubmit={(value, isSubmitting) => {
          editProduct(value);
        }}
      >
        {({ isSubmitting }) => (
          <div className="container">
            <h1>Chỉnh Sửa Sản Phẩm {product.tenSanPham}</h1>
            <Field name="id" type="hidden"></Field>
            <Form>
              <label htmlFor="tenSanPham">Tên Sản Phẩm</label>
              <br></br>
              <Field type="text" id="tenSanPham" name="tenSanPham" /> <br></br>
              <ErrorMessage name="tenSanPham" component="span" className="text-danger" /> <br></br>
              <label htmlFor="ngayNhap">Ngày Nhập</label>
              <br></br>
              <Field type="date" id="ngayNhap" name="ngayNhap" /> <br></br>
              <ErrorMessage name="ngayNhap" component="span" className="text-danger" /> <br></br>
              <label htmlFor="soLuong">Số Lượng</label>
              <br></br>
              <Field type="number" id="soLuong" name="soLuong" /> <br></br>
              <ErrorMessage
                name="soLuong"
                component="span"
                className="text-danger"
                
              />{" "}
              <br></br>
              <label htmlFor="loaiSanPham">Loại Sản Phẩm</label>
              <br></br>
              <Field type="text" id="loaiSanPham" name="loaiSanPham" />{" "}
              <br></br>
              <ErrorMessage name="loaiSanPham" component="span" className="text-danger" /> <br></br>
              {isSubmitting ? (
                <h1>Đang Tải</h1>
              ) : (
                <button type="submit" className="btn btn-outline-success">Gửi</button>
              )}
            </Form>
          </div>
        )}
      </Formik>
    </>
  );
}
