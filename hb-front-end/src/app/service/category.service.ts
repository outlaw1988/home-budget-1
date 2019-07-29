import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Category } from '../model/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private getCategoriesUrl: string;

  constructor(private http: HttpClient) {
    this.getCategoriesUrl = 'http://localhost:8080/api/category/get-by-type';
  }

  public findByType(type: string): Observable<Category[]> {
    let params = new HttpParams().set('type', type);
    return this.http.get<Category[]>(this.getCategoriesUrl, {params: params});
  }
}
