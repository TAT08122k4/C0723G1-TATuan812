// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
import { getStorage } from 'firebase/storage';

// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyAiNDefDjTb_4Mgord_Qb_NjKQjkyyDbwg",
  authDomain: "borrowbook-a5c50.firebaseapp.com",
  projectId: "borrowbook-a5c50",
  storageBucket: "borrowbook-a5c50.appspot.com",
  messagingSenderId: "782462144742",
  appId: "1:782462144742:web:ceca7831a75f4effc76b27",
  measurementId: "G-FGC5LDR6NH"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
export const imageDb = getStorage(app)