import '../styles/Cart.css'
import { FooterBook } from './Footer'
import { HeaderBook } from './Header'
export function CartBook (){
    return (
        <>
        <HeaderBook>

        </HeaderBook>
        <main className="page">
  <section className="shopping-cart dark">
    <div className="container">
      <div className="block-heading">
        <h2>Giỏ Hàng</h2>
      </div>
      <div className="content">
        <div className="row">
          <div className="col-md-12 col-lg-8">
            <div className="items">
              <div className="product">
                <div className="row">
                  <div className="col-md-3">
                    <img
                      className="img-fluid mx-auto d-block image"
                      src="https://th.bing.com/th/id/OIP.dqcpbOq6kHfDau4w-rFwqAHaLD?w=123&h=184&c=7&r=0&o=5&pid=1.7"
                    />
                  </div>
                  <div className="col-md-8">
                    <div className="info">
                      <div className="row">
                        <div className="col-md-5 product-name">
                          <div className="product-name">
                            <a href="#">Tuổi Thơ Dữ Dội</a>
                            <div className="product-info">
                              <div>
                                Tác Giả: <span className="value">Phùng Quán</span>
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
                          <span>120.000đ</span>
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
              </div>
            </div>
          </div>
          <div className="col-md-12 col-lg-4">
            <div className="summary">
              <h3>Tính Tiền</h3>
              <div className="summary-item">
                <span className="text">Tiền Sách Của Bạn</span>
                <span className="price">470.000đ</span>
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
                <span className="price">490.000đ</span>
              </div>
              <button
                type="button"
                className="btn btn-primary btn-lg btn-block"
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