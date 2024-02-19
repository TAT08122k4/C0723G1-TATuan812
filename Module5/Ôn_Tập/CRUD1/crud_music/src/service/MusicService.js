import axios , {HttpStatusCode} from 'axios';
export const getAll = async () => {
    try {
        const response = await axios.get("http://localhost:8080/music");
        return response.data
    } catch (error) {
        console.log(error);
    }
}
export const addNew = async (music) => {
    try {
        const response = await axios.post("http://localhost:8080/music",music)
        return true;
    } catch (error) {
        console.log(error);
    }
}
export const findById = async (id) => {
    try {
        const response = await axios.get("http://localhost:8080/music/" + id)
        return response.data;
    } catch (error) {
        console.log(error);
    }
}
export const updateMusic = async (music) => {
    try {
        const response = await axios.patch("http://localhost:8080/music/"+ music.id , music)
        return response.status
    } catch (error) {
        console.log(error);
    }
}
export const deleteMusic = async (id) => {
    try {
        const response = await axios.delete("http://localhost:8080/music/"+id)
        return response.data
    } catch (error) {
        console.log(error);
    }
}
