package com.magic.demo.Card;

import jakarta.persistence.Entity;

@Entity
public class Card {
    
    private String name;
    private String version;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

}
