/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */
import React, { Component } from 'react';
import { AppRegistry, StyleSheet, Text, View, Image } from 'react-native';
import MyApp from './src/components/MyApp';

 export default class Animation extends Component {
   render() {
     return (
       <View style={styles.container}>
         <MyApp />
       </View>
     );
   }
 }

//StyleSheet Layout
 const styles = StyleSheet.create({
   container: {
     flex: 1,
     backgroundColor: '#F5FCFF',
   },
 });


AppRegistry.registerComponent('Animation', () => Animation);
