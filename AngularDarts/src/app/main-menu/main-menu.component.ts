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
    this.showPlayers = false;
    this.showNewGame = true;
  }

  onNewGame(): void {
    this.showNewGame = false;
    this.showPlayers = true;
    //TODO: route to new game meny
  }
}
