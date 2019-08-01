import { Component, OnInit } from '@angular/core';
import { Category } from '../../model/category';
import { CategoryService } from '../../service/category.service'

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.scss']
})
export class CategoriesComponent implements OnInit {

  categories: Category[];
  currentType: string;

  constructor(private categoryService: CategoryService) {
    this.currentType = 'EXPENDITURE';
  }

  ngOnInit() {
    this.categoryService.findByType(this.currentType).subscribe(data => {
      this.categories = data;
    });
  }

  onChangeType(type: string) {
    this.categoryService.findByType(type).subscribe(data => {
      this.categories = data;
    });
    this.currentType = type;
  }

}
