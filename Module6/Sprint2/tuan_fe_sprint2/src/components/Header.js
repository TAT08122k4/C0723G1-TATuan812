export function HeaderBook(){
    return(
        <>
        <div id="header">
          {/* Header*/}
          <nav className="navbar navbar-light header">
            <div className="container">
              <a className="navbar-brand py-0" href="#">
                <img src="https://w7.pngwing.com/pngs/347/174/png-transparent-book-icon-teacher-s-day-on-september-10-teacher-book-angle-white-rectangle-thumbnail.png" alt="logo" width="100%" height={25} />
              </a>
              <form className="d-flex w-50">
                <input
                  className="form-control"
                  type="search"
                  placeholder="Nhập tên sách, tác giả hoặc thể loại để tìm"
                  aria-label="Search"
                />
                <button className="btn btn-outline-light ms-1" type="submit">
                  Search
                </button>
              </form>
              <ul className="d-flex m-0 log-in">
                <a className="d-flex" href="#">
                  <li>
                    <i
                      className="fa-solid fa-right-to-bracket"
                      style={{ color: "#ffffff" }}
                    />
                  </li>
                  <li className="px-2">Đăng nhập</li>
                </a>
                <a className="d-flex" href="#">
                  <li>
                    <i className="fa-regular fa-user" style={{ color: "#ffffff" }} />
                  </li>
                  <li className="px-2"> Đăng ký</li>
                </a>
              </ul>
            </div>
          </nav>
          {/*    NAV BAR*/}
          <nav className="navbar navbar-expand-lg navbar-light bg-light p-0">
            <div className="container-fluid">
              <div
                className="collapse navbar-collapse d-flex justify-content-center align-items-center"
                id="navbarSupportedContent"
              >
                <ul className="navbar-nav mb-2 mb-lg-0">
                  <li className="nav-item">
                    <a className="nav-link" href="#">
                      Trang chủ
                    </a>
                  </li>
                  <li className="nav-item dropdown">
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
                  </li>
                  <li className="nav-item">
                    <a className="nav-link" href="#">
                      Đang theo dõi
                    </a>
                  </li>
                  <li className="nav-item">
                    <a className="nav-link" href="#">
                      Phiếu mượn của tôi
                    </a>
                  </li>
                </ul>
              </div>
            </div>
          </nav>
        </div>
        
        </>
    )
}