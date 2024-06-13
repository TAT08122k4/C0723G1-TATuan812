import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Dev } from '../model/dev';

@Injectable({
  providedIn: 'root'
})
export class DevService {
  URL = "http://localhost:8080/dev";

  constructor(private httpClient : HttpClient) { }
  // httpClient = inject(HttpClient);

  getAllDev(): Observable<Dev[]>{
    return this.httpClient.get<Dev[]>(this.URL)
  }
  saveProduct(dev : Dev): Observable<Dev>{
    return this.httpClient.post<Dev>(this.URL + "add",dev) 
  }

}
