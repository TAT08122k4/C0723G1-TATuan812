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
            const searchParams = new URLSearchParams(window.location.search);
            const status = searchParams.get('vnp_TransactionStatus');
            console.log(status);
            const data = await axios.get(`http://localhost:8080/payment/payment_infor/${id}`, {
                params:{
                    status: status
                },
                headers: {
                    Authorization: `Bearer ${token}`
                }
            });
            if(data.data === true){
                back(`/historyBooking`, {state: {data: "OK"}})
            }else{
                back(`/historyBooking`, {state: {data: "NO"}})
            }
        }
        setPaymentOk();
        
    }, []);
}