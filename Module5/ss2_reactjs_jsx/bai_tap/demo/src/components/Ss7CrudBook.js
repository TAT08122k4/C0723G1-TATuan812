import { ErrorMessage, Field, Form, Formik } from "formik";
import "react-toastify/dist/ReactToastify.css";
import * as Yup from "yup";
import { Bars } from "react-loader-spinner";
import { toast, ToastContainer } from "react-toastify";
import "bootstrap/dist/css/bootstrap.min.css";
import { useEffect, useState } from "react";
import { getAll } from "../service/BookService";
import { addNewBook } from "../service/BookService";
import { deleteBook } from "../service/BookService";
import { Link, useNavigate } from "react-router-dom";
import { Button, Modal } from "react-bootstrap";
import { ModalDelete } from "./ModalBook";
import InputGroup from 'react-bootstrap/InputGroup'

export function CrudBook() {
  const [books, setBooks] = useState([]);
  const [refresh, setRefresh] = useState(0);
  const [showModal,setShowModal] = useState(false);
  const [objectDelete,setObjectDelete] = useState({})
  const nagivate = useNavigate();
  const [search,setSearch] = useState('')
  useEffect(() => {
    const displayBook = async () => {
      try {
        const result = await getAll();
        setBooks(result);
      } catch (error) {
        console.log(error);
      }
    };
    displayBook();
  }, [refresh,showModal]);
  async function createBook(values) {
    let result = await addNewBook(values);
    if (result) {
      alert("Add New Book Successs");
      setBooks(await getAll());
    } else {
      console.error("Can not Create a new Book"); 
    }
  }
//   const deleteABook = (id) => {

//     deleteBook(id).then(() => {  
//          setRefresh(1);
//         console.log(refresh);
//       toast("Delete Success");
//       console.log(id);
//     });
 
//   };

const openModal = (book) =>{
    setObjectDelete(book)
    setShowModal(true);
    console.log(book);
}
  

  return (
    <>
      <h1>Library</h1>
      {/* Search  */}
      {/* <Form>
        <InputGroup>
      <Form.Control onChange={(e) => setSearch(e.target.value)}  type="text" />
        </InputGroup>
      </Form> */}
      <table className="table table-hover table-bordered">
        <thead>
          <th>#</th>
          <th>Name Book</th>
          <th>Quanlity</th>
          <th colSpan="2">Action</th>
        </thead>
        <tbody>

          {
            // Search
            // books.filter((item) => {
            //   return search.toLowerCase() === '' ? item : item.name.toLowerCase().includes(search);
            // }).map((item, index) => (
            // <tr key={item.id}>
            //   <th>{index}</th>
            //   <th>{item.name}</th>
            //   <th>{item.quanlity}</th>
            books.map((item, index) => (
              <tr key={item.id}>
                <th>{index}</th>
                <th>{item.name}</th>
                <th>{item.quanlity}</th>
              {/* <th> */}
                {/* <button
                  onClick={() => {
                    deleteABook(item.id);
                  }}
                >
                  Delete
                </button> */}
              {/* </th> */}
              <th><Link to={"update/" + item.id}>
                <button className="btn btn-success">Update</button>
                </Link></th>
              <th><button onClick={() => {openModal(item)}}>Delete</button></th>
            </tr>
          ))}
        </tbody>
      </table>
     { showModal && <ModalDelete book = {objectDelete} setShowModal = {setShowModal} ></ModalDelete> } 
    </>
  );
}
