import { useEffect, useState } from "react";
import { FooterBook } from "./Footer";
import { HeaderBook } from "./Header";
import { useNavigate, useParams } from "react-router-dom";
import { findBookById } from "../service/BookService";

export function DetailOfBook() {
  const { id } = useParams();
  const [book, setBook] = useState({});

  useEffect(() => {
    const getBook = async () => {
      const fetchedBook = await findBookById(id);
      setBook(fetchedBook);
    };
    getBook();
  }, [id]);

  return (
    <>
      <HeaderBook />
      <div className="container" style={{ backgroundColor: "white", height: "100%" }}>
        <div className="row">
          <h3>Chi tiết phiếu mượn &gt;</h3>
        </div>
        <div className="row">
          <div className="col-lg-4">
            <div className="card mb-3" style={{ width: "18rem" }}>
              <img
                src={book.imageOfBook}
                className="card-img-top"
                alt="..."
              />
            </div>
          </div>
          <div className="col-lg-8">
            <table className="table table-striped">
              <tbody>
                <tr>
                  <td>Tên Sách: {book.nameBook}</td>
                </tr>
                {book.author && (
                  <tr>
                    <td>Tác Giả: {book.author.nameAuthor}</td>
                  </tr>
                )}
                <tr>
                  <td>Xuất Bản Năm: {book.yearOfPublication}</td>
                </tr>
                <tr>
                  <td>Nhà Xuất Bản: {book.publisher}</td>
                </tr>
                <tr>
                  <td>Thể Loại: {book.genre && book.genre.nameGenre}</td>
                </tr>
                <tr>
                  <td>Ngôn Ngữ: Tiếng {book.languageBook && book.languageBook.nameLanguage}</td>
                </tr>
                <tr>
                  <td>Giá Tiền: {book.price}</td>
                </tr>
                <tr>
                  <td>Số Lượng: {book.amountBook}</td>
                </tr>
                <tr>
                  <td>Lượt Yêu Thích: {book.likeBook}</td>
                </tr>
                <tr>
                  <td>Giới Thiệu Sách: {book.introduceBook} </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
      <FooterBook />
    </>
  );
}
