package com.magic.demo.Player;

import com.magic.demo.Deck.Deck;

import jakarta.persistence.Entity;

@Entity
public class Player {

    private String userName;
    private Deck[] deckList;

    public Deck[] getDeckList() {
        return deckList;
    }
    public void setDeckList(Deck[] deckList) {
        this.deckList = deckList;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
