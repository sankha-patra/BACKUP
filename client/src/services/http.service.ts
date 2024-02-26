import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, retry } from 'rxjs';
import { environment } from '../environments/environment.development';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  public serverName=environment.apiUrl;
  constructor(private http : HttpClient) {

   }
 
  getEventById(eventId:any):Observable<any> {
   return null;
//complete this function
  }
  updateEvent(newEvent:any,eventId:any):Observable<any> {
   //complete this function
   return null;
  }
  // assignDriver(driverid: any, cargoId: any): Observable<any> {
  //  //complete this function
  // }
  
  // getAssignOrders(driverId:any):Observable<any> {
  // //complete this function
  // }
  getResources():Observable<any> {
   //complete this function
   return this.http.get(`${this.serverName}/api/planner/resources`);
  }

  addResource(data : any): Observable<any> {
    return this.http.post(`${this.serverName}/api/planner/resource`,data);
  }

  getEvents():Observable<any> {
  //complete this function
  return null;
  }
  addEvent(details:any):Observable<any> {
  //complete this function
  console.log(details);
  
  return this.http.post(`${this.serverName}/api/planner/event`,details);
  }
  Login(details:any):Observable<any> { 
  //complete this function
  return null;
  }
  registerUser(details:any):Observable<any> {
   //complete this function
   console.log(details);
   
   return this.http.post(`${this.serverName}/api/user/register`,details);
  }
  getAllUser():Observable<any>{
    return this.http.get(`${this.serverName}/api/users`);
  }
}
