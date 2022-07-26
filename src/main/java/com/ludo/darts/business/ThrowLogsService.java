package com.ludo.darts.business;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludo.darts.dao.ThrowLogsRepository;
import com.ludo.darts.entity.ThrowLogs;

@Service
public class ThrowLogsService implements ServiceInterface<ThrowLogs>{

    @Autowired
    ThrowLogsRepository throwLogsRepository;
    
    @Autowired
    GameService gameService;

    @Autowired
    PlayerService playerService;


    @Override
    public void create(ThrowLogs entity) {
        
        entity.setCreationDate(new Timestamp(Instant.now().toEpochMilli()));
        throwLogsRepository.save(entity);
        
    }

    @Override
    public void deleteById(long id) {
        throwLogsRepository.deleteById(id);
        
    }

    @Override
    public List<ThrowLogs> findAll() {
        return throwLogsRepository.findAll();
    }

    @Override
    public ThrowLogs findById(long id) {
        return throwLogsRepository.findById(id).get();
    }

    @Override
    public void update(ThrowLogs entity) {
        throwLogsRepository.save(entity);
        
    }

    
    
    
}
