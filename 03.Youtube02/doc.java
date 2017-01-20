React Tutorial 
https://www.youtube.com/watch?v=yZ0f1Apb5CU&list=PL4cUxeGkcC9i0_2FF-WhtRIfIJ1lXlTZR&index=1

01.Introduction {
	- What you need to know... {
		+ HTML
		+ JavaScript
		+ Unafraid of using the command line (very simple)
	}
	- What is React? {
		+ JavaScript library for creating user interfaces
			* Full single page web applications
			* Just certain parts of a website (like a search form)
		+ Component-based
		+ Very fast (thanks to the virtual DOM)
		+ Created by Facebook
	}
	- JavaScript components: {
		+ search component (1)
		+ directory component (2)
		+ signup component (3)
		(1), (2), (3) -> HTML/ DOM
	}
	- What we will learn... {
		+ Installing React and setting up a workflow with webpack
		+ Create a simple to-do app, looking at:
			* Components, props, state, events and more
		+ Routing
		+ Create-react-app
	}
	- https://nodejs.org/en -> download
	- cmder.net -> for Windows users only
	- atom: https://atom.io 
	{
		+ UI Theme: One Dark
		+ Syntax Theme: Atom Monokai
	}
	- app overview: {
		+ list todo
		+ add todo
		+ delete todo
		+ routing
	}
}
015.Course Files: {
	- https://github.com/iamshaunjp/react-playlist
	- install git
	- open Atom
	- checkout code: git checkout lesson-1
}
02.Setup with Webpack (& without) {
	- JSX/ ES6/ BABEL {
		+ We write React apps in     -------------------> Browsers understand....
			JSX/ ES6					BABEL			- Vanilla JS
	}
	- 2 Ways to setup React & Babel: {
		+ Quick way: {
			* Add React and Babel scripts to head of HTML
			* Use <script type="text/babel" src="index.js">
		}
		+ Not so quick (but better) way: {
			* Use npm to install React and Babel
			* Use webpack to configure Babel
			* Can also use the webpack-dev-server
		}
	}
	- npm init -> package.json
	- npm install react react-dom -save
	- npm install babel-core babel-loader babel-preset-es-2015 babel-preset-react -save-dev
	- npm install webpack webpack-dev-server --save-dev
	- touch 'webpack.config.js' <- github.com/iamshaunjp/react-playlist/blob/master/webpack.config.js
	- create file: '/src/app/index.js': {
		alert("It woooooorks");
	}
	- 'package.json': {
		"start": "npm run build",
		"build": "webpack -d && webpack-dev-server --content-base src/ --inline --hot --port 1234"
	}
	- index.html: {
		<body>
			<script src="/app/bundle.js"></script>
		</body>
	}
	- npm start
}
03.React Components: {
	- Most of our React code comprises of components: {
		+ Search bar component
		+ Sign-up component
		+ To-do list component {
			* List item component
			* Add new item (form) component
		}
	}
	- index.js: {
		var React = require("react");
		var ReactDom = require("react-dom");
		
		//Create component
		var TodoComponent = React.createClass({
			render: function() {
				return (
					<h1>Helloooooooo</h1>
				);
			}
		});
		
		//put component into html page
		ReactDom.render(<TodoComponent/>, 
			document.getElementById("todo-wrapper"));
	}
	- index.html: {
		<div id="todo-wrapper"></div>
	}
}
035.React Dev Tools: {
	- render: function() {
		return (
			<div>
				<h1>Ninjaaaaaaaaaaaas</h1>
				<p>Hellooooooooooo</p>
			</div>
		);
	}
	- Chrome web store: search for "react developer tools"
		-> F12-React
}