import axios from "axios";
export const register = async (account) => {
  try {
    const rs = await axios.post(
      `http://localhost:8080/account/register`,
      account
    );
    return rs;
  } catch (error) {
    throw error.response;
  }
};

const axiosClient = axios.create({
    headers: {
        "Content-Type": "application/json",
        Accept: "application/json",
        "X-Requested-With": "XMLHttpRequest"
    }
})

export const loginAccount = async (data) => {
    try {
      const rs = await axiosClient.post(
        `http://localhost:8080/account/login`,
        data,
      );
      return rs.data;
    } catch (error) {
      throw error.response;
    }
  };
  export const getAccount = async (id) => {
    try {
      const token = localStorage.getItem("authToken")
      const rs = await axios.get(`http://localhost:8080/account/find/${id}` , {
        headers: {
          Authorization: `Bearer ${token}`
      }
      })
      return rs.data
    } catch (error) {
      console.log(error);
    }
  }
  export const editAccount= async (values,id) => {
    try {
      const token = localStorage.getItem("authToken")
      const rs = await axios.patch(`http://localhost:8080/account/edit/${id}` ,values , {
        headers: {
          Authorization: `Bearer ${token}`
      }
      })
      return rs.data
    } catch (error) {
      throw error.response
    }
  }
