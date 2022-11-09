import {Component, OnInit} from '@angular/core';
import Swal from 'sweetalert2';
import {BookService} from '../book/book.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  cartList: any = this.bookService.getCarts();

  constructor(private bookService: BookService) {
  }

  ngOnInit(): void {
  }

  // addToCart(book: any) {
  //   const index = this.cartList.findIndex((item: any) => {
  //     return item.id == book.id;
  //   });
  //
  //   if (index >= 0) {
  //     this.cartList[index].quantity += 1;
  //   } else {
  //     const cartItem: any = {
  //       id: book.id,
  //       name: book.name,
  //       price: book.price,
  //       quantity: 1,
  //       image: book.image
  //     };
  //     this.cartList.push(cartItem);
  //   }
  //   this.bookService.saveCarts(this.cartList);
  //   this.data.changeData({
  //     totalQuantity: this.bookService.getTotalCartQuantity()
  //   });
  //   Swal.fire('Thông báo', 'Thêm vào giỏ hàng thành công', 'success');
  // }


}
