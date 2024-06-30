package com.magic.demo.Player;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    private PlayerRepository repository;
    public Logger log = LoggerFactory.getLogger(PlayerController.class);
    
    PlayerController(PlayerRepository repository){
        this.repository = repository;
    }

    @GetMapping("/players")
    List<Player> all() {
        log.error("You have Players");
        return repository.findAll();
    }

    @PostMapping("/players")
    Player newPlayer(@RequestBody Player newPlayer) {
        return repository.save(newPlayer);
    }

    // @PutMapping("/player/{id}")
    // Player updatePlayer(@PathVariable Long id){

    //     return repository.getReferenceById(id).map(player -> {
    //         player.setDeckList()
    //     });
    // }
    @DeleteMapping("player/{id}")
    void deletePlayer(@PathVariable Long id){
        repository.deleteById(id);
    }
}
