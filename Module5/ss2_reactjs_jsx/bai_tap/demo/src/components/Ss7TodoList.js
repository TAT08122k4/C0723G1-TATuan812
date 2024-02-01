import { ErrorMessage, Field, Form, Formik } from "formik";
import 'react-toastify/dist/ReactToastify.css'
import * as Yup from 'yup';
import {Bars} from 'react-loader-spinner';
import {toast,ToastContainer} from "react-toastify";
import 'bootstrap/dist/css/bootstrap.min.css';

import { getAll } from "../service/TodoService";
import { addNewTask } from "../service/TodoService";
import { useEffect, useState } from "react";


export function TodoList(){
    const [tasks,setTasks] = useState([])
  useEffect (() => {
    const displayToDoList = async () => {
        try {
            const result = await getAll()
            setTasks(result)
        } catch (error) {
            console.log(error);  
        }
    }
    displayToDoList()
  },[] );

  async function createTask(values) {
    let result = await addNewTask(values);
    if (result) {
        alert("Task added");
        setTasks(await getAll());
    } else {
        console.error("error creating task");
    }
}
    const initValues = {
        task : "Todo n",
     }
     const validateObject = {
         task : Yup.string().required("Không Được Để Rỗng")
     }
     return (
         <>
         <Formik initialValues={initValues} 
         validationSchema={Yup.object(validateObject)}
         onSubmit={(values,{setSubmitting}) => {
            createTask(values)
        
         }}
         >
             {
                 ({isSubmitting}) =>(
                     <div className="container">
             <h1>Todo List</h1>
             <Form>
             <label htmlFor='taskTodo' className="form-label">Task Todo</label><br></br>
             <Field type='text' id='taskTodo' name='task' /><br></br>
             <ErrorMessage name="task" component='span' className="form-err" />
             {isSubmitting ? <Bars   height="80"
   width="80"
   radius="9"
   color="green"
   ariaLabel="loading"
   wrapperStyle
   wrapperClass
   visible={true} /> : <button type="submit" className="btn btn-primary">Gửi</button>}
             </Form>
             <ul>
             {
                
                 tasks.map((item,index)=> (
                     <li key={item.id}>
                   {item.task}
                     </li>
                 ))
             }
         </ul>
                     </div>
                 )
             }
 
         </Formik>
         
         <ToastContainer></ToastContainer>
        
         </>
     )
 }
    

  