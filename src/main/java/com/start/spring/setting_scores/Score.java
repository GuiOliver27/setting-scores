package com.start.spring.setting_scores;

public class Score {
    int wins;
    int ties;
    int losses;

    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    public int getTies() {
        return ties;
    }
    public void setTies(int ties) {
        this.ties = ties;
    }
    public int getLosses() {
        return losses;
    }
    public void setLosses(int losses) {
        this.losses = losses;
    }
    
    public Score(int wins, int ties, int losses) {
        this.wins = wins;
        this.ties = ties;
        this.losses = losses;
    }
}