import React, { useState, useEffect } from "react";
import { deleteProduct, getAll } from "../service/ProductService";
import { Form, Link, NavLink, Route, Routes } from "react-router-dom";

export function DisplayProduct() {
  const [products, setProducts] = useState({});
  // const [searchProductName, setSearchProductName] = useState("");
  // const [searchCategory, setSearchCategory] = useState("");
  const [objectDelete,setObjectDelete] = useState(0)

  useEffect(() => {
    const displayProducts = async () => {
      try {
        const result = await getAll();
        setProducts(result);
      } catch (error) {
        console.log(error);
      }
    };
    displayProducts();
  }, [products]);
  async function removeProduct(){
    console.log(objectDelete);
    await deleteProduct(objectDelete);
  
  }

  // const handleSearch = () => {
  //   const filteredProducts = products.filter(
  //     (product) =>
  //       product.tenSanPham.toLowerCase().includes(searchProductName.toLowerCase()) &&
  //       product.loaiSanPham.toLowerCase().includes(searchCategory.toLowerCase())
  //   );
  //   return filteredProducts;
  // };
  if(!products.content){
    return "Loadinggg";
  }
  return (
    <>
      <div className="search">
        <h1>Tìm Kiếm Sản Phẩm</h1>
        <input
          type="text"
          placeholder="Tìm Kiếm Bằng Tên"
          // value={searchProductName}
          // onChange={(event) => {setSearchProductName(event.target.value)}}
        /> 
        -
        <input
          type="text"
          placeholder="Tìm Kiếm Bằng Thể Loại"
          // value={searchCategory}
          // onChange={(event) => {setSearchCategory(event.target.value)}}
        />
        -
        {/* <button onClick={handleSearch} className=" btn btn-outline-primary">Tìm Kiếm</button> */}
      </div>
      <h1>Danh Sách Sản Phẩm</h1>
      <table className="table table-hover table-bordered">
        <thead>
          <tr>
            <th>#</th>
            <th>Tên Sản Phẩm</th>
            <th>Ngày Nhập</th>
            <th>Số Lượng</th>
            <th>Loại Sản Phẩm</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {

            products.content.map((item, index) => (
              <tr key={item.id}>
                <th>{index + 1}</th>
                <th>{item.tenSanPham}</th>
                <th>{item.ngayNhap}</th>
                <th>{item.soLuong}</th>
                <th>{item.loaiSanPham}</th>
                <th><button className="btn btn-outline-danger"   data-bs-toggle="modal"
                                    data-bs-target="#exampleModal" 
                                    onClick={() => setObjectDelete(item.id)} >Xoá</button></th>
                <th>
                  <Link to={"update/" + item.id}>
                    <button className=" btn btn-outline-success">Sửa</button>
                  </Link>
                </th>
              </tr>
            ))
          }

          
        </tbody>
      </table>
      <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Xóa blog</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            Bạn có muốn xóa blog Không ?
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary" data-bs-dismiss="modal"
                                    onClick={removeProduct}>Xóa
                            </button>
                        </div>
                    </div>
                </div>
            </div>
    </>
  );

}
