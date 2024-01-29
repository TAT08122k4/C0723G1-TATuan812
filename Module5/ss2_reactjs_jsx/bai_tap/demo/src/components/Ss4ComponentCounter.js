import { useState } from "react";
export function Counter(){
    const [count,setCount] = useState(0);
    const increase = () => {
    setCount((value) => value + 1)
    }
    const decrease = () => {
        setCount((value) => value -1)
    }
    const reset = () => {
        setCount(0)
    }
    return (
    <>
    <p>Count:{count}</p>
    <button onClick={() => increase()}>Add 1</button>
    <button onClick={() => {increase();increase()} }>Add 2</button>
    <button onClick={() => {decrease()}}>Minus</button>
    <button onClick={() => {reset()}}>Reset</button>
    </>)
}