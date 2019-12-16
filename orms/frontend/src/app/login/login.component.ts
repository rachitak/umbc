import { Component } from '@angular/core';
import { AlertPromise } from 'selenium-webdriver';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { ShoppingCartService, custDetails } from '../shopping-cart/shopping-cart.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent  {
  email: String = null;
  password: String = null;
  custInfo: custDetails[]

  constructor(private router:Router ,private http: HttpClient,private shoppingCartService: ShoppingCartService) {}
   
  ngOnInit() {
    this.shoppingCartService.customerList$.subscribe(custDetails => {
      this.custInfo = custDetails})
  }

  
  
  validateUser(postData: {email:string,password:string}){
    let requestObj = {email: this.email, password: this.password};
    
    this.http.get<customers[]>('http://127.0.0.1:8080/customers')
    .subscribe(
       ( posts:customers[])=>{
        let validPosts = posts.filter(post => {return post.email === this.email })

        if(validPosts[0].password == this.password){          
          this.email = null;
          this.password = null;

          this.custInfo.push({
            custID: validPosts[0].custID,
            firstName:validPosts[0].firstName, 
            lastName: validPosts[0].lastName
          });
      

          this.router.navigate(['/invoice']);
        }else{
          alert("Invalid email/password.");
          return;
        }

        
    })
  }
}

export interface customers {
  custID:number;
  firstName:string;
  lastName:string;
  address1:string;
  address2:string;
  city:string;
  state:string;
  zip:string;
  phone:string;
  password:string;
  email:string;
}
