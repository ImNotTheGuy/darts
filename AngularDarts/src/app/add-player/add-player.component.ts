import { Component, Input, OnInit } from '@angular/core';
import { Player } from '../entity/player';
import { HttpClient } from '@angular/common/http';
import { URL } from '../properties/url';
import { NgModule } from '@angular/core';


@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})
export class AddPlayerComponent implements OnInit {

  newPlayer: Player | any;
  
  url = URL + '/players';

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  username: string = 'Your name';

  onConfirm(): void {
    this.http.post<any>(this.url, { username: this.username }).subscribe();
    console.log("adding player: " + this.username);
  }

}
