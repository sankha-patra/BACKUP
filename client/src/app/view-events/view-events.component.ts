import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpService } from '../../services/http.service';
import { FormsModule } from '@angular/forms';
import { Observable, of } from 'rxjs';
// import { HttpService } from '../../services/http.service';
// import { AuthService } from '../../services/auth.service';
 
 
@Component({
  selector: 'app-view-events',
  templateUrl: './view-events.component.html',
  styleUrls: ['./view-events.component.scss']
})
export class ViewEventsComponent implements OnInit {
 
  itemForm: FormGroup;
  formModel:any={status:null};
  showError:boolean=false;
  errorMessage:any;
  eventObj$: Observable<any> = of([]);
  assignModel: any={};
 
  showMessage: any;
  responseMessage: any;
  isUpdate: any=true;

  inputMessage: any = '';
  userList$: Observable<any> = of([]);
  errorMsg$ : Observable<String> = of('');
  responseMsg$ : Observable<String> = of('');
  constructor(public router:Router, private formBuilder: FormBuilder,private httpService: HttpService)
    {
      // this.itemForm =complete this form init
      this.itemForm = formBuilder.group({
        eventID:[''],
        title:['',[Validators.required]],
        description:['',[Validators.required]],
        dateTime:['',[Validators.required]],
        location:['',[Validators.required]],
        status:['',[Validators.required]],
        user:['',Validators.required]
      });
  }
  ngOnInit(): void {
    
 
  }
  searchEvent() {
  //complete this function
  this.eventObj$ = this.httpService.getEventById(this.inputMessage);
  }
 
 
  onSubmit()
  {
    //complete this function
    if(this.itemForm.valid){
      console.log(this.inputMessage);
      
      this.httpService.updateEvent(this.itemForm.value, this.inputMessage).subscribe(
        (res:any)=>{
          this.responseMsg$ = of('Event updated successfully');
        },
        (error : any) => {
          this.errorMsg$ = of('Unable to update event');
        }
      )
    }
  }
  edit(val:any)
  {
    this.isUpdate=false;
    let dateTime=new Date(val.dateTime);
    // this.itemForm.patchValue({
    // //complete this function
    
    // })

    this.eventObj$.subscribe((data:any)=>{
      this.itemForm.patchValue(
        //complete this function
        data[0]
        );
      // this.itemForm.setValue({
      //   title:data[0].title,
      //   description: data[0].description,
      //   dateTime: data[0].dateTime,
      //   location:data[0].location,
      //   status:data[0].status,
      //   user : data[0].user})

        console.log(data);
        
    });
   
  }
 
 
}