package com.magic.demo.Player;

import com.magic.demo.Deck.Deck;

import jakarta.persistence.Entity;

@Entity
public class Player {
    
    private String userName;
    private int lifeTotal;
    private int poisonCount;
    private Deck deck;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLifeTotal() {
        return lifeTotal;
    }
    public void setLifeTotal(int lifeTotal) {
        this.lifeTotal = lifeTotal;
    }
    public int getPoisonCount() {
        return poisonCount;
    }
    public void setPoisonCount(int poisonCount) {
        this.poisonCount = poisonCount;
    }
    public Deck getDeck() {
        return deck;
    }
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

}
