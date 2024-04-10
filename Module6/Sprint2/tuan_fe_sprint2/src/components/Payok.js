import { useEffect, useState } from "react";
import { Link, useNavigate , useLocation , useParams } from "react-router-dom"; 
import axios from "axios"


export function PaymentSuccessfully() {
    const back = useNavigate();
    const {id} = useParams();
    const [resultPayment, setResultPayment] = useState("");
    const token = localStorage.getItem("authToken")
    useEffect(() => {
        const setPaymentOk = async () => {
            const data = await axios.get(`http://localhost:8080/payment/payment_infor/${id}`, {
                headers: {
                    Authorization: `Bearer ${token}`
                }
            });
            setResultPayment(data.data);
        }
        setPaymentOk();
        back(`/historyBooking`, {state: {data: "OK"}})
    }, []);
}