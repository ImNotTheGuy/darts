import { Component, OnInit } from '@angular/core';
import { Player } from '../entity/player';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { URL } from '../properties/url';


@Component({
  selector: 'app-test-http',
  templateUrl: './test-http.component.html',
  styleUrls: ['./test-http.component.css']
})
export class TestHttpComponent implements OnInit {


  players: Player[] = [];
  url = URL + '/players/';
  showPlayerList = false;


  constructor(private http: HttpClient) {
   }

  ngOnInit(): void {
    this.http.get<any>(this.url).subscribe(data => {
      this.players = data;
    })
  }

  onClick(): void{
    this.showPlayerList = !this.showPlayerList;
    this.http.get<any>(this.url).subscribe(data => {
      this.players = data;
    })
  }

  onRefresh(): void{
    this.http.get<any>(this.url).subscribe(data => {
      this.players = data;
    })
  }

  

  onDelete(id: number): void{
    this.http.delete<any>(this.url + id).subscribe();
  }

}
