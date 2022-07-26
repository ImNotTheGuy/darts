package com.ludo.darts.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT")
    private long id;
    private int gameType;
    private boolean doubleOut;
    private Timestamp creationDate;

    

    public Game() {
    }

    public Game(int gameType, boolean doubleOut) {
        this.gameType = gameType;
        this.doubleOut = doubleOut;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGameType() {
        return gameType;
    }

    public void setGameType(int gameType) {
        this.gameType = gameType;
    }

    public boolean isDoubleOut() {
        return doubleOut;
    }

    public void setDoubleOut(boolean doubleOut) {
        this.doubleOut = doubleOut;
    }

    @Override
    public String toString() {
        return "Game [doubleOut=" + doubleOut + ", gameType=" + gameType + ", id=" + id + "]";
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

}
