/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */
import React, { Component } from 'react';
import { StyleSheet, Text, View} from 'react-native';

export default class Header extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.title}>
          Line OX
        </Text>
      </View>
    )
  }
}

//StyleSheet Layout
const styles = StyleSheet.create({
  container: {
    marginTop: 20,
    backgroundColor: 'deepskyblue',
    flexDirection: 'row'
  },
  title: {
    color: 'white',
    fontWeight: 'bold',
    flex: 1,
    fontSize: 40,
    textAlign: 'center',
    margin: 50,
  }
})
