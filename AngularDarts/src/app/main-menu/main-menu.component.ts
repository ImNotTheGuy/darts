import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-main-menu',
  templateUrl: './main-menu.component.html',
  styleUrls: ['./main-menu.component.css'],
})
export class MainMenuComponent implements OnInit {
  show = true;

  constructor(private router: Router) {
    this.show = true;
  }

  ngOnInit(): void {
    this.show = true;
  }

  onPlayerMenu(): void {
    this.show = false;
    this.router.navigateByUrl('/players');
  }

  onNewGame(): void {
    this.show = false;
    //TODO: route to new game meny
  }
}
