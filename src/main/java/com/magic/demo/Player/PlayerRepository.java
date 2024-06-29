package com.magic.demo.Player;

import org.springframework.data.jpa.repository.JpaRepository;

interface PlayerRepository extends JpaRepository<Player, Long>{ 
    
}
