package com.ludo.darts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ludo.darts.entity.ThrowLogs;

public interface ThrowLogsRepository extends JpaRepository<ThrowLogs, Long> {

}
