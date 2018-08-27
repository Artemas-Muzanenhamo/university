import React, { Component } from 'react';

class Students extends Component {
    render() {
        return (
            <div className="Students">
                My Students
                {this.props.test}
            </div>
        );
    }
}

export default Students;
