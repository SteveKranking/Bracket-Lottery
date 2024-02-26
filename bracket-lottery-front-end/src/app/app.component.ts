import { Component } from '@angular/core';
import { RouterOutlet, RouterLink, RouterLinkActive } from '@angular/router';
import {NavbarComponent} from './components/navbar/navbar.component';
import {LoginScreenComponent} from './components/login-screen/login-screen.component';
import {CreateAccountComponent} from './components/create-account/create-account.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, RouterLinkActive, NavbarComponent, LoginScreenComponent, CreateAccountComponent,],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'bracket-lottery-front-end';
}
