import { Form, Formik } from "formik";

export function DangKi(){
    return (
        <>
        <Formik>
            <Form>
            <div className="container" id="container">
  <div className="form-container sign-up-container">
    <form action="#">
      <h1>Create Account</h1>
      <input type="text" placeholder="Name" />
      <input type="email" placeholder="Email" />
      <input type="password" placeholder="Password" />
      <button>Sign Up</button>
    </form>
  </div>
</div>

    </Form>
    </Formik>
        
        </>
    )
}