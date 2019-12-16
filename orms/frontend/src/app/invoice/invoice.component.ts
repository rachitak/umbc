import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { ShoppingCartService, invoiceItems,custDetails } from '../shopping-cart/shopping-cart.service';
import { BehaviorSubject } from 'rxjs';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})
export class InvoiceComponent implements OnInit {

  custInfo:custDetails[];
  shoppingCart: invoiceItems[]
  allDepartments: departments[];
  listLitems: items[];
  editField: string;
  totalItems: number = 0;


  constructor( private router: Router,private http: HttpClient,private shoppingCartService: ShoppingCartService) { }
  
  ngOnInit() {
    this.shoppingCartService.shoppingList$.subscribe(shoppingCart => {
      this.shoppingCart = shoppingCart})
      this.shoppingCartService.customerList$.subscribe(customerList => {
        this.custInfo = customerList;      
      })

    this.getdepartments();
    //this.getitems("1");
  }

  mydata(event, newvalue: departments) {
    this.getitems(newvalue.departmentID);
    return;
  }


  //get lis of all departments
  getdepartments() {
    this.http.get<departments[]>('http://127.0.0.1:8080/departments')
      .subscribe(
        (posts: departments[]) => {
          console.log(posts);
          this.allDepartments = posts;

        })
  }

  getitems(deptId: string) {

    this.http.get<items[]>('http://127.0.0.1:8080/items/department/' + deptId)
      .subscribe(
        (posts: items[]) => {
          console.log(posts);
          this.listLitems = posts;
        })
  }

  changeValue(id: number, property: string, event: any) {
    this.editField = event.target.textContent;
  }

  addtoCard(id, itemName,price) {
    
    let rowIndex = this.shoppingCart.findIndex(item => item.itemID == id);
    if (rowIndex < 0) {
      this.shoppingCart.push({
        itemID: id,
        itemName:itemName, 
        price: price,
        quantity: 1,
        totalAmount: price * 1
      });
    } else {
      this.shoppingCart[rowIndex].quantity = this.shoppingCart[rowIndex].quantity + 1;
      this.shoppingCart[rowIndex].totalAmount = this.shoppingCart[rowIndex].quantity * this.shoppingCart[rowIndex].price;
    }


    this.totalItems = this.shoppingCart.length;

    console.log(this.shoppingCart);
    this.shoppingCartService.shoppingList$.next(this.shoppingCart)


  }

  displayCart() {    
    this.router.navigate(['/ShoppingCart']);
  }


}


export interface departments {
  departmentID: string;
  departmentName: string;
}

export interface items {
  itemID: number;  
  itemName: string;
  departmentID: string;
  price: number;
  quantity: number;
  desciption: string
}
