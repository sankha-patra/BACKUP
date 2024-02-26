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
   return null;
  }
  // Method to retrieve login status
  get getLoginStatus(): boolean {
  
     //complete this function
   return true;
  }
  getToken(): string | null {
 //complete this function
 return null;
  }
  logout(){
  //complete this function
   }
}
