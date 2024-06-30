package com.magic.demo.Player;

import java.beans.JavaBean;

import org.springframework.data.jpa.repository.JpaRepository;

@JavaBean
public interface PlayerRepository extends JpaRepository<Player, Long>{ 
    
}
