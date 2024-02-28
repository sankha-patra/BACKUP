<<<<<<< HEAD
=======
// import { Injectable } from '@angular/core';
// import { HttpClient, HttpHeaders } from '@angular/common/http';
// import { Observable } from 'rxjs';
// import { environment } from '../environments/environment.development';
// import { AuthService } from './auth.service';

// @Injectable({
//   providedIn: 'root'
// })
// export class HttpService {
//   public serverName=environment.apiUrl;
//   constructor() {

//    }
 
//   getOrderStatus(cargoId:any):Observable<any> {
   
// //complete this function
//   }
//   updateCargoStatus(newStatus:any,cargoId:any):Observable<any> {
  
//    //complete this function
//   }
//   assignDriver(driverid: any, cargoId: any): Observable<any> {
//    //complete this function
//   }
  

//   getAssignOrders(driverId:any):Observable<any> {
//   //complete this function
//   }
//   getCargo():Observable<any> {
//    //complete this function
//   }

//   getDrivers():Observable<any> {
   
//   //complete this function
//   }
//   addCargo(details:any):Observable<any> {
//   //complete this function
//   }
//   Login(details:any):Observable<any> {
    
//   //complete this function
//   }
//   registerUser(details:any):Observable<any> {
//    //complete this function
//   }
 
  
  
// }


>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environment.development';
import { AuthService } from './auth.service';
<<<<<<< HEAD

=======
 
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
@Injectable({
  providedIn: 'root'
})
export class HttpService {
  public serverName=environment.apiUrl;
<<<<<<< HEAD
  constructor(private http: HttpClient, private authService:AuthService) {

   }
 

  getBookingDetails(eventId:any):Observable<any> {
   
    const authToken = this.authService.getToken();
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    headers = headers.set('Authorization', `Bearer ${authToken}`)
    return this.http.get(this.serverName+`/api/client/booking-details/`+eventId,{headers:headers});
  }
  GetEventdetails(eventId:any):Observable<any> {
   
    const authToken = this.authService.getToken();
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    headers = headers.set('Authorization', `Bearer ${authToken}`)
    return this.http.get(this.serverName+`/api/staff/event-details/`+eventId,{headers:headers});
  }
  GetAllevents():Observable<any> {
   
    const authToken = this.authService.getToken();
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    headers = headers.set('Authorization', `Bearer ${authToken}`)
    return this.http.get(this.serverName+`/api/planner/events`,{headers:headers});
  }
  GetAllResources():Observable<any> {
   
    const authToken = this.authService.getToken();
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    headers = headers.set('Authorization', `Bearer ${authToken}`)
    return this.http.get(this.serverName+`/api/planner/resources`,{headers:headers});
  }


  createEvent(details:any):Observable<any> {
  
    const authToken = this.authService.getToken();
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    headers = headers.set('Authorization', `Bearer ${authToken}`);
    return this.http.post(this.serverName+'/api/planner/event',details,{headers:headers});
  }
  updateEvent(details:any,eventId:any):Observable<any> {
  
    const authToken = this.authService.getToken();
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    headers = headers.set('Authorization', `Bearer ${authToken}`);
    return this.http.put(this.serverName+'/api/staff/update-setup/'+eventId,details,{headers:headers});
  }
  addResource(details:any):Observable<any> {
  
    const authToken = this.authService.getToken();
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    headers = headers.set('Authorization', `Bearer ${authToken}`);
    return this.http.post(this.serverName+'/api/planner/resource',details,{headers:headers});
  }
  allocateResources(eventId:any,resourceId:any, details:any):Observable<any> {
  
    const authToken = this.authService.getToken();
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    headers = headers.set('Authorization', `Bearer ${authToken}`);
    return this.http.post(this.serverName+'/api/planner/allocate-resources?eventId='+eventId+'&resourceId='+resourceId,details,{headers:headers});
  }
  Login(details:any):Observable<any> {
    
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    return this.http.post(this.serverName+'/api/user/login',details,{headers:headers});
  }
  registerUser(details:any):Observable<any> {
    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json');
    return this.http.post(this.serverName+'/api/user/register',details,{headers:headers});
  }
 
  
  
}
=======
  constructor(private httpClient:HttpClient) {
 
   }
 
  getEventById(eventId:any):Observable<any> {
   
//complete this function
  }
  updateEvent(newEvent:any,eventId:any):Observable<any> {
   //complete this function
  }
  // assignDriver(driverid: any, cargoId: any): Observable<any> {
  //  //complete this function
  // }
 
 
  // getAssignOrders(driverId:any):Observable<any> {
  // //complete this function
  // }
  getResources():Observable<any> {
   //complete this function
  }
 
  getEvents():Observable<any> {
   
  //complete this function
  }
  addEvent(details:any):Observable<any> {
  //complete this function
  }
  Login(details:any):Observable<any> {
  //complete this function
  }
  registerUser(details:any):Observable<any> {
   //complete this function
   return this.httpClient.post(`${this.serverName}/api/user/register`,details);
   
  }
}
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
