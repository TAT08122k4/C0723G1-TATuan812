import axios from 'axios';

export const getAll  = async () => {
    try {
        const reponse = await axios.get("http://localhost:8080/tasks");
        return reponse.data;
    } catch (e) {
        console.log(e)
        
    }

}
export const addNewTask = async (task) => {
    try {
        const response = await axios.post("http://localhost:8080/tasks",task);
        return true;
    } catch (error) {
        console.log(error);
    }
}