import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Pelicula } from '../entidades/pelicula';

@Injectable({
  providedIn: 'root'
})
export class CarteleraService {

  private url = "localhost:8081/api/cartelera/";

  constructor(private http: HttpClient) {}

  getCartelera$(idsede: number) : Observable<Pelicula[]>{
    return this.http.get<Pelicula[]>(`${this.url}/${idsede}`);
  }
}
