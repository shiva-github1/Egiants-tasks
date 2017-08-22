import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to React</h2>
            <h3>This is Shiva</h3>
        </div>
        <p className="App-intro">
          This is my React App
        </p>
      </div>
    );
  }
}

export default App;
