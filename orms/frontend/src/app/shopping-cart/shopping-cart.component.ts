import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { ShoppingCartService, invoiceItems,custDetails } from '../shopping-cart/shopping-cart.service';
import { BehaviorSubject } from 'rxjs';

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.css']
})
export class ShoppingCartComponent implements OnInit {

  shoppingCart: invoiceItems[];
  custInfo:custDetails[];
  subTotal:number;
  invoiceMaster: invoiceMS = new invoiceMS();
  invoiceDetail: invoiceDT[]=[];


  constructor( private router: Router,private http: HttpClient,private shoppingCartService: ShoppingCartService) { }

  ngOnInit() {
    this.shoppingCartService.shoppingList$.subscribe(shoppingList => {
      this.shoppingCart = shoppingList;      
    })

    this.shoppingCartService.customerList$.subscribe(customerList => {
      this.custInfo = customerList;      
    })


  }


  removeItem(id:number){
    let rowIndex = this.shoppingCart.findIndex(item => item.itemID == id);
    if(rowIndex>=0){
      this.shoppingCart.splice(rowIndex,1);
    }
  }

  checkout(){
    this.getSubTotal();

    this.invoiceMaster=({
      invoiceDate: new Date(),
      custID:this.custInfo[0].custID,
      subtotal:this.subTotal,
      stateTax:this.subTotal *.06,
      federalTax:0,
      totalAmount:this.subTotal + this.subTotal *.06
    })   ;

    this.http
              .post(
                'http://127.0.0.1:8080/invoice',
                this.invoiceMaster
              )
              .subscribe(
                (responseData: invoiceMSReturn) => {
                  if (responseData.invoiceID> 0) {
                    
                    console.log("master saved");

                    for(let entry of this.shoppingCart){
                      this.invoiceDetail.push({
                        invoiceID:responseData.invoiceID,
                        itemID:entry.itemID,
                        price:entry.price,
                        totalAmount:entry.totalAmount,
                        quantity:entry.quantity
                      });
                    }    
                    
                    console.log(this.invoiceDetail);
                    

                  this.http
                  .post(
                    'http://127.0.0.1:8080/invoicedetail',
                    this.invoiceDetail
                  )
                  .subscribe(
                    (responseData: invoiceDT[]) => {
                        alert("invoice saved successfully.");
                        this.router.navigate(['/login'])
                     
                    },
                    err => {
                      console.log('Error updating items', err);
                      alert("Error while Registering new customer.");
                    }
                  );
                   }
                },
                err => {
                  console.log('Error updating items', err);
                  alert("Error while Registering new customer.");
                }
              );



  }

  getSubTotal(){
    for(let entry of this.shoppingCart){
       this.subTotal = this.subTotal +   entry.totalAmount;
    }


  }




}

export class invoiceMS{
	invoiceDate:Date;
	custID:number;
	subtotal:number;
	stateTax:number;
	federalTax:number;
	totalAmount:number;
}


export class invoiceMSReturn{
	invoiceID:number;
	invoiceDate:Date;
	custID:number;
	subtotal:number;
	stateTax:number;
	federalTax:number;
	totalAmount:number;
}


export class invoiceDT{
  invoiceID:number;
  itemID:number;
  price:number;
  totalAmount:number;
  quantity:number;
}

