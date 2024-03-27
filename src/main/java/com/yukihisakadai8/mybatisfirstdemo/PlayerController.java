package com.yukihisakadai8.mybatisfirstdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    private final PlayersMapper playerMapper;

    public PlayerController(PlayersMapper playerMapper) {

        this.playerMapper = playerMapper;
    }
    
    @GetMapping("/players")
    public List<Player> findAll() {
        return playerMapper.findAll();
    }


}
