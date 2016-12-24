import React from 'react';

class App42 extends React.Component {
	render() {
		return (
			<div>
				aa
				<h1>{this.props.headerProp}</h1>
				<h2>{this.props.contentProp}</h2>
			</div>
		);
	}
}	
App42.defaultProps = {
	headerProp: "Header from default props...",
	contentProp: "Content from default props..."
}


export default App42;