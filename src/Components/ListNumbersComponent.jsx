import React, { Component } from 'react';
import PrimeNumberService from '../services/PrimeNumberService';

class ListNumbersComponent extends Component {
    constructor(props){
        super(props)
        this.state ={
            number: "",
            primeNumbers: []
        }
        this.changeNumberHandler = this.changeNumberHandler.bind(this);
        this.submitNumber = this.submitNumber.bind(this);
    }
  
   

    submitNumber= (e)=>{
        e.preventDefault();
        let numbers = this.state.primeNumbers;
        let numb = this.state.number;

        PrimeNumberService.create(numb).then((Response) =>{
            this.setState({primeNumbers: Response.data})
            var data = Response.data
            data.forEach(element => {
                numbers.push(element);
            });
        });
    }

    changeNumberHandler= (event)=>{
        this.setState({number: event.target.value});
    }
    
    render() {
        return (
            <div className="container">
                <h2 className="text-center">Enter Number</h2>
                <div className="row">
                    <div className="col-md-6 offset-md-3">
                    <input placeholder="Enter Number" name="number" className="form-control" value={this.state.number} onChange={this.changeNumberHandler}/>
                    <button className="btn btn-success" onClick={this.submitNumber}>Prime Numbers</button>
                    </div>                   
                </div>
                <br/>
                <div className="row">
                    <div className="col-md-6 offset-md-3">
                        <ul>
                                {
                                     this.state.primeNumbers.map(
                                         number => 
                                         <li>
                                             {number}
                                        </li>
                                    )
                                
                                }
                         </ul>
                    </div>
                </div>
                
                
            </div>
        );
    }
}

export default ListNumbersComponent;