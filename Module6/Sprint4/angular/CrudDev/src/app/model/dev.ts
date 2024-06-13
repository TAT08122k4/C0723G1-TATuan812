import { Positions } from './positions';
import { Data } from "@angular/router";

export interface Dev {
    id? : number,
    name : String,
    salary : number,
    birthday : Date,
    gender : boolean,
    img : String,
    positions : Positions
}
