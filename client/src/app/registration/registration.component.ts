import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
=======
import { AbstractControl, FormBuilder, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable, of } from 'rxjs';
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
import { HttpService } from '../../services/http.service';


@Component({
  selector: 'app-registration',
<<<<<<< HEAD
  templateUrl: './registration.component.html'
 
=======
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
})
export class RegistrationComponent {

  itemForm: FormGroup;
  formModel:any={role:null,email:'',password:'',username:''};
  showMessage:boolean=false;
<<<<<<< HEAD

  responseMessage: any;
  constructor(public router:Router, private bookService:HttpService, private formBuilder: FormBuilder) { 
    
      this.itemForm = this.formBuilder.group({
        email: [this.formModel.email,[ Validators.required, Validators.email]],
        password: [this.formModel.password,[ Validators.required]],
        role: [this.formModel.role,[ Validators.required]],
        username: [this.formModel.username,[ Validators.required]],
       
    });
  }
=======
  userError$: Observable<string> = of('');
  userSuccess$: Observable<string> = of('');

  responseMessage: any;
  constructor(public router:Router, private formBuilder: FormBuilder,private httpService:HttpService) { 
    
    this.itemForm = this.formBuilder.group({

      role:[this.formModel.role,[Validators.required]],
      email:[this.formModel.email,[Validators.required,this.emailValidations]],
      password:[this.formModel.password,[Validators.required,this.passwordValidations]],
      username:[this.formModel.username,[Validators.required,this.noSpaceValidations]]
     
  });
}

passwordValidations(control: AbstractControl): ValidationErrors | null {

  let passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*])([a-zA-Z\d!@#%$%^&*]){8,}$/;

  if (!passwordRegex.test(control.value)) {
    return {  invalidPassword: true };
  } else {
    return null;
  }
}

emailValidations(control: AbstractControl): ValidationErrors | null {

  let emailRegex = /^[a-zA-Z_]+@[a-zA-Z0-9]+\.[a-z]{2,}/;

  if (!emailRegex.test(control.value)) {
    return {  invalidEmail: true };
  } else {
    return null;
  }
}

noSpaceValidations(control: AbstractControl): ValidationErrors | null {
  const controlValue = control.value as string;

  if (controlValue.indexOf(' ')>= 0) {
    return {  NoSpaceValidator: true };
  } else {
    return null;
  }
}
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0

  ngOnInit(): void {
  }
  onRegister()
  {
<<<<<<< HEAD
    if(this.itemForm.valid)
    {
      this.showMessage=false;
      this.bookService.registerUser(this.itemForm.value).subscribe(data=>{    
        debugger;
        this.showMessage=true;
        this.responseMessage="You are successfully registered";
        this.itemForm.reset();
        
      },error=>{ })
    }
    else{
      this.itemForm.markAllAsTouched();
=======
  //complete this function 
    if(this.itemForm.valid){
      this.httpService.registerUser(this.itemForm.value).subscribe(
        (res: any) => {
          this.userSuccess$ = of("User created successfully");
        },
        (error) => {
          this.userError$ = of("User Alreay Exists:");
        }
      )
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
    }
  }


}
