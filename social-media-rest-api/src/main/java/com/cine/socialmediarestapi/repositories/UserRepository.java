package com.cine.socialmediarestapi.repositories;

import com.cine.socialmediarestapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
