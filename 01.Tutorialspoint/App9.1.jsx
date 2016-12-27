import React from 'react';

class App91 extends React.Component {
	constructor() {
		super();
		
		this.state = {
			data: []
		}
		
		this.setStateHandler = this.setStateHandler.bind(this);
	};
	
	setStateHandler() {
		var item = "setState...";
		var myArray = this.state.data;
		myArray.push(item);
		this.setState({data: myArray});
	};
	
	render() {
		return (
			<div>
				<button onClick={this.setStateHandler}>SET STATE</button>
				<h4>State array: {this.state.data}</h4>		
			</div>
		);
	};	
}

export default App91;