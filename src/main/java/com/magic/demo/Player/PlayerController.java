package com.magic.demo.Player;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PlayerController {
    
    private PlayerRepository repository;
    public Logger log = LoggerFactory.getLogger(PlayerController.class);
    
    public PlayerRepository getRepository() {
        return repository;
    }

    public void setRepository(PlayerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/players")
    List<Player> all(){
        log.error("You have Players");
        return repository.findAll();
    }

    @PostMapping("/players")
  Player newPlayer(@RequestBody Player newPlayer) {
    return repository.save(newPlayer);
  }
}
