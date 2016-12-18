import React from 'react';
class App extends React.Component {
	render() {
		var i = 1;
		return (
			<div>
				<h1>Header</h1>
				<h2>Content</h2>
				<p data-myattribute = "some value">This is the content!!!</p>
				Hello World!!!
				<p>{i == 1 ? 'One': 'not one'}</p>
			</div>
		);
	}
}
export default App;