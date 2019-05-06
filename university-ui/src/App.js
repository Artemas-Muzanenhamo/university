import React, {Component} from 'react';
import './App.css';
import Degree from "./components/degree/degree";
import Student from "./components/student/student";
import Tutor from "./components/tutor/tutor";
import {Route} from "react-router-dom";

class App extends Component {
    render() {
        return (
            <div>
                <h1 className="App" style={{textAlign: "center"}}>
                    University App
                </h1>
                <button>DEGREE</button>
                <button>TUTOR</button>
                <button>STUDENT</button>
                <Route path="/degree" component={Degree} />
                <Route path="/tutor" component={Tutor} />
                <Route path="/student" component={Student} />
            </div>
        );
    }
}

export default App;
