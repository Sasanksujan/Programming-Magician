/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */
import React, { Component } from 'react';
import { StyleSheet, Text, View, TouchableOpacity} from 'react-native';
import { GAME_RESULT_NO, GAME_RESULT_USER, GAME_RESULT_AI, GAME_RESULT_TIE} from '../constants/game';


export default class Header extends Component {
  generateResultText(result: number) {
    //Switch case for finding the result
    switch (result) {
      case GAME_RESULT_USER:
        return 'Congrats!, WON the game'
      case GAME_RESULT_AI:
        return 'You LOST the game!'
      case GAME_RESULT_TIE:
        return 'Oh, it is a tie!'
      default:
        return ''
    }
  }

  render() {
    const { result, onRestart } = this.props
    return (
      <View>
        <Text style={styles.text}>{ this.generateResultText(result) }</Text>
        {
          result !== GAME_RESULT_NO && (
            <TouchableOpacity onPress={() => onRestart()}>
              <Text style={styles.instructions}>
                PLAY AGAIN !!
              </Text>
            </TouchableOpacity>
          )
        }
      </View>
    )
  }
}

//StyleSheet Layout
const styles = StyleSheet.create({
  text: {
    marginTop: 20,
    fontSize: 19,
    fontWeight: 'bold',
    textAlign: 'center'
  },
  instructions: {
    marginTop: 20,
    color: 'black',
    marginBottom: 5,
    textAlign: 'center'
  },
})
