package com.ludo.darts.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.ludo.darts.business.PlayerService;
import com.ludo.darts.entity.Player;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class PlayerController implements ControllerInterface<Player>{


    @Autowired
    PlayerService playerService;

    @PostMapping("players")
    public void create(@RequestBody Player entity) {
        playerService.create(entity);
    }

    @Override
    @DeleteMapping("players/{id}")
    public void deleteById(@PathVariable long id) {
        playerService.deleteById(id);
        
    }

    @Override
    @GetMapping("players")
    public List<Player> findAll() {
        return playerService.findAll();
    }

    @Override
    @GetMapping("players/{id}")
    public Player findById(@PathVariable long id) {
        return playerService.findById(id);
    }

    @Override
    @PatchMapping("players/{id}")
    public void update(@RequestBody Player entity,@PathVariable long id) {
        playerService.update(entity);
        
    }

    

    

}
