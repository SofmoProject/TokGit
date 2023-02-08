package com.sofmo.TokGit.db.repository;

import com.sofmo.TokGit.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
