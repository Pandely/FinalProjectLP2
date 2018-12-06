import { Component, OnInit } from '@angular/core';
import { CarteleraService } from '../servicios/cartelera.service';
import { Pelicula } from '../entidades/pelicula';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  operations: Pelicula[] = [];

  constructor(private carteleraService: CarteleraService) { }

  ngOnInit() {
    this.carteleraService.getCartelera$(1).subscribe(
      (data:Pelicula[]) => { console.log(data); }
    );
  }

}
