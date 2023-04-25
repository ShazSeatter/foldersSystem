package com.codeclan.filesfoldersusersproject.repositories;

import com.codeclan.filesfoldersusersproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
