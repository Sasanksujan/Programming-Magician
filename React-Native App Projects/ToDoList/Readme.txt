


This is a Simple React Native ToDoList app.

#To run your app on iOS:
   cd /Users/sasanksaisujanadapa/Desktop/React-Native/ToDoList
   react-native run-ios
   - or -
   Open ios/ToDoList.xcodeproj in Xcode
   Hit the Run button

#To run your app on Android:
   cd /Users/sasanksaisujanadapa/Desktop/React-Native/ToDoList
   Have an Android emulator running (quickest way to get started), or a device connected
   react-native run-android

//Then Check the iphone Simulator and Android Simulator which opens up after the dependency graph is loaded. 

//You can add items to the list and press on the item to delete from listview.

//The data entered is in sync with Firebase cloud database which is provided with my personal login credentials.

//To create a own Firebase project login with your gmail account in www.firebase.com and create a project from link https//console.firebase.google.com

/**
In order to check the database replace your projects:

 apiKey(which can be found in top left settings icon => Project settings),

 authDomain,and databaseURL(which can be found in top left settings icon => Project settings => Develop(Database)) 

in lines 20,21,and 22 from file index.ios.js
**/


   
