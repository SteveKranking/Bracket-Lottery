import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Account } from '../models/account';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private accountEndpoint: string;
  
  constructor(private httpClient: HttpClient) {
    this.accountEndpoint = 'http://localhost:8080/account';
   }

   createAccount() {
      console.log("in the service!!!");
      this.httpClient.get(`${this.accountEndpoint}/createAccount`);
   }

  //  updateUser(id:number, user:User): Observable<Object>{
  //   return this.httpClient.put(`${this.basUrl}/${id}`, user);
  // }

}
