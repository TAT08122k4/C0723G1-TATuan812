import axios , {HttpStatusCode} from 'axios';
export const getAll = async () => {
    try {
        const response = await axios.get("http://localhost:8081/api/products")
        return response.data
    } catch (error) {
        console.log(error);
    }
}
export const findById = async (id) => {
    try {
        const response = await axios.get("http://localhost:8080/products/" + id)
        return response.data
    } catch (error) {
        console.log(error);
    }
}
export const updateProduct = async (product) => {
    try {
        const response = await axios.patch("http://localhost:8080/products/" + product.id , product)
        return response.status
    } catch (error) {
        console.log(error);
    }
}
export const createProduct = async (product) => {
    try {
     await axios.post("http://localhost:8080/products" , product)
        return true;
    } catch (error) {
        console.log(error);
    }
}
export const deleteProduct = async (id) => {
    try {
         await axios.delete("http://localhost:8080/products/" + id)
        return true
    } catch (error) {
            console.log(error);
    }
}
  
