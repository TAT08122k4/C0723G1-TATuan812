import "../styles/Home.css"
import { FooterBook } from "./Footer"
import { HeaderBook } from "./Header"
import ReactPaginate from "react-paginate";
import { useEffect, useState } from "react";
import { Link, useNavigate , useLocation , useParams } from "react-router-dom"; 
import { getListBooks, topLikeBooks } from "../service/BookService";
import SweetAlert from "sweetalert";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import { addAndCheckItem } from "../service/CartService";
import { HeaderBookIsLogin } from "./HeaderIsLogin";



export function HomePage(){
  const [totalPages , setTotalPages] = useState(0);
  const [currentPage,setCurrentPage] = useState(0);
  const [topBooks,setTopBooks] = useState([]);
  const [bookList , setBookList] = useState([]);
  const location = useLocation();
  const nameBook = location.state ?.nameBook || "";
  const authorId = location.state ?.authorId || "";
  const genreId = location.state ?.genreId || "";
  const languageId = location.state ?.languageId || "";
  const [props, setProps] = useState(false);
  console.log(nameBook,authorId,genreId,languageId);
  var idUser = localStorage.getItem("idAccount");
  useEffect(() =>{
    const fetchApi  = async (page,nameBook,authorId,genreId,languageId) => {
      try {
        const rs = await getListBooks(page,nameBook,authorId,genreId,languageId);
        const rs2 = await topLikeBooks();
        console.log(rs2);
        setTopBooks(rs2);
        setBookList(rs.content);
        setTotalPages(rs.totalPages)
        document.title = "Home"
        
      } catch (error) {
        console.log(error);
      }
    }
    fetchApi(currentPage,nameBook,authorId,genreId,languageId);
  },[currentPage,nameBook,authorId,genreId,languageId]);

  const  handlePageClick = async (event) =>{
    try {
      const pageNumber = event.selected;
      setCurrentPage(pageNumber);
      const result = await getListBooks(pageNumber,nameBook,authorId,genreId,languageId);
      setTotalPages(result.totalPages);
      setCurrentPage(result.currentPage);    
    } catch (error) {
      console.log(error);
      
    }
  }
  const isLogin = localStorage.getItem("isLogin");

  // const addToCart = async (book) =>{
  //   try { 
  //     if (book.amountBook < 1) {
  //       await SweetAlert(
  //         "Thêm vào giỏ hàng thất bại!",
  //         `Sách này đã hết hàng!`,
  //         "error"
  //     );
  //     }else{
  //       try {
  //       addAndCheckItem(1,book.id);
  //       toast.success('Thêm vào giỏ hàng thành công');
  //       } catch (error) {
  //         await SweetAlert(
  //           "Sản phầm đã tồn tại",
  //           `Sách này đã có trong giỏ hàng của bạn`,
  //           "error"
  //       );
  //       }
  //     }
  //   } catch (error) {
  //     console.log(error);
  //     await SweetAlert(
  //       "Sản phầm đã tồn tại",
  //       `Sách này đã có trong giỏ hàng của bạn`,
  //       "error"
  //   );
  //   }
  // }
  const addToCart = async (book) => {
    let isItemAdded = await addAndCheckItem(idUser, book.id);

    if (book.amountBook < 1) {
        await SweetAlert(
            "Thêm vào giỏ hàng thất bại!",
            `Sách này đã hết hàng!`,
            "error"
        );
    } else {
        console.log(isItemAdded);
        if (!isItemAdded) {
            await SweetAlert(
                "Sản phẩm đã tồn tại",
                `Sách này đã có trong giỏ hàng của bạn`,
                "error"
            );
        } else {
          setProps(!props)
          toast.success('Thêm vào giỏ hàng thành công');
        }
    }
}

//    if(!bookList){
//     return 
//       <>
//       <div class="loader">
//     <svg viewBox="0 0 80 80">
//         <circle id="test" cx="40" cy="40" r="32"></circle>
//     </svg>
// </div>

// <div class="loader triangle">
//     <svg viewBox="0 0 86 80">
//         <polygon points="43 8 79 72 7 72"></polygon>
//     </svg>
// </div>

// <div class="loader">
//     <svg viewBox="0 0 80 80">
//         <rect x="8" y="8" width="64" height="64"></rect>
//     </svg>
// </div>
      
//       </>
    
//    }
    return(
        <>
        {
          isLogin ? (
            <HeaderBookIsLogin></HeaderBookIsLogin>
          )  : <HeaderBook></HeaderBook>
        }
        <ToastContainer></ToastContainer>
        {/*MAIN-CONTENT*/}
        <div
          className="container"
          style={{ backgroundColor: "white", height: "100%" }}
        >
          <div className="row">
            <h3>SÁCH HOT &gt;</h3>
          </div>
          {/*        Carousel*/}
          <section className="movieCarousel">
    <div id="movieCarousel" className="carousel slide" data-ride="carousel">
        <ol className="carousel-indicators">
            <li data-target="#movieCarousel" data-slide-to="0" className="active"></li>
            <li data-target="#movieCarousel" data-slide-to="1"></li>
            <li data-target="#movieCarousel" data-slide-to="2"></li>
        </ol>
        <div className="carousel-inner">
            <div className="carousel-item active hero1">
            <div className="carousel-item__overlay"></div>
    <div className="container carousel-caption d-md-block">
        <p>Thể loại: Văn Học</p>
        <h2 className="display-4" style={{color : "white"}}>Tuổi Thơ Dữ Dội</h2>
        <p>
        Tuổi thơ dữ dội là một tiểu thuyết dài tám phần xuất bản năm 1988 của nhà văn Phùng Quán, có nội dung xoay quanh cuộc sống chiến đấu và sự hy sinh của những thiếu niên 13, 14 tuổi trong hàng ngũ Đội thiếu niên trinh sát của trung đoàn Trần Cao Vân. Năm 1990, tiểu thuyết Tuổi thơ dữ dội đã được trao giải thưởng Văn học Thiếu nhi của Hội Nhà văn Việt Nam cũng như được dựng thành phim cùng tên.
        </p>
        <div className="carousel-item__trailer mt-4">
            <span className="d-inline-block mr-2 text-white rounded-circle text-center">Binggg</span> 
            <button className="btn-playTrailer">
                <i className="fa fa-play mr-2 playtrailer"></i>
                <span style={{fontSize: "1rem"}}> <Link to={`/book/${1}`}>Xem Thêm</Link> </span>
                <div className="btn__overlay"></div>
            </button>
        </div>
    </div>
            </div>
            <div className="carousel-item hero2">
            <div className="container carousel-caption d-md-block">
        <p>Thể loại: Cổ Tích</p>
        <h2 className="display-4"  style={{color : "white"}}>Cô Bé Quàng Khăn Đỏ</h2>
        <p>
        Câu chuyện kể về một cô bé trẻ tên là Little Red Riding Hood (Cô bé Quàng khăn Đỏ) hoặc Little Red Cap (Mũi cừu đỏ) do màu sắc của chiếc mũ cô bé thường đội. Một ngày nọ, mẹ của cô bé gửi cô đến thăm bà nội ở trong rừng, mang theo thức ăn và đồng hồ để gặp bà. Trên đường đi, cô gặp một con sói, người hỏi về nơi bà nội ở. Little Red Riding Hood không nghĩ là có gì đáng sợ, và cho biết bà nội ở sâu trong rừng. Sói thì nhanh chóng đi đến nhà của bà nội và nuốt chửng bà nội. Sau đó, sói mặc trang phục bà nội và đợi Little Red Riding Hood đến. Khi cô bé đến, sói ăn thịt cô bé hoặc là giết cô bé, tùy theo phiên bản của câu chuyện. Trong một số phiên bản, chú chó sủa cứu cô bé và những con sói nhưng trong một số phiên bản khác, không có ai cứu cô bé.
        </p>
        <div className="carousel-item__trailer mt-4">
            <span className="d-inline-block mr-2 text-white rounded-circle text-center">Binggg</span> 
            <button className="btn-playTrailer">
                <i className="fa fa-play mr-2 playtrailer"></i>
                <span style={{fontSize: "1rem"}}> <Link to={`/book/${10}`}>Xem Thêm</Link></span>
                <div className="btn__overlay"></div>
            </button>
        </div>
    </div>
              

              
            </div>
            <div className="carousel-item hero3">
            <div className="container carousel-caption d-md-block">
        <p>Thể loại: Văn Học</p>
        <h2 className="display-4"  style={{color : "white"}}>Dế mèn phiêu lưu kí</h2>
        <p>
        "Dế Mèn Phiêu Lưu Ký" là một truyện dài của nhà văn Tô Hoài, được viết vào năm 1941. Tác phẩm mang tính chất giáo dục, kể về cuộc phiêu lưu của chú dế thông minh tên là Mèn.
        </p>
        <div className="carousel-item__trailer mt-4">
            <span className="d-inline-block mr-2 text-white rounded-circle text-center">Binggg</span> 
            <button className="btn-playTrailer">
                <i className="fa fa-play mr-2 playtrailer"></i>
                <span style={{fontSize: "1rem"}}><Link to={`/book/${3}`}>Xem Thêm</Link></span>
                <div className="btn__overlay"></div>
            </button>
        </div>
    </div>
            </div>
        </div>
        <a className="carousel-control-prev" href="#movieCarousel" role="button" data-slide="prev">
            <span className="carousel-control-prev-icon" aria-hidden="true"></span>
            <span className="sr-only">Previous</span>
        </a>
        <a className="carousel-control-next" href="#movieCarousel" role="button" data-slide="next">
            <span className="carousel-control-next-icon" aria-hidden="true"></span>
            <span className="sr-only">Next</span>
        </a>
    </div>
</section>

          {/*        Kho sách*/}
          <div className="row mt-5">
            <div className="col-lg-9 left px-0">
              <h3>KHO SÁCH &gt;</h3>
              <section class="articles">
               {bookList ? (
                bookList.map((book,index) => (
<article>
    <div class="article-wrapper">
      <figure>
        <img src={book.imageOfBook} alt="" />
      </figure>
      <div class="article-body">
        <h2>{book.nameBook}</h2>
        <p>
         {book.introduceBook}
        </p>
        <Link to={`/book/${book.id}`}class="read-more">
          Đọc Thêm  <span class="sr-only"></span>
          <svg xmlns="http://www.w3.org/2000/svg" class="icon" viewBox="0 0 20 20" fill="currentColor">
            <path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd" />
          </svg>
        </Link>
        {book.amountBook > 0 ? (
  <a onClick={() => addToCart(book)} href="#" className="read-more">
    Thêm Vào Giỏ Hàng <span className="sr-only"></span>
    <svg xmlns="http://www.w3.org/2000/svg" className="icon" viewBox="0 0 576 512">
      <path d="M0 24C0 10.7 10.7 0 24 0H69.5c22 0 41.5 12.8 50.6 32h411c26.3 0 45.5 25 38.6 50.4l-41 152.3c-8.5 31.4-37 53.3-69.5 53.3H170.7l5.4 28.5c2.2 11.3 12.1 19.5 23.6 19.5H488c13.3 0 24 10.7 24 24s-10.7 24-24 24H199.7c-34.6 0-64.3-24.6-70.7-58.5L77.4 54.5c-.7-3.8-4-6.5-7.9-6.5H24C10.7 48 0 37.3 0 24zM128 464a48 48 0 1 1 96 0 48 48 0 1 1 -96 0zm336-48a48 48 0 1 1 0 96 48 48 0 1 1 0-96zM252 160c0 11 9 20 20 20h44v44c0 11 9 20 20 20s20-9 20-20V180h44c11 0 20-9 20-20s-9-20-20-20H356V96c0-11-9-20-20-20s-20 9-20 20v44H272c-11 0-20 9-20 20z"/>
    </svg>
  </a>
) : (
  <h3 style={{color: 'red'}}>Sách đã hết</h3>
)}
      </div>
    </div>
  </article>


                ))
               ) : (

                <h3>Không Tìm Thấy Dữ Liệu</h3>
               )


               }
  
</section>
<ReactPaginate
                          forcePage={currentPage}
                          breakLabel="..."
                          nextLabel="Trang Sau"
                          onPageChange={handlePageClick}
                          pageRangeDisplayed={2}
                          marginPagesDisplayed={2}
                          pageCount={totalPages}
                          previousLabel="Trang Trước"
                          pageClassName="page-item"
                          pageLinkClassName="page-link"
                          previousClassName="page-item"
                          previousLinkClassName="page-link"
                          nextClassName="page-item"
                          nextLinkClassName="page-link"
                          breakClassName="page-item"
                          breakLinkClassName="page-link"
                          containerClassName="pagination"
                          activeClassName="active"
                      />
            </div>
            <div className="col-lg-3 right">
              <h3>SÁCH ĐỀ CỬ &gt;</h3>
              <div className="pt-4">
                <table className="table table-hover">
                  <tbody>
                   {
                    topBooks ? (
                      topBooks.map((book,index) => (
                        <tr>
                        <td>
                          <Link to={`/book/${book.id}`}>{index + 1}.{book.nameBook}</Link>
                        </td>
                      </tr>
                      ))
                    ) : (
                      <h3>Không Có Dữ Liệu</h3>
                    )
                   }
                
                    
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
       <FooterBook></FooterBook>
      </>
      
      
    )
}