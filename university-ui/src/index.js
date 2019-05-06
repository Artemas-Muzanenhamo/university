import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import registerServiceWorker from './registerServiceWorker';
import App from "./App";
import {BrowserRouter as Router} from "react-router-dom";
import 'uikit';

ReactDOM.render(
    <Router>
        <App />
    </Router>,
    document.getElementById('root')
);
registerServiceWorker();
