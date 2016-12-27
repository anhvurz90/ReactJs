import React from 'react';
import ReactDOM from 'react-dom';
import App from './App.jsx';
import App1 from './App1.jsx';
import App2 from './App2.jsx';
import App3 from './App3.jsx';
import App4 from './App4.jsx';
import App42 from './App4.2.jsx';
import App43 from './App4.3.jsx';
import App8 from './App8.jsx';
import App91 from './App9.1.jsx';

//ReactDOM.render(<App/>, document.getElementById("app"));
//ReactDOM.render(<App1/>, document.getElementById("app"));
//ReactDOM.render(<App2/>, document.getElementById("app"));
//ReactDOM.render(<App3/>, document.getElementById("app"));
//ReactDOM.render(<App4 headerProp="Header from props..."
//					contentProp="Content from props..."/>,
//				document.getElementById('app'));
				
//ReactDOM.render(<App42/>, document.getElementById('app'));
//ReactDOM.render(<App43/>, document.getElementById('app'));
//ReactDOM.render(<App8/>, document.getElementById('app'));

var app = document.getElementById("app");
ReactDOM.render(<App91/>, app);