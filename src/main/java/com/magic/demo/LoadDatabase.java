package com.magic.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.magic.demo.Player.PlayerRepository;
import com.magic.demo.Player.Player;

@Configuration
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(PlayerRepository repository) {

    return args -> {
        repository.save(new Player());
    };
  }
}
