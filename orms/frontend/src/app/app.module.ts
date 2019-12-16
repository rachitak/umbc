import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { AppComponent } from './app.component';
import {LoginComponent} from './login/login.component';
import { UsersComponent } from './users/users.component';
import {AppRoutingModule} from './app-routing.module';
import {HttpClientModule} from '@angular/common/http';
import { InvoiceComponent } from './invoice/invoice.component';
import { ShoppingCartComponent } from './shopping-cart/shopping-cart.component';

@NgModule({
  declarations: [AppComponent,LoginComponent,UsersComponent, InvoiceComponent, ShoppingCartComponent],
  imports: [BrowserModule,FormsModule,AppRoutingModule,HttpClientModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
