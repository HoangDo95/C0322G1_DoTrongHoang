import { Component } from '@angular/core';
import * as firebase from 'firebase';

const config = {
  apiKey: 'AIzaSyA-8vBTNhQ5ixLWTzDtVUVjKW2fYoTUymg',
  databaseURL: 'https://angularchat-519bf-default-rtdb.firebaseio.com'
};

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'book-store';

  constructor() {
    firebase.initializeApp(config);
  }
}
