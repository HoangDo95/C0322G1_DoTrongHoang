import {Component, OnInit} from '@angular/core';
import {Book} from '../../../model/Book';
import {BookService} from '../../../service/book.service';
import {TokenStorageService} from '../../../service/token-storage.service';
import {ShareService} from '../../../service/share.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  bookList: Book [] = [];
  name = '';
  username: string;
  idPatient: number;
  currentUser: string;
  role: string;
  isLoggedIn = false;

  constructor(private bookService: BookService,
              private tokenStorageService: TokenStorageService,
              private shareService: ShareService) {
    this.shareService.getClickEvent().subscribe(() => {
      this.loadEditAdd();
    });
  }

  ngOnInit(): void {
    this.loadEditAdd();
    this.getAll();
  }

  getAll() {
    this.bookService.getAllB().subscribe(bookList => {
      this.bookList = bookList;
    });
  }

  loadEditAdd(): void {
    if (this.tokenStorageService.getToken()) {
      this.currentUser = this.tokenStorageService.getUser().username;
      this.role = this.tokenStorageService.getUser().roles[0];
      this.username = this.tokenStorageService.getUser().username;
    }
    this.isLoggedIn = this.username != null;
  }
}
