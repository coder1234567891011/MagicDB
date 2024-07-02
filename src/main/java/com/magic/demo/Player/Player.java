package com.magic.demo.Player;

import java.util.List;

import com.magic.demo.Deck.Deck;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Player {

    private @Id
    @GeneratedValue Long id;
    
    private String userName;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Deck> deckList;

    public List<Deck> getDeckList() {
        return deckList;
    }
    public void setDeckList(List<Deck> deckList) {
        this.deckList = deckList;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String deckAgg = null;
        int i = 0;
        while(this.getDeckList().get(i) != null){
            deckAgg = deckAgg + this.deckList.get(i).getFormat();
            i++;
        }
        String agg = this.id + " " + this.userName + deckAgg;
        return agg;
    }
}
