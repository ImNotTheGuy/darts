package com.ludo.darts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ludo.darts.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
