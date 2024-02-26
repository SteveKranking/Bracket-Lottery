import { Routes } from '@angular/router';
import {LoginScreenComponent} from './components/login-screen/login-screen.component';
import {CreateAccountComponent} from './components/create-account/create-account.component';

export const routes: Routes = [
    { path: 'login-component', component: LoginScreenComponent },
    { path: 'create-account-component', component: CreateAccountComponent },
];
