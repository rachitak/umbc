import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';


export interface invoiceItems {
    itemID: number;
    itemName:string;
    price: number;
    quantity: number;
    totalAmount: number;
}

export interface custDetails {
    custID:number;
    firstName:string;
    lastName:string;   
    
}



@Injectable({providedIn: 'root'})
export class ShoppingCartService{

    shoppingList$: BehaviorSubject<invoiceItems[]> = new BehaviorSubject([])
    customerList$: BehaviorSubject<custDetails[]> = new BehaviorSubject([])



    constructor(){}


}