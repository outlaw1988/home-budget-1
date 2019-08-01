import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Category } from 'src/app/model/category';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.scss']
})
export class AddCategoryComponent implements OnInit {

  private initType: string;
  private category: Category;

  constructor(private route: ActivatedRoute) {
    this.route.queryParams.subscribe(params => {
        this.initType = params['initType'];
    });
    this.category = new Category(null, this.initType, "");
  }

  ngOnInit() {
  }

  onSubmit() {
    console.log("Submitting in progress...");
    console.log(this.category);
  }

}
