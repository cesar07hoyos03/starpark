import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from './app.customer';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class CustomerService{
    constructor(private http: HttpClient){}

    getCustomerInfo() : Observable<Customer[]>{
        return this.http.get<Customer[]>('http://localhost:9000/customer');
      }
}