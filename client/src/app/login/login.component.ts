import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpService } from '../../services/http.service';
import { AuthService } from '../../services/auth.service';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  itemForm: FormGroup;
  formModel:any={};
  showError:boolean=false;
  errorMessage:any;
  constructor(public router:Router, public httpService:HttpService, private formBuilder: FormBuilder, private authService:AuthService) 
    {
      this.itemForm = this.formBuilder.group({
<<<<<<< HEAD
        username: [this.formModel.username,[ Validators.required]],
        password: [this.formModel.password,[ Validators.required]],
=======
        //compelete this 
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
       
    });
  }

  ngOnInit(): void {
  }
  onLogin() {
<<<<<<< HEAD
  if (this.itemForm.valid) {
    this.showError = false;
    this.httpService.Login(this.itemForm.value).subscribe((data: any) => {
      if (data.userNo != 0) {
        debugger;
    
        // localStorage.setItem('role', data.role);
        this.authService.SetRole(data.role);
        this.authService.saveToken(data.token)
        this.router.navigateByUrl('/dashboard');
      
        
        setTimeout(() => {
          window.location.reload();
        }, 1000);
      } else {
        this.showError = true;
        this.errorMessage = "Wrong User or Password";
      }
    }, error => {
      // Handle error
      this.showError = true;
      this.errorMessage = "An error occurred while logging in. Please try again later.";
      console.error('Login error:', error);
    });;
  } else {
    this.itemForm.markAllAsTouched();
  }
=======
  //compelete this 
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
}

registration()
  {
<<<<<<< HEAD
    this.router.navigateByUrl('/registration');
=======
     //compelete this 
>>>>>>> ef1f4d60e0f1c58fd62db8cccc9ef1809da6fae0
  }
}
