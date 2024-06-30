package com.magic.demo.Deck;

import com.magic.demo.Card.Card;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Deck {

    private @Id
    @GeneratedValue Long id;

    @OneToMany
    private Card[] cardList;
    private String Format;

    public Card[] getCardList() {
        return cardList;
    }
    public void setCardList(Card[] cardList) {
        this.cardList = cardList;
    }
    public String getFormat() {
        return Format;
    }
    public void setFormat(String format) {
        Format = format;
    }
}
