import { DevService } from './../../service/dev.service';
import { Component } from '@angular/core';
import { Dev } from '../../model/dev';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-list',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './list.component.html',
  styleUrl: './list.component.css'
})
export class ListComponent {
   devs: Dev[] = [];
  constructor(private devService : DevService){

  }
  ngOnInit(): void{
    this.fetchData()

  }

  fetchData(){
   this.devService.getAllDev().subscribe({
    next : (res) => {
      this.devs = res;
    }
   })
  }


}
