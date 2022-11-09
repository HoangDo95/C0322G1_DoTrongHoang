import {Category} from './Category';
import {Discount} from './Discount';

export interface Book {
  id?: number;
  name?: string;
  author?: string;
  company?: string;
  date?: string;
  description?: string;
  image?: string;
  numberOfPage?: string;
  price?: string;
  quantity?: string;
  size?: string;
  category?: Category;
  discount?: Discount;

}
