import { Modal, Button } from "react-bootstrap";
import { deleteBook } from "../service/BookService";
import { toast } from "react-toastify";

export function ModalDelete({ book,setShowModal }) {
  const deleteABook = () => {
    deleteBook(book.id).then(() => {
    setShowModal(false)
    toast("Delete Success")

    });
  };

  return (
    <>
      <div style={{ display: "block", width: 700, padding: 30 }}>
        <Modal.Dialog>
          <Modal.Header closeButton>
            <Modal.Title>Xoá {book.name} ? </Modal.Title>
          </Modal.Header>
          <Modal.Body>
            <p>Bạn Có Chắc Chắn Muốn Xoá {book.name}</p>
          </Modal.Body>
          <Modal.Footer>
            <Button
              variant="primary"
              onClick={() => {
                deleteABook();
              }}
            >
              Delete
            </Button>
            <Button variant="secondary" onClick={() => {
                setShowModal(false)
            }}  >Close</Button>
          </Modal.Footer>
        </Modal.Dialog>
      </div>
    </>
  );
}
