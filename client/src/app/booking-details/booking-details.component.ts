import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpService } from '../../services/http.service';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-booking-details',
  templateUrl: './booking-details.component.html',
  styleUrls: ['./booking-details.component.scss']
})
export class BookingDetailsComponent implements OnInit {

  formModel:any={status:null};
  showError:boolean=false;
  errorMessage:any;
  eventObj:any=[];
  assignModel: any={};

  showMessage: any;
  responseMessage: any;
  isUpdate: any=false;;
<<<<<<< HEAD
  constructor(public router:Router, public httpService:HttpService, private formBuilder: FormBuilder, private authService:AuthService) 
=======
  constructor(public router:Router, private formBuilder: FormBuilder, private authService:AuthService) 
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
   {
      
  }
  ngOnInit(): void {

  
  }
  searchEvent() {
<<<<<<< HEAD
    debugger;
    if(this.formModel.eventID!=null)
    {
      this.isUpdate=false;
      this.httpService.getBookingDetails(this.formModel.eventID).subscribe((data: any) => {
        this.eventObj=data;
        console.log(this.eventObj);
      }, error => {
        // Handle error
        this.showError = true;
        this.errorMessage = "An error occurred.. Please try again later.";
        console.error('Login error:', error);
      });;
    }
=======
//complete this function
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
  
  }

  }

  

