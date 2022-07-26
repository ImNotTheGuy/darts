package com.ludo.darts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ludo.darts.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
