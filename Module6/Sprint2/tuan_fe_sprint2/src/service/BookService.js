import axios from "axios"
export const getListBooks = async (page,nameBook,authorId,genreId,languageId) => {
    try {
        const rs = await axios.get(`http://localhost:8080/book/list?page=${page}&nameBook=${nameBook}&authorId=${authorId}&genreId=${genreId}&languageId=${languageId}`)
        return rs.data
    } catch (error) {
        throw error.response
    }
}
export const findBookById = async (id) => {
    try {
        const rs = await axios.get(`http://localhost:8080/book/find/${id}` )
        return rs.data
    } catch (error) {
        throw error.response
    }
}
export const getListAuthor = async () => {
    try {
        const rs = await axios.get(`http://localhost:8080/book/listAuthor`)
        return rs.data
    } catch (error) {
        throw error.response
    }
}
export const getListLanguage = async () => {
    try {
        const rs = await axios.get(`http://localhost:8080/book/listLanguage`)
        return rs.data
    } catch (error) {
        throw error.response
    }
}
export const getListGenre = async () => {
    try {
        const rs = await axios.get(`http://localhost:8080/book/listGenre`)
        return rs.data
    } catch (error) {
        throw error.response
    }
}
export const topLikeBooks = async () => {
    try {
        const rs = await axios.get(`http://localhost:8080/book/topBooks`)
        return rs.data
    } catch (error) {
        console.log(error);
    }
}