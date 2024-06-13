import { inject, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Observer } from 'rxjs';
import { Positions } from '../model/positions';

@Injectable({
  providedIn: 'root'
})
export class PositionsService {
  URL = "http://localhost:8080/positions";

 httpClient = inject(HttpClient)
 constructor(){}
 
 getAllPositions() : Observable<Positions[]>{
  return this.httpClient.get<Positions[]>(this.URL)
 }
 
}
