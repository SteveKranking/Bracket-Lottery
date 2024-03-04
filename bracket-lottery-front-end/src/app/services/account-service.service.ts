import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private accountEndpoint = 'http://localhost:8080/account';
  private httpClient: HttpClient;
  
  constructor(httpClient: HttpClient) {
      this.httpClient = httpClient;
   }

   createAccount() {
      return this.httpClient.post(`${this.accountEndpoint}/createAccount`, 'this is a message from the front end').subscribe();
    }

}
