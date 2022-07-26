import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Player } from '../entity/player';
import { URL } from '../properties/url';

@Component({
  selector: 'app-player-menu',
  templateUrl: './player-menu.component.html',
  styleUrls: ['./player-menu.component.css']
})
export class PlayerMenuComponent implements OnInit {

  url = URL;
  players: Player[] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get<any>(this.url).subscribe(data => {
      this.players = data;
    })
  }

  onShowStatistics(id: number): void{
    // TODO: statistics-menu
    console.log("clicked on ShowStatistics button for player with id: " + id);
  }

  onModify(id: number): void{
    // TODO: make player.username field accessible and modifiable by user
    console.log("clicked on onModify button for player with id: " + id);
  }

  onDelete(id: number): void{
    // TODO: delete pop-up for confirmation
    console.log("clicked on onDelete button for player with id: " + id);
  }

}
