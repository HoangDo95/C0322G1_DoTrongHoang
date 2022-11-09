import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CartComponent} from './cart/cart.component';
import {HomeComponent} from './home/home.component';
import {DetailComponent} from './detail/detail.component';
import {LoginComponent} from './login/login.component';
import {BookListComponent} from './book-list/book-list.component';


const routes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: 'list'},
  {path: 'home', component: HomeComponent},
  {path: 'cart', component: CartComponent},
  {path: 'detail', component: DetailComponent},
  {path: 'login', component: LoginComponent},
  {path: 'list', component: BookListComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [
    RouterModule
  ]
})
export class BookRoutingModule { }
