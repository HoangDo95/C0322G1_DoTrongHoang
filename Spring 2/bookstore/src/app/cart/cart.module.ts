import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CartRoutingModule } from './cart-routing.module';
import { CartListComponent } from './cart-list/cart-list.component';
import { CartOrderComponent } from './cart-order/cart-order.component';


@NgModule({
  declarations: [CartListComponent, CartOrderComponent],
  imports: [
    CommonModule,
    CartRoutingModule
  ]
})
export class CartModule { }
