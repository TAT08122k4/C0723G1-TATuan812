import { deleteItemInCart, getListCart, payment, paymentAfter, setQuantity, showMoneyToPay } from '../service/CartService';
import '../styles/Cart.css'
import { FooterBook } from './Footer'
import { HeaderBook } from './Header'
import { useEffect, useState } from "react";
import SweetAlert from "sweetalert";
import { HeaderBookIsLogin } from './HeaderIsLogin';
export function CartBook (){
  const [cartItems,setCartItems] = useState([]);
  const [totalPriceBook,setTotalPriceBook] = useState(0);
  const idUser = localStorage.getItem("idAccount");
  const [flag, setFlag] = useState(false);

  useEffect(() =>{
    const displayCart = async () =>{
      const rs = await getListCart(idUser);
      setCartItems(rs);
      const rs2 = await showMoneyToPay(idUser);
      setTotalPriceBook(rs2);   
    }
    
    displayCart();
  },[flag , cartItems])
  function formatNumber(number) {
    return number.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
}
  const paymentBook =  async() => {
    for (let index = 0; index < cartItems.length; index++) {
      if(cartItems[index].quantity <= 0 ){
       return SweetAlert({
          title: "Sản Phẩm Đã Hết",
          text: `Sách ` + `${cartItems.nameBook}` +  "Đã Hết Hàng",
          icon: "warning",
          dangerMode: true,
        })
      }
      
    }
    SweetAlert({
      title: "Lựa chọn thanh toán",
      text: "Vui lòng chọn phương thức thanh toán:",
      buttons: {
        traSau: {
          text: "Thanh toán trả sau",
          value: "traSau",
        },
        online: {
          text: "Thanh toán online",
          value: "online",
        },
      },
    }).then((value) => {
      // Xử lý khi người dùng chọn một trong hai phương thức thanh toán
      switch (value) {
        case "traSau":
          console.log("hallo");
          paymentAfter(idUser);
           SweetAlert(
            "Đặt Hàng Thành Công",
            `Vui Lòng Kiểm Tra Đơn Hàng Của Bạn`,
            "success"
        );          break;
        case "online":
    payment(totalPriceBook,idUser).then((url) => {
      window.location.href = url;
    })
          console.log("Chọn thanh toán online");
          break;
        default:
          console.log("Đã đóng hộp thoại hoặc không có lựa chọn nào được chọn.");
          break;
      }
    });


  }
  const isLogin = localStorage.getItem("isLogin");

    return (
        <>
            {
          isLogin ? (
            <HeaderBookIsLogin></HeaderBookIsLogin>
          )  : <HeaderBook props={!flag}></HeaderBook>
        }


        <main className="page">
  <section className="shopping-cart dark">
    <div className="container">
      <div className="block-heading">
        <h2 style={{fontSize : "4em" , color : "Black"}}>Giỏ Hàng</h2>
      </div>
      <div className="content">
        <div className="row">
          <div className="col-md-12 col-lg-8">
            <div className="items">


              {
                cartItems ? (
                  cartItems.map((items,index) => (
                    <div className="product">
                    <div className="row">
                      <div className="col-md-3">
                        <img
                          className="img-fluid mx-auto d-block image"
                          src={items.imageOfBook}
                        />
                      </div>
                      <div className="col-md-8">
                        <div className="info">
                          <div className="row">
                            <div className="col-md-5 product-name">
                              <div className="product-name">
                                <a href="#">{items.nameBook}</a>
                                <div className="product-info">
                                  <div>
                                    Tác Giả: <span className="value">{items.nameAuthor}</span>
                                  </div>
                                  <div>
                                    Thể Loại: <span className="value">{items.nameGenre}</span>
                                  </div>
                                  <div>
                                    Ngôn Ngữ: <span className="value">{items.nameLanguage}</span>
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div className="col-md-4 quantity">
                              <label htmlFor="quantity">Số Lượng:</label>
                              <div style={{display:'flex'}}> 
                              <button className='btn-minus' onClick={() => {
                                    if(items.quantity - 1 > 0){
                                      setQuantity(items.quantity - 1 , items.id);
                                    }else{
                                      SweetAlert({
                                        title: "Bạn Có Muốn Xoá",
                                        text: `Bạn Có Chắc Chắn Muốn Xoá Sách ` + `${items.nameBook}` +  " Khỏi Giỏ Hàng",
                                        icon: "warning",
                                        buttons: true,
                                        dangerMode: true,
                                      })
                                      .then((willDelete) => {
                                        if (willDelete) {
                                          setFlag(!flag)
                                          console.log(flag);
                                          deleteItemInCart(items.id)
                                          SweetAlert("Bạn Đã Xoá Thành Công", {
                                            icon: "success",
                                          });
                                        } else {
                                          SweetAlert("Huỷ Xoá Thành Công ");
                                         
                                        }
                                      });
                                    }
                             
                              }}>-</button>
                              <input
                                id="quantity"
                                type="number"
                                value={items.quantity}
                                className="form-control quantity-input"
                              />
                              <button className='btn-add' 
                              onClick={() =>{
                                if(items.quantityBook >= items.quantity + 1){
                                  setQuantity(items.quantity + 1 , items.id)
                                }else{
                                   SweetAlert(
                                    "Thêm Sách Thất Bại!",
                                    `Sách này đã hết hàng!`,
                                    "error"
                                );
                                }
                              }}
                              >+</button> </div>
                             
                            </div>
                            <div className="col-md-3 price">
                              <span>{formatNumber(items.price * items.quantity)}đ</span>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  ))
 

                ) : (
                  <h3>Giỏ Hàng Của Bạn Đang Rỗng</h3>
                )
              }
             
              {/* <div className="product">
                <div className="row">
                  <div className="col-md-3">
                    <img
                      className="img-fluid mx-auto d-block image"
                      src="https://th.bing.com/th/id/OIP.I-PA0PNgQiJ3EoU4mzifngHaK0?w=126&h=184&c=7&r=0&o=5&pid=1.7"
                    />
                  </div>
                  <div className="col-md-8">
                    <div className="info">
                      <div className="row">
                        <div className="col-md-5 product-name">
                          <div className="product-name">
                            <a href="#">Ông Già Và Biển Cá</a>
                            <div className="product-info">
                              <div>
                                Tác Giả: <span className="value">Ernest Hemingway</span>
                              </div>
                              <div>
                                Thể Loại: <span className="value">Văn Học</span>
                              </div>
                              <div>
                                Ngôn Ngữ: <span className="value">Tiếng Việt</span>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div className="col-md-4 quantity">
                          <label htmlFor="quantity">Số Lượng:</label>
                          <input
                            id="quantity"
                            type="number"
                            defaultValue={1}
                            className="form-control quantity-input"
                          />
                        </div>
                        <div className="col-md-3 price">
                          <span>150.000đ</span>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div className="product">
                <div className="row">
                  <div className="col-md-3">
                    <img
                      className="img-fluid mx-auto d-block image"
                      src="https://bapcai.vn/wp-content/uploads/2021/07/tieu-thuyet-nuoc-ngoai-18.jpg"
                    />
                  </div>
                  <div className="col-md-8">
                    <div className="info">
                      <div className="row">
                        <div className="col-md-5 product-name">
                          <div className="product-name">
                            <a href="#">The Trial</a>
                            <div className="product-info">
                              <div>
                                Tác Giả: <span className="value">Franz Kafka</span>
                              </div>
                              <div>
                                Thể Loại: <span className="value">Tiểu Thuyết</span>
                              </div>
                              <div>
                                Ngôn Ngữ: <span className="value">Tiếng Anh</span>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div className="col-md-4 quantity">
                          <label htmlFor="quantity">Số Lượng:</label>
                          <input
                            id="quantity"
                            type="number"
                            defaultValue={1}
                            className="form-control quantity-input"
                          />
                        </div>
                        <div className="col-md-3 price">
                          <span>200.000đ</span>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div> */}
            </div>
          </div>
          <div className="col-md-12 col-lg-4">
            <div className="summary">
              <h3>Tính Tiền</h3>
              <div className="summary-item">
                <span className="text">Tiền Sách Của Bạn</span>
                <span className="price">{formatNumber(totalPriceBook)}đ</span>
              </div>
              <div className="summary-item">
                <span className="text">Giảm Giá</span>
                <span className="price">0đ</span>
              </div>
              <div className="summary-item">
                <span className="text">Phí Vận Chuyển</span>
                <span className="price">20.000đ</span>
              </div>
              <hr></hr>
              <div className="summary-item">
                <span className="text">Tổng Tiền</span>
                <span className="price">{formatNumber(totalPriceBook + 20000)}đ</span>
              </div>
              <button
                className="btn btn-primary btn-lg btn-block"
                onClick={() =>
                    paymentBook()
                }
              >
                Thanh Toán
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</main>
<FooterBook></FooterBook>

        
        </>
    )
}