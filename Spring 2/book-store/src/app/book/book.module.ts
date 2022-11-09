import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BookRoutingModule } from './book-routing.module';
import {ReactiveFormsModule} from '@angular/forms';
import {CartComponent} from './cart/cart.component';
import {DetailComponent} from './detail/detail.component';
import {HomeComponent} from './home/home.component';
import { LoginComponent } from './login/login.component';
import { BookListComponent } from './book-list/book-list.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ToastrModule} from 'ngx-toastr';

@NgModule({
  declarations: [CartComponent, DetailComponent, HomeComponent, LoginComponent, BookListComponent],
  exports: [
    CartComponent,
    DetailComponent
  ],
  imports: [
    CommonModule,
    BookRoutingModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot({
      positionClass : 'toast-top-right',
      timeOut: 1000,
      progressBar: true,
      progressAnimation: 'increasing',
      preventDuplicates: true}),
  ]
})
export class BookModule { }
