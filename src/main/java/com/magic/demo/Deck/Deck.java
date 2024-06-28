package com.magic.demo.Deck;

import com.magic.demo.Card.Card;

import jakarta.persistence.Entity;

@Entity
public class Deck {
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
