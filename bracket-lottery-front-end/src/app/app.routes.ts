import { Routes } from '@angular/router';
import {LoginScreenComponent} from './components/login-screen/login-screen.component';
import {CreateAccountComponent} from './components/create-account/create-account.component';
import {HomePageComponent} from './components/home-page/home-page.component';

export const routes: Routes = [
    { path: '', component: LoginScreenComponent },
    { path: 'login', component: LoginScreenComponent },
    { path: 'create-account', component: CreateAccountComponent },
    { path: 'home-page', component: HomePageComponent },
];
