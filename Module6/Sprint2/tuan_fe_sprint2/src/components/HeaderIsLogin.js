import { Link, useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
import {
  getListAuthor,
  getListGenre,
  getListLanguage,
} from "../service/BookService";
import { getListCart } from "../service/CartService";
import { getAccount } from "../service/AccountService";
import SweetAlert from "sweetalert";


export function HeaderBookIsLogin(props) {
  const [nameBook, setNameBook] = useState("");
  const [authorId, setAuthorId] = useState(0);
  const [genreId, setGenreId] = useState(0);
  const [languageId, setLanguageId] = useState(0);
  const [authors, setAuthors] = useState([]);
  const [genres, setGenres] = useState([]);
  const [languages, setLanguages] = useState([]);
  const [numberInCart, setNumberInCart] = useState(0);
  const [account , setAccount] = useState({});
  const [role,setRole] = useState();
  const back = useNavigate();

  useEffect(() => {
    const displayDropDown = async () => {
      try {
        const idUser = localStorage.getItem("idAccount");
        const rs5 = await getAccount(idUser);
        setAccount(rs5);
        setRole(rs5.role.id)
        const rs1 = await getListAuthor();
        const rs2 = await getListLanguage();
        const rs3 = await getListGenre();
        // console.log(account.role);
        try {
          const rs4 = await getListCart(idUser);
          setNumberInCart(rs4.length);
        } catch (error) {
          setNumberInCart(0);
        }
        setAuthors(rs1);
        setGenres(rs3);
        setLanguages(rs2);
      } catch (error) {
        console.log(error);
      }
    };
    displayDropDown();
  }, [props]);
  // Hàm xử lý sự kiện onChange cho dropdown 1
  const handleAuthorId = (event) => {
    setAuthorId(event.target.value);
    console.log(event.target.value);
  };

  // Hàm xử lý sự kiện onChange cho dropdown 2
  const handleGenreId = (event) => {
    setGenreId(event.target.value);
    console.log(event.target.value);
  };

  // Hàm xử lý sự kiện onChange cho dropdown 3
  const handleLanguageId = (event) => {
    setLanguageId(event.target.value);
    console.log(event.target.value);
  };

  const handleNameSearch = (event) => {
    setNameBook(event);
  };
  const logout = async () => {
    localStorage.clear();
    await SweetAlert(
        "Đăng xuất thành công",
        `Cám ơn bạn đã có những trải nghiệm với hệ thống của chúng tôi!`,
        "success"
    );
    back("/home")
}



  const sendData = (e) => {
    e.preventDefault();
    back("/home", {
      state: {
        nameBook: nameBook,
        authorId: authorId,
        genreId: genreId,
        languageId: languageId,
      },
    });
  };

  return (
    <>
      <div id="header">
        {/* Header*/}
        <nav className="navbar navbar-light header">
          <div className="container">
            <a className="navbar-brand py-0" href="#">
              <img
                src="https://w7.pngwing.com/pngs/347/174/png-transparent-book-icon-teacher-s-day-on-september-10-teacher-book-angle-white-rectangle-thumbnail.png"
                alt="logo"
                width="100%"
                height={25}
              />
            </a>
            <form className="d-flex w-50">
              <input
                className="form-control"
                type="text"
                placeholder="Nhập tên sách, tác giả hoặc thể loại để tìm"
                aria-label="Search"
                onChange={(event) => handleNameSearch(event.target.value)}
              />
              <button
                onClick={(e) => {
                  sendData(e);
                }}
                className="btn btn-outline-light ms-1"
              >
                Search
              </button>
              <div>
                {/* Dropdown 1 */}
                <select onChange={handleAuthorId}>
                  <option value={0}>Chọn Tác Giả</option>
                  {authors.map((author) => (
                    <option value={author.id}>{author.nameAuthor}</option>
                  ))}
                </select>

                {/* Dropdown 2 */}
                <select onChange={handleLanguageId}>
                  <option value={0}>Chọn Ngôn Ngữ</option>
                  {languages.map((language) => (
                    <option value={language.id}>{language.nameLanguage}</option>
                  ))}
                </select>

                {/* Dropdown 3 */}
                <select onChange={handleGenreId}>
                  <option value={0}>Chọn Thể Loại</option>
                  {genres.map((genre) => (
                    <option value={genre.id}>{genre.nameGenre}</option>
                  ))}
                </select>
              </div>
            </form>
            <ul className="navbar-nav mb-2 mb-lg-0"></ul>
            <a class="d-flex align-items-center cart-icon-wrapper" href="#">
              <Link to={"/cart"} class="btn cart-button">
                <i class="fa-solid fa-cart-shopping"></i>
                <span class="cart-count-badge">{numberInCart}</span>
                <span class="ps-2 cart-text">Giỏ hàng</span>
              </Link>
            </a>

            <ul className="d-flex m-0 log-in">
              <a className="d-flex" href="#">
                {/* <li>
                    <i
                      className="fa-solid fa-right-to-bracket"
                      style={{ color: "#ffffff" }}
                    />
                  </li> */}
                <li className="px-2">
                  <p style={{color : 'white' , fontSize : "17px"}} to={"/login"} className="nav-link">
                    Hi , {account.fullName}
                  </p>
                </li>
              </a>
              <a className="d-flex" href="#">
                {/* <li>
                    <i className="fa-regular fa-user" style={{ color: "#ffffff" }} />
                  </li> */}
                <li className="px-2">
                  {" "}
                  <a style={{color : 'white' , fontSize : "17px"}} onClick={logout} className="nav-link">
                    Đăng Xuất
                  </a>
                </li>
              </a>
            </ul>
          </div>
        </nav>
        {/*    NAV BAR*/}

      {
          role === 2 ? (
<nav className="navbar navbar-expand-lg navbar-light bg-light p-0">
          <div className="container-fluid">
            <div
              className="collapse navbar-collapse d-flex justify-content-center align-items-center"
              id="navbarSupportedContent"
            >
              <ul className="navbar-nav mb-2 mb-lg-0">
                <li className="nav-item">
                  <Link to={"/home"} className="nav-link">
                    Trang chủ
                  </Link>
                </li>
                {/* <li className="nav-item dropdown">
                    <a
                      className="nav-link dropdown-toggle"
                      href="#"
                      id="navbarDropdown"
                      role="button"
                      data-bs-toggle="dropdown"
                      aria-expanded="false"
                    >
                      Thể loại
                    </a>
                    <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                    </ul>
                  </li>*/}
                <li className="nav-item">
                  <Link  to={`/account/${account.id}`}  className="nav-link" href="#">
                    Thông Tin Cá Nhân
                  </Link>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="#">
                    Đơn Hàng Của Tôi
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
          ) : (
            <nav className="navbar navbar-expand-lg navbar-light bg-light p-0">
          <div className="container-fluid">
            <div
              className="collapse navbar-collapse d-flex justify-content-center align-items-center"
              id="navbarSupportedContent"
            >
              <ul className="navbar-nav mb-2 mb-lg-0">
                <li className="nav-item">
                  <Link to={"/home"} className="nav-link">
                    Trang chủ
                  </Link>
                </li>
                {/* <li className="nav-item dropdown">
                    <a
                      className="nav-link dropdown-toggle"
                      href="#"
                      id="navbarDropdown"
                      role="button"
                      data-bs-toggle="dropdown"
                      aria-expanded="false"
                    >
                      Thể loại
                    </a>
                    <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                      <li>
                        <a className="dropdown-item" href="#">
                          Thể loại 1
                        </a>
                      </li>
                    </ul>
                  </li>*/}
                <li className="nav-item">
                  <Link  to={`/account/${account.id}`}  className="nav-link" href="#">
                    Thông Tin Cá Nhân
                  </Link>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="#">
                    Quản Lý Đơn Hàng
                  </a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="#">
                    Quản Lý Sách
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
          )
        } 
        
      </div>
    </>
  );
}
{
  /* khi đã đăng nhập  */
}
{
  /* <ul class="d-flex m-0 log-in">
 <a class="d-flex" href="#">
     <li>
         <i class="fa-regular fa-user" style={{color : "#ffffff"}}></i>
     </li>
     <li class="px-2"> Hi, nv-1</li>
 </a>

 <a class="d-flex" href="#">
     <li>
         <i class="fa-solid fa-right-to-bracket"  style={{color : "#ffffff"}}></i>
     </li>
     <li class="px-2">Đăng xuất</li>
 </a>
</ul> */
}
