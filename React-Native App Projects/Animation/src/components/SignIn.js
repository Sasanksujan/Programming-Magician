import React, { Component, PropTypes } from 'react';
import Emblem from './Emblem';
import App from './App';
import Wallpaper from './Wallpaper';
import Icon from './Icon';
import Credentials from './Credentials';

export default class SignIn extends Component {
	render() {
		return (
			<Wallpaper>
				<Emblem/>
				<App/>
				<Credentials/>
				<Icon/>
			</Wallpaper>
		);
	}
}
