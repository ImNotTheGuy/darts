import { Timestamp } from "rxjs";
import { HttpClient } from "@angular/common/http";

export interface Player{
    id: number;
    username: string;
    joinDate: EpochTimeStamp;
}
