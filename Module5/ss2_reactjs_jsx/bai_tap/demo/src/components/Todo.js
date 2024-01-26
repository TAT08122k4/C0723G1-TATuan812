import { Component } from "react";


export class Todo extends Component{
    constructor(props){
        super();
        this.state = {
            work : '',
            workList : ["Làm Bài","Học Bài"]
        }
    }
    handleInput(value){
        this.setState({
            work : value
        })
    }
    addWork(){
        this.setState((prev) => (
            {
                workList : [... prev.workList,prev.work],
                work : ''
            }
        ))
    }
    
    render() {
        return (
            <>
            <h1>Todo List</h1>
            <input value={this.state.work} onChange={(event)=> this.handleInput(event.target.value) }  />
            <button onClick={() => this.addWork()}  >Add</button>
            <ul>
                {
                    this.state.workList.map((work,index) =>(
                        <li key={index}>{work}</li>
                    )
                    )
                }
            </ul>
            
            </>
        );
    }
}