package com.magic.demo.Player;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//Placeholder commit
@RestController
public class PlayerController {

    private PlayerRepository repository;
    public Logger log = LoggerFactory.getLogger(PlayerController.class);
    
    PlayerController(PlayerRepository repository){
        this.repository = repository;
    }

    @GetMapping("/players")
    List<Player> all() {
        return repository.findAll();
    }

    @GetMapping("/players/{id}")
    Player findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/players")
    Player newPlayer(@RequestBody Player newPlayer) {
        log.info(newPlayer.toString());
        return repository.save(newPlayer);
    }
    
    @PutMapping("/players/{id}")
    Player updatePlayer(@PathVariable Long id, @RequestBody Player newPlayer){
        log.info(newPlayer.toString());
        repository.findById(id).get().setUserName(newPlayer.getUserName());
        repository.findById(id).get().setDeckList(newPlayer.getDeckList());
        return repository.findById(id).get();
    }

    @DeleteMapping("players/{id}")
    void deletePlayer(@PathVariable Long id){
        repository.deleteById(id);
    }
}
