package com.magic.demo.Player;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PlayerController {
    
    private PlayerRepository repository;

    public PlayerRepository getRepository() {
        return repository;
    }

    public void setRepository(PlayerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/players")
    List<Player> all(){
        return repository.findAll();
    }

    @PostMapping("/players")
  Player newPlayer(@RequestBody Player newPlayer) {
    return repository.save(newPlayer);
  }
}
