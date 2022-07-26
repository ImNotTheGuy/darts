package com.ludo.darts.business;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludo.darts.dao.GameRepository;
import com.ludo.darts.entity.Game;

@Service
public class GameService implements ServiceInterface<Game>{

    @Autowired
    GameRepository gameRepository;


    @Override
    public void create(Game entity) {
        entity.setCreationDate(new Timestamp(Instant.now().toEpochMilli()));
        gameRepository.save(entity);
        
    }

    @Override
    public void deleteById(long id) {
        gameRepository.deleteById(id);
        
    }

    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game findById(long id) {
        return gameRepository.findById(id).get();
    }

    @Override
    public void update(Game entity) {
        gameRepository.save(entity);
        
    }

   

    
}
