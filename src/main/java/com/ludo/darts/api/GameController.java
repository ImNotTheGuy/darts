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

import com.ludo.darts.business.GameService;
import com.ludo.darts.entity.Game;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class GameController implements ControllerInterface<Game>{


    @Autowired
    GameService gameService;

    @PostMapping("games")
    public void create(@RequestBody Game entity) {
        gameService.create(entity);
    }

    @Override
    @DeleteMapping("games/{id}")
    public void deleteById(@PathVariable long id) {
        gameService.deleteById(id);
        
    }

    @Override
    @GetMapping("games")
    public List<Game> findAll() {
        return gameService.findAll();
    }

    @Override
    @GetMapping("games/{id}")
    public Game findById(@PathVariable long id) {
        return gameService.findById(id);
    }

    @Override
    @PatchMapping("games/{id}")
    public void update(@RequestBody Game entity,@PathVariable long id) {
        gameService.update(entity);
        
    }

    

    

}
