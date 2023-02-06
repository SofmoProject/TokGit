package com.sofmo.TokGit.db.repository;

import com.sofmo.TokGit.db.entity.Characters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactersRepository extends JpaRepository<Characters, Integer> {
}
