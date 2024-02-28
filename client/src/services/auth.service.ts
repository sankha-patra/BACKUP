import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private token: string | null = null;
  private isLoggedIn: boolean = false;

  constructor() {}

  // Method to save token received from login
  saveToken(token: string) {
<<<<<<< HEAD
    this.token = token;
    this.isLoggedIn = true;
    // Optionally, you can save the token to local storage or a cookie for persistence
    localStorage.setItem('token', token);
  }
   SetRole(role:any)
  {
    localStorage.setItem('role',role);
  }
  get getRole ():string|null
  {
    return localStorage.getItem('role');
=======
    //complete this function
   //complete this function
  }
   SetRole(role:any)
  {
   //complete this function
  }
  get getRole ():string|null
  {
   //complete this function
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
  }
  // Method to retrieve login status
  get getLoginStatus(): boolean {
  
<<<<<<< HEAD
      return !!localStorage.getItem('token');
   
  }
  getToken(): string | null {
   this.token= localStorage.getItem('token');
    return this.token;
  }
  logout(){
    localStorage.removeItem('token');
    localStorage.removeItem('role');
     this.token=null;
     this.isLoggedIn=false
=======
     //complete this function
   
  }
  getToken(): string | null {
 //complete this function
  }
  logout(){
  //complete this function
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
   }
}
