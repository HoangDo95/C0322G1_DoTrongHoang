import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from './login/login.component';
import {RoomlistComponent} from './roomlist/roomlist.component';
import {AddroomComponent} from './addroom/addroom.component';
import {ChatroomComponent} from './chatroom/chatroom.component';


const routes: Routes = [
  { path: 'chat', component: LoginComponent },
  { path: 'roomlist', component: RoomlistComponent },
  { path: 'addroom', component: AddroomComponent },
  { path: 'chatroom/:roomname', component: ChatroomComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ChatRoutingModule { }
