import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-menu',
  templateUrl: './main-menu.component.html',
  styleUrls: ['./main-menu.component.css'],
})
export class MainMenuComponent implements OnInit {
  showPlayers = false;
  showNewGame = false;

  constructor() {
  }

  ngOnInit(): void {
    
  }

  onPlayerMenu(): void {
    this.showPlayers = true;
    this.showNewGame = false;
  }

  onNewGame(): void {
    this.showNewGame = true;
    this.showPlayers = false;
    //TODO: route to new game meny
  }
}
