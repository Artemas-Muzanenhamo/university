import React, { Component } from 'react';
import Students from './Student/Students';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        My App
          <Students test="Hello World"/>
      </div>
    );
  }
}

export default App;
