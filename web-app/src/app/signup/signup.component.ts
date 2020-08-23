import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import {SignupService} from '../service/signup.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  signupForm = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    address: new FormControl(''),
    password: new FormControl('')
  });

  constructor(private signupService: SignupService) { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.signupForm.value);
    
    this.signupForm.reset();
  }

  onReset(){
    this.signupForm.reset();
  }

}
