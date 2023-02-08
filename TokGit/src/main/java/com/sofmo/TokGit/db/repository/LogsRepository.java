package com.sofmo.TokGit.db.repository;

import com.sofmo.TokGit.db.entity.Logs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsRepository extends JpaRepository<Logs, Integer> {
}
