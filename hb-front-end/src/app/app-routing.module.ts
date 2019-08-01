import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { CategoriesComponent } from './components/categories/categories.component';
import { HomeComponent } from './components/home/home.component';
import { AddCategoryComponent } from './components/categories/add-category/add-category.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'categories', component: CategoriesComponent},
  {path: 'add-category', component: AddCategoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
