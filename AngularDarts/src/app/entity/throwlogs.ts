import { Game } from "./game";
import { Player } from "./player";

export interface throwLogs{

    id: number;
    player: Player;
    game: Game;
    creationDate: EpochTimeStamp;
    dartNumber: number;
    score: number;

}