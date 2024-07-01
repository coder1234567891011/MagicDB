package com.magic.demo.Deck;

import java.util.List;

import com.magic.demo.Card.Card;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Deck {

    private @Id
    @GeneratedValue Long id;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Card> cardList;
    private String Format;

    public List<Card> getCardList() {
        return cardList;
    }
    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
    public String getFormat() {
        return Format;
    }
    public void setFormat(String format) {
        Format = format;
    }
}
