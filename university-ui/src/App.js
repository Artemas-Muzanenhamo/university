import React, {Component} from 'react';
import './App.css';
import Degree from "./components/degree/degree";
import Student from "./components/student/student";
import Tutor from "./components/tutor/tutor";

class App extends Component {
    render() {
        return (
            <div>
                <h1 className="App" style={{textAlign: "center"}}>
                    University App
                </h1>
                <Degree/>
                <Student/>
                <Tutor/>
            </div>
        );
    }
}

export default App;
