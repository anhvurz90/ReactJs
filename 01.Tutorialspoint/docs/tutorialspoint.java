	REACTJS - TUTORIAL
	
1.ReactJS Home {
	- Lib of FB
	- Used for handling VIEW layer, for Web and Mobile
	- Prerequisites: Js(Es6), HTML5, Css
}
2.ReactJS - Overview {
	- For building REUSABLE UI COMPONENT
	2.1.React features:
		- JSX: Js syntax extension
		- Components
		- Undirectional(One way) data flow and FLUX
	2.2.React Advantages:
		- Uses VIRTUAL DOM -> better performance.
		- Can be used BOTH on client & server.
}
3.ReactJS - Environment Setup: {
	3.0.NodeJS & NPM
	3.1.Install Global Packages:
		- npm install -g babel
		- npm install -g babel-cli
	3.2.Create Root Folder
		- mkdir reactApp
		- cd reactApp
		- npm init -> create package.json
	3.3.Add Dependencies and plugins
		- npm install webpack --save
		- npm install webpack-dev-server --save
		- npm install react --save
		- npm install react-dom --save
		- npm install babel-core
		- npm install babel-loader
		- npm install babel-preset-react
		- npm install babel-preset-es2015
	3.4.Create files:
		- touch index.html
		- touch App.jsx
		- touch main.js
		- touch webpack.config.js
	3.5.Set Compiler, Server and Loader
		- Open webpack-config.js & code:
		var config = {
			entry: './main.js',
			output: {
				path: './',
				filename: 'index.js',
			},
			
			devServer: {
				inline: true,
				port: 8080
			},
			
			module: {
				loaders: [
					{
						test: /\.jx?$/,
						exclude: /node_modules/,
						loader: 'babel',
						
						query: {
							presets: ['es2015', 'react']
						}
					}
				]
			}
		}
		
		module.exports = config;
		
		- Open package.json:
			+ delete: "test" "echo \"Error: no test specified\" && exit 1"
			    inside "scripts"
			+ add: "start": "webpack-dev-server --hot"
	3.6.index.html:
		<body>
			<div id="app"></div>
			<script src = "index.js"></script>
		</body>
	3.7.App.jsx and main.js
		App.jsx:
			import React from 'react';
			class App extends React.Component {
				render() {
					return (
						<div>
							Hello World!!!
						</div>
					);
				}
			}
			export default App;
		main.js:
			import React from 'react';
			import ReactDOM from 'react-dom';
			import App from './App.jsx';
			
			ReactDOM.reander(<App/>, document.getElementById('app'));
	3.8.Running the Server:
		npm start
}
	
4.ReactJS - JSX {
	Used for TEMPLATING instead of regular JavaScript.
		faster, type-safe -> error found in compile time, easier to write template
	4.1.Using JSX:
	4.2.Nested Elements:
		import React from 'react';
		class App extends React.Component {
			render() {
				return (
					<div>
						<h1>Header</h1>
						<h2>Content</h2>
						<p>This is the content!!!</p>
					</div>
				);
			}
		}
		export default App;
	4.3.Attributes: {
		<p data-myattribute = "some value">This is the content!!!</p>
	}
	4.4.JavaScript expression:
		import React from 'react';
		class App extends React.Component {
			render() {
				var i = 1;
				return (
					<div>
						<h1>{i == 1 ? 'True' : 'False'}</h1>
					</div>
				);
			}
		}
		export default App;
	4.5.Styling {
		var myStyle = {
			fontSize: 100,
			color: '#FF0000'
		}
		return (
			<div>
				<h1 style={myStyle}>Header</h1>
			</div>
		);
	}
	4.6.Comments: {
		import React from 'react';
		class App extends React.Component {
			render() {
				return (
					<div>
						<h1>Header</h1>
						{//End of the line comments...
						}
						{/*Multi line comment...*/}
					</div>
				);
			}
		}
		export default App;
	}
	4.7.Naming Convention {
		- Start with Uppercase
		- 'className' instead of 'class'
		- 'htmlFor' instead of 'for'
	}
}

