import { FooterBook } from "./Footer";
import { HeaderBook } from "./Header";
import { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import SweetAlert from "sweetalert";
import { loginAccount } from "../service/AccountService";
import { Form, Formik } from "formik";

export function LoginAccount() {
  const [isLogin, setIsLogin] = useState(false);
  const [paramAccount, setParamAccount] = useState("");
  const [paramPassword, setParamPassword] = useState("");
  const [error, setError] = useState("");
  const navigate = useNavigate();
  useEffect(() => {
    const isLogin = localStorage.getItem("isLogin");
    if (isLogin){
      navigate("/home")
    }
    window.scrollTo(0, 0);
    document.title = "Đăng nhập";
  }, []);
  const handleParamAccountChange = (e) => {
    setParamAccount(e.target.value);
  };
  const handleParamPasswordChange = (e) => {
    setParamPassword(e.target.value);
  };
  const handleLogin = async () => {
     try{
      if (paramPassword === "" || paramAccount === "") {
        
        setError("Tên đăng nhập và mật khẩu không được để trống!");
        setParamPassword("");
        setParamAccount("");
      } else {

        let params = {
          accountName: paramAccount,
          password: paramPassword,
        };
        
        const req = await loginAccount(params);
        localStorage.setItem("authToken", req.token);
        localStorage.setItem("idAccount", req.dataRes.id);
        localStorage.setItem("isLogin", true);
        localStorage.setItem("accountName", req.dataRes.accountName);
        // Cookies.set('Token', req.token, { expires: 7 * 1000 * 60 ,httpOnly:true, secure: true, sameSite: 'strict' });
        SweetAlert(
          "Đăng nhập thành công!",
          `Chào mừng ${localStorage.getItem("accountName")} đến với hệ thống!`,
          "success"
        );
        navigate("/home");
      }
     }catch(e){
      setError("ok")
     }
  
  };
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
              <Formik
                initialValues={{
                  accountName: paramAccount,
                  password: paramPassword,
                }}
                onSubmit={(values) => {
                  handleLogin();
                }}
              >
                <Form>
                  <div className="">
                    <div className="input_field">
                      {" "}
                      <span>
                        <i aria-hidden="true" className="fa fa-envelope" />
                      </span>
                      <input
                        type="text"
                        placeholder="Nhập Tài Khoản "
                        onChange={(e) => {
                          handleParamAccountChange(e);
                        }}
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
                        placeholder="Nhập Mật Khẩu"
                        onChange={(e) => {
                          handleParamPasswordChange(e);
                        }}
                      />
                    </div>
                    {error !== "" && (
                      <div className="errors">
                        <ul>
                          <li style={{ color: "red" }}>
                            Tên đăng nhập hoặc mật khẩu không đúng
                          </li>
                        </ul>
                      </div>
                    )}
                    <button className="btn" type="submit" onClick={handleLogin}>
                      Đăng nhập
                    </button>

                    <div>
                      <p>
                        Bạn chưa có tài khoản?{" "}
                        <Link to="/register">Đăng kí ngay</Link>.
                      </p>
                    </div>
                  </div>
                </Form>
              </Formik>
            </div>
          </div>
        </div>
        <FooterBook></FooterBook>
      </>
    </>
  );
}
