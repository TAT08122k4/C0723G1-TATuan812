import '../styles/Register.css'
import { FooterBook } from './Footer'
import { HeaderBook } from './Header'

export function RegisterAccount(){
    return (

        <>
        <>
       <HeaderBook></HeaderBook>
  <div className="form_wrapper">
    <div className="form_container">
      <div className="title_container">
        <h2>Đăng Kí</h2>
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
            <div className="input_field">
              {" "}
              <span>
                <i aria-hidden="true" className="fa fa-lock" />
              </span>
              <input
                type="password"
                name="password"
                placeholder="Re-type Password"
                required=""
              />
            </div>
            <div className="row clearfix">
              <div className="col_half">
                <div className="input_field">
                  {" "}
                  <span>
                    <i aria-hidden="true" className="fa fa-user" />
                  </span>
                  <input type="text" name="name" placeholder="First Name" />
                </div>
              </div>
              <div className="col_half">
                <div className="input_field">
                  {" "}
                  <span>
                    <i aria-hidden="true" className="fa fa-user" />
                  </span>
                  <input
                    type="text"
                    name="name"
                    placeholder="Last Name"
                    required=""
                  />
                </div>
              </div>
            </div>
            <div className="input_field radio_option">
              <input type="radio" name="radiogroup1" id="rd1" />
              <label htmlFor="rd1">Nam</label>
              <input type="radio" name="radiogroup1" id="rd2" />
              <label htmlFor="rd2">Nữ</label>
            </div>
            <div className="input_field select_option">
              <select>
                <option>Chọn Địa Chỉ</option>
                <option>Option 1</option>
                <option>Option 2</option>
              </select>
              <div className="select_arrow" />
            </div>
            <input className="button" type="submit" defaultValue="Register" value="Đăng Kí" />
          </form>
        </div>
      </div>
    </div>
  </div>
 <FooterBook></FooterBook>
</>

        
        </>
    )
}