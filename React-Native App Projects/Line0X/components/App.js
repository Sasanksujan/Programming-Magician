/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */
import React, { Component } from 'react';
import {StyleSheet, Text, View, TouchableOpacity} from 'react-native';
import Header from './Header';
import GameBoard from './GameBoard';

export default class App extends Component {
  state: {
    gameStarted: boolean
  };

//initialize state in constructor
  constructor() {
    super()
    this.state={ gameStarted: false }
  }
  startGame() {
    this.setState({ gameStarted: true })
  }

  render() {
    const { gameStarted } = this.state
    return (
      <View style={styles.container}>
        <Header />
        {
          gameStarted ? (
            <GameBoard />
          ) : (
            <View>
              <Text style={styles.heading}>
                To play game
              </Text>
              <TouchableOpacity onPress={() => this.startGame()}>
                <Text style={styles.instructions}>
                  Tap here to Continue ...
                </Text>
              </TouchableOpacity>
            </View>
          )
        }
      </View>
    )
  }
}

//StyleSheet Layout
const styles = StyleSheet.create({
  container: {
    alignItems: 'center',
    flex: 1,
    backgroundColor: 'deepskyblue',
  },
  heading: {
    fontSize: 20,
    marginTop: 50,
    fontWeight: 'bold',
    textAlign: 'center'
  },
  instructions: {
    textAlign: 'center',
    marginTop: 20,
    color: 'black',
    marginBottom: 5,
  },
})
