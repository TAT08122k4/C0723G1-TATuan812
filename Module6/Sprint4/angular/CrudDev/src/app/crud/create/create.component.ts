import { PositionsService } from './../../service/positions.service';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Positions } from '../../model/positions';
import { DevService } from '../../service/dev.service';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Dev } from '../../model/dev';

@Component({
  selector: 'app-create',
  standalone: true,
  imports: [RouterLink,ReactiveFormsModule],
  templateUrl: './create.component.html',
  styleUrl: './create.component.css'
})
export class CreateComponent {

  positions : Positions[] = [];
  devCreateForm = new FormGroup({
    name : new FormControl(""),
    salary : new FormControl(""),
    birthday : new FormControl(""),
    gender : new FormControl(""),
    img : new FormControl(""),
    positions : new FormControl(""),
  })
  constructor(private positionsService : PositionsService,private devService : DevService){}

  ngOnInit(){
    this.fetchDataPositions()

  }
  fetchDataPositions() {
    this.positionsService.getAllPositions().subscribe({
      next : (res) => this.positions = res 
    })
  }
  submit() {
    const dev = this.devCreateForm.value as unknown as Dev; 
    this.devService.saveProduct(dev).subscribe({

    })
    console.log(dev);
    
    }

}
