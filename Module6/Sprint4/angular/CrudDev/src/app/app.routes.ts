import { CreateComponent } from './crud/create/create.component';
import { Routes } from '@angular/router';
import { ListComponent } from './crud/list/list.component';

export const routes: Routes = [
    {path : "" , component : ListComponent},
    {path : "create" , component: CreateComponent }
];
