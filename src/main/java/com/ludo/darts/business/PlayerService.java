package com.ludo.darts.business;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludo.darts.dao.PlayerRepository;
import com.ludo.darts.entity.Player;

@Service
public class PlayerService implements ServiceInterface<Player>{

    @Autowired
    PlayerRepository playerRepository;


    @Override
    public void create(Player entity) {
        entity.setJoinDate(new Timestamp(Instant.now().toEpochMilli()));
        playerRepository.save(entity);
        
    }

    @Override
    public void deleteById(long id) {
        playerRepository.deleteById(id);
        
    }

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public Player findById(long id) {
        return playerRepository.findById(id).get();
    }

    @Override
    public void update(Player entity) {
        playerRepository.save(entity);
        
    }

    

    



}
