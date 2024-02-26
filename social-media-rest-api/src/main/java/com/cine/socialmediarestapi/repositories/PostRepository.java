package com.cine.socialmediarestapi.repositories;

import com.cine.socialmediarestapi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
