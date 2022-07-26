package com.ludo.darts.api;


import java.util.List;

import org.json.simple.JSONObject;
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
import com.ludo.darts.business.PlayerService;
import com.ludo.darts.business.ThrowLogsService;
import com.ludo.darts.entity.Game;
import com.ludo.darts.entity.Player;
import com.ludo.darts.entity.ThrowLogs;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class ThrowLogsController implements ControllerInterface<ThrowLogs>{


    @Autowired
    ThrowLogsService throwLogsService;

    @Autowired
    PlayerService playerService;

    @Autowired
    GameService gameService;


    @PostMapping("throwlogs")
    public void create(@RequestBody JSONObject jsonObject) {
        
        ThrowLogs throwLogs = new ThrowLogs();
        System.out.println(jsonObject);
        System.out.println(jsonObject.toString());
        int playerId = Integer.parseInt(jsonObject.get("playerId").toString());
        int gameId = Integer.parseInt(jsonObject.get("gameId").toString());
        int dartNumber = Integer.parseInt(jsonObject.get("dartNumber").toString());
        int score = Integer.parseInt(jsonObject.get("score").toString());

        Player player = playerService.findById(playerId);
        Game game = gameService.findById(gameId);

        throwLogs.setPlayer(player);
        throwLogs.setGame(game);
        throwLogs.setDartNumber(dartNumber);
        throwLogs.setScore(score);

        System.out.println(throwLogs);

        throwLogsService.create(throwLogs);

    }

    @Override
    @DeleteMapping("throwlogs/{id}")
    public void deleteById(@PathVariable long id) {
        throwLogsService.deleteById(id);
        
    }

    @Override
    @GetMapping("throwlogs")
    public List<ThrowLogs> findAll() {
        return throwLogsService.findAll();
    }

    @Override
    @GetMapping("throwlogs/{id}")
    public ThrowLogs findById(@PathVariable long id) {
        return throwLogsService.findById(id);
    }

    @Override
    @PatchMapping("throwlogs/{id}")
    public void update(@RequestBody ThrowLogs entity,@PathVariable long id) {
        throwLogsService.update(entity);
        
    }

    

    

}
