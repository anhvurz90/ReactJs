import React from 'react';

class App8 extends React.Component {
	render() {
		this.prop
		return (
			<div>
				<h3>Array: {this.props.propArray}</h3>
				<h3>Bool: {this.props.propBool ? "True..." : "False..."}</h3>
				<h3>Func: {this.props.propFunc(3)}</h3>
				<h3>Number: {this.props.propNumber}</h3>
				<h3>String: {this.props.propString}</h3>
				<h3>Object: {this.props.propObject.objectName1}</h3>
				<h3>Object: {this.props.propObject.objectName2}</h3>
				<h3>Object: {this.props.propObject.objectName3}</h3>
			</div>
		);
	}
}

App8.propTypes = {
	propArray: React.PropTypes.array.isRequired,
	propBool: React.PropTypes.bool.isRequired,
	propFunc: React.PropTypes.func,
	propNumber: React.PropTypes.number,
	propString: React.PropTypes.string,
	propObject: React.PropTypes.object
}

App8.defaultProps = {
	//propArray: [1, 2, 3, 4, 5],
	propArray: 1,
	propBool: true,
	propFunc: function(e) { return e; },
	propNumber: 1,
	propString: "String value...",
	
	propObject: {
		objectName1: "objectValue1",
		objectName2: "objectValue2",
		objectName3: "objectValue3",
	}	
}

export default App8;