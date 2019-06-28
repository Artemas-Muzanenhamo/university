import React, {Component} from 'react';
import './App.css';
import Degree from "./components/degree/degree";
import Student from "./components/student/student";
import Tutor from "./components/tutor/tutor";
import {Link, Route} from "react-router-dom";

class App extends Component {
    render() {
        return (
            <div>
                <h1 className="App" style={{textAlign: "center"}}>
                    University App
                </h1>
                <Link to="/degree">
                    <button>DEGREE</button>
                </Link>
                <Link to="/tutor">
                    <button>TUTOR</button>
                </Link>
                <Link to="/student">
                    <button>STUDENT</button>
                </Link>
                {/*TODO: Abstract Routes*/}
                <Route path="/degree" component={Degree} />
                <Route path="/tutor" component={Tutor} />
                <Route path="/student" component={Student} />
            </div>
        );
    }
}

export default App;
