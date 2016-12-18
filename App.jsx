import React from 'react';
class App extends React.Component {
	render() {
		var i = 1;
		
		var myStyle = {
			fontSize: 100,
			color: '#FF0000'
		}
		
		return (
			<div>
				<h1 style={myStyle}>Header</h1>
				<h2>Content</h2>
				<p data-myattribute = "some value">This is the content!!!</p>
				Hello World!!!
				<p>{i == 1 ? 'One': 'not one'}</p>
			</div>
		);
	}
}
export default App;