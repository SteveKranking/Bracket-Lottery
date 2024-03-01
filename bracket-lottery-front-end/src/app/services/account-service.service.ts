import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
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

   public createAccount(account : Account) {
    return this.httpClient.post(`${this.accountEndpoint}/createAccount`, account);
   }

  //  updateUser(id:number, user:User): Observable<Object>{
  //   return this.httpClient.put(`${this.basUrl}/${id}`, user);
  // }

}
