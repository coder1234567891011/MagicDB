package com.magic.demo.Player;

import com.magic.demo.Deck.Deck;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Player {

    private @Id
    @GeneratedValue Long id;
    private String userName;
    @OneToMany
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
