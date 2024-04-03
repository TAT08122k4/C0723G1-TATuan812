import axios from "axios"
export const getListCart = async (id) => {   
        try {
            const token = localStorage.getItem("authToken")
            const data = await axios.get(`http://localhost:8080/cart/list/${id}`, {
                 headers: {
                    Authorization: `Bearer ${token}`
                }
            });
            return data.data;
        } catch (e) {
            console.log(e)
        }
}

export const setQuantity = async (quantity, id) => {
    try {
        const token = localStorage.getItem("authToken");
        if (!token) {
            console.log("No authToken found in localStorage");
            return;
        }
        const rs = await axios.patch(`http://localhost:8080/cart/updateQuanlity/${quantity}/${id}`, null, {
            headers: {
                Authorization: `Bearer ${token}`
            }
        });
        console.log(rs); // In ra kết quả từ server
    } catch (error) {
        console.log(error);
    }
}

export const addAndCheckItem = async (accountId,bookId) => {
    try {
        const token = localStorage.getItem("authToken")
        const rs = await axios.get(`http://localhost:8080/cart/checkAddToCart/${accountId}/${bookId}` , {
            headers: {
                Authorization: `Bearer ${token}`
            }
        })
        return rs.data
    } catch (error) {
        console.log(error);
    }

}
export const deleteItemInCart = async (id) => {
    try {
        const token = localStorage.getItem("authToken")
        const rs = await axios.delete(`http://localhost:8080/cart/deleteItemInCart/` + id , {
            headers: {
                Authorization: `Bearer ${token}`
            }
        })
        return rs.data
    } catch (error) {
        console.log(error);
    }
}
export const showMoneyToPay = async (id) => {
    try {
        const token = localStorage.getItem("authToken")
        const rs = await axios.get(`http://localhost:8080/cart/showSumMoney/` + id , {
            headers: {
                Authorization: `Bearer ${token}`
            }
        })
        return rs.data
    } catch (error) {
        console.log(error);
        
    }
}
export const payment = async (price , id) => {
    try {
        const rs = await axios.get(`http://localhost:8080/payment/createPay?price=${price}&idAccount=${id}`)
        return rs.data
    } catch (error) {
        console.log(error);
    }
}
