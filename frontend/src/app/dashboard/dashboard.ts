import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardService } from '../core/services/dashboard.service';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './dashboard.html'
})
export class DashboardComponent implements OnInit {

  totalOrders = 0;
  totalProducts = 0;
  totalCustomers = 0;

  constructor(private dashboardService: DashboardService) {}

  ngOnInit(): void {
    this.dashboardService.getStats().subscribe({
      next: (data) => {
        this.totalOrders = data.orders?.length || 0;
        this.totalProducts = data.products?.length || 0;
        this.totalCustomers = data.customers?.length || 0;
      }
    });
  }
}
