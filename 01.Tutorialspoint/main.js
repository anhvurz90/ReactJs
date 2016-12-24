import React from 'react';
import ReactDOM from 'react-dom';
import App from './App.jsx';
import App1 from './App1.jsx';
import App2 from './App2.jsx';
import App3 from './App3.jsx';
import App4 from './App4.jsx';

//ReactDOM.render(<App/>, document.getElementById("app"));
//ReactDOM.render(<App1/>, document.getElementById("app"));
//ReactDOM.render(<App2/>, document.getElementById("app"));
//ReactDOM.render(<App3/>, document.getElementById("app"));
ReactDOM.render(<App4 headerProp="Header from props..."
					contentProp="Content from props..."/>,
				document.getElementById('app'));