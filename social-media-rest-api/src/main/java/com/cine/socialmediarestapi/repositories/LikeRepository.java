package com.cine.socialmediarestapi.repositories;

import com.cine.socialmediarestapi.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
