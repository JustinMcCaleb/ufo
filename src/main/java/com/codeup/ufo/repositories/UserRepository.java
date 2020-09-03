package com.codeup.ufo.repositories;

import com.codeup.ufo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
