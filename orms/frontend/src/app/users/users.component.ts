import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private router: Router, private http: HttpClient) { }

  ngOnInit() {
  }

  newCustomer: customers;
  
  reginsterUser(postData: customers) {
    //check required values
    console.log(postData.firstName);
    if (postData.firstName == null || postData.firstName.trim() == '') {
      alert("Please Enter First Name.")
      return;
    }

    if (postData.lastName == null || postData.lastName.trim() == '') {
      alert("Please Enter last Name.")
      return;
    }

    if (postData.email == null || postData.email.trim() == '') {
      alert("Please Enter Email.")
      return;
    }

    if (postData.password == null || postData.password.trim() == '') {
      alert("Please Enter password.")
      return;
    }

    this.http.get<customers[]>('http://127.0.0.1:8080/customers')
    .subscribe(
       ( posts:customers[])=>{
        let validPosts = posts.filter(post => {return post.email === postData.email })

        if(validPosts.length>0){          
          alert("User already registered.");
          return;
        }else{
          this.http
              .post(
                'http://127.0.0.1:8080/customers',
                postData
              )
              .subscribe(
                (responseData: customers) => {
                  if (responseData.custID > 0) {
                    alert("Customer Registered successfully.");
                    this.router.navigate(['/login'])
                  }
                },
                err => {
                  console.log('Error updating items', err);
                  alert("Error while Registering new customer.");
                }
              );


        }        
    })


  }  
   
  
}

export interface customers {
  custID: number;
  firstName: string;
  lastName: string;
  address1: string;
  address2: string;
  city: string;
  state: string;
  zip: string;
  phone: string;
  password: string;
  email: string;
}
