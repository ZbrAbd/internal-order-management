import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard';
import { OrderListComponent } from './features/orders/order-list/order-list.component';

export const routes: Routes = [
  { path: '', component: DashboardComponent },
  { path: 'orders', component: OrderListComponent }
];
