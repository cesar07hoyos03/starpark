import { Component, OnInit } from '@angular/core';
import { CustomerService } from './app.customer.service';
import { Customer } from './app.customer';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  customers: Customer[];

  ngOnInit(): void {
    this.service.getCustomerInfo().subscribe(
      (data) => this.customers = data,
      (err) => console.log(err),
      () => console.log('done!')
    )
    console.log(this.customers);
  }

  

  constructor(private service: CustomerService) {
  }



}