5.ReactJS - Components {
	5.1.Stateless Example: {
		App.jsx: {
			import React from 'react';
			class App extends React.Component {
				render() {
					return (
						<div>
							<Header/>
							<Content/>
						</div>
					);
				}
			}
			
			class Header extends React.Component {
				render() {
					return (
						<div>
							<h1>Header</h1>
						</div>
					);
				}
			}
			
			class Content extends React.Component {
				render() {
					return (
						<div>
							<h2>Content</h2>
							<p>The content text!!!</p>
						</div>
					);
				}
			}
			export default App;
		}
	}
	
	5.2.Stateful Example: {
		App.jsx: {
			import React from 'react';
			
			class App extends React.Component {
				constructor() {
					super();
					
					this.state = {
						data: [
							{	"id": 1,
								"name": "Foo",
								"age": "20"},
							{	"id": 2,
								"name": "Bar",
								"age": "30" },
							{	"id": 3,
								"name": "Baz",
								"age": "40" }
						]
					}
				}
				
				render() {
					return (
						<div>
							<Header/>
							<table>
								<tbody>
									{this.state.data.map((person, i) 
										=><TableRow key={i} data={person}/>)}
								</tbody>
							</table>
						</div>
					);
				}
			}
			
			class Header extends React.Component {
				render() {
					return (
						<div>
							<h1>Header</h1>
						</div>
					);
				}
			}
			
			class TableRow extends React.Component {
				render() {
					return (
						<tr>
							<td>{this.props.data.id}</td>
							<td>{this.props.data.name}</td>
							<td>{this.props.data.age}</td>
						</tr>
					);
				}
			}
			export default App;
		}
		
		
	}
	
}

6.ReactJS - State {
	- Should create 1 container component that keep the state for all components
	App.jsx {
		import React from 'react';
		class App extends React.Component {
			constructor(props) {
				super(props);
				
				this.state = {
					header: "Header from state...",
					content: "Content from state..."
				}
			}
			
			render() {
				return (
					<div>
						<h1>{this.state.header}</h1>
						<h2>{this.state.content}</h2>
					</div>
				);
			}
		}
		
		export default App;
	}
}
7.ReactJs - Props Overview {
	- Diff from state: Props are immutable.
		+ Container component should define state that can be updated and changed.
		+ Child components should only pass data from the state using props.
	7.1 {
		App.jsx: {
			import React from 'react';
			class App extends React.Component {
				render() {
					<div>
						<h1>{this.props.headerProp}</h1>
						<h2>{this.props.contentProp}</h2>
					</div>
				}
			}
		}
		main.js: {
			import React from 'react';
			import ReactDOM from 'react-dom';
			import App from './App.jsx';
			
			ReactDOM.render(<App 	headerProp="Header from props..."
								contentProp="Content from props..."/>,
						document.getElementById('app'));
			export default App;
		}
	}
	7.2.Default Props: {
		App.jsx: {
			import React from 'react';
			class App extends React.Component {
				render() {
					return (
						<div>
							<h1>{this.props.headerProp}</h1>
							<h2>{this.props.contentProp}</h2>
						</div>
					);
				}
			}
			App.defaultProps = {
				headerProp: "Header from props...",
				contentProp: "Content from props..."
			}
			
			export default App;
		}
		main.js: {
			import React from 'react';
			import ReactDOM from 'react-dom';
			import App from './App.jsx';
			
			ReactDOM.render(<App/>, document.getElementById('app'));
		}
	}
	7.3.State and Props: {
		App.jsx: {
			import React from 'react';
			
			class App extends React.Component {
				constructor(props) {
					super(props);
					this.sate = {
						header:  "Header from ...",
						content: "Content from..."
					}
				}
				
				render() {
					return (
						<div>
							<Header headerProp={this.state.header}/>
							<Content contentProp={this.state.content}/>
						</div>
					);
				}
			}
			
			class Header extends React.Component {
				render() {
					return (
						<div>
							<h1>{this.props.headerProp}</h1>
						</div>
					);
				}
			}
			
			class Content extends React.Component {
				render() {
					return (
						<div>
							<h2>{this.props.contentProp}</h2>
						</div>
					);
				}
			}			
			export default App;
		}
		
		main.js: {
			import React from 'react';
			import ReactDom from 'react-dom';
			import App from './App.jsx';
			
			ReactDOM.render(<App/>, document.getElementById("app"));
		}
	}
}



		
	
























































