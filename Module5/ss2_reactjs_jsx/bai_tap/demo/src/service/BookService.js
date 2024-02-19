import axios, { HttpStatusCode } from 'axios';;
export const getAll = async () => {
    try {
        const reponse = await axios.get("http://localhost:8080/book");
        return reponse.data
    } catch (e) {
        console.log(e)
    }
}
export const addNewBook = async (book) =>{
    try {
        const response = await axios.post("http://localhost:8080/book",book);
        return true;
        
    } catch (e) {
        console.log(e)
        
    }
}
export const deleteBook = async (id) => {
    try {
        const response = await axios.delete("http://localhost:8080/book/"+ id)
        console.log(id);
        return response.status;
    } catch (error) {
        console.log(error)
    }
}
export const updateBook = async (book) => {
    try {
        const response = await axios.patch("http://localhost:8080/book/" + book.id , book)
        return response.status
    } catch (error) {
        console.log(error);
    }
}
export const findById = async (id) => {
    try {
        const response = await axios.get(`http://localhost:8080/book/${id}`)
        return response.data        
    } catch (error) {
        console.log(error);
    }
}
