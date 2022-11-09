import { NgModule } from '@angular/core';
import {CommonModule, DatePipe} from '@angular/common';

import { ChatRoutingModule } from './chat-routing.module';
import {LoginComponent} from './login/login.component';
import {RoomlistComponent} from './roomlist/roomlist.component';
import {AddroomComponent} from './addroom/addroom.component';
import {ChatroomComponent} from './chatroom/chatroom.component';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {ReactiveFormsModule} from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import {MatIconModule} from '@angular/material/icon';
import {MatCardModule} from '@angular/material/card';
import {MatTableModule} from '@angular/material/table';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatSortModule} from '@angular/material/sort';


@NgModule({
  declarations: [ LoginComponent,
    RoomlistComponent,
    AddroomComponent,
    ChatroomComponent],
  imports: [
    CommonModule,
    ChatRoutingModule,
    ReactiveFormsModule,
    MatInputModule,
    MatIconModule,
    MatCardModule,
    MatFormFieldModule,
    MatTableModule,
    MatProgressSpinnerModule,
    MatSortModule,
    MatSnackBarModule,
    MatSidenavModule,
    MatButtonModule
  ],
  providers: [DatePipe],
})
export class ChatModule { }
