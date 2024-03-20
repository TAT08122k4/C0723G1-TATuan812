import { FooterBook } from "./Footer";
import { HeaderBook } from "./Header";

export function LoginAccount(){
    return (

        <>
        <>
          <HeaderBook></HeaderBook>
  <div className="form_wrapper">
    <div className="form_container">
      <div className="title_container">
        <h2>Đăng Nhập</h2>
      </div>
      <div className="row clearfix">
        <div className="">
          <form>
            <div className="input_field">
              {" "}
              <span>
                <i aria-hidden="true" className="fa fa-envelope" />
              </span>
              <input
                type="email"
                name="email"
                placeholder="Email"
                required=""
              />
            </div>
            <div className="input_field">
              {" "}
              <span>
                <i aria-hidden="true" className="fa fa-lock" />
              </span>
              <input
                type="password"
                name="password"
                placeholder="Password"
                required=""
              />
            </div>
            <input className="button" type="submit" defaultValue="Register" value="Đăng Nhập" />
          </form>
          <div>
              <p>Bạn chưa có tài khoản? <a to="/register">Đăng kí ngay</a>.</p>
            </div>
        </div>
      </div>
    </div>
  </div>
  <FooterBook></FooterBook>
</>

        
        </>
    )
}