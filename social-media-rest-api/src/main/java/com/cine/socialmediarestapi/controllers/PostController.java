package com.cine.socialmediarestapi.controllers;

import com.cine.socialmediarestapi.entities.Like;
import com.cine.socialmediarestapi.entities.Post;
import com.cine.socialmediarestapi.entities.User;
import com.cine.socialmediarestapi.repositories.PostRepository;
import com.cine.socialmediarestapi.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    PostRepository postRepository;
    UserRepository userRepository;

    public PostController(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/posts")
    public List<Post> retrievePost() {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Post retrievePost(@PathVariable Long id) {
        Optional<Post> post = postRepository.findById(id);

        if (post.isEmpty()) {
            throw new RuntimeException();
        }

        return post.get();
    }

    @DeleteMapping("/posts/{id}")
    public ResponseEntity<Post> deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

//    @PostMapping("/posts/{id}/like")
//    public ResponseEntity<Like> likePost(@PathVariable Long id) {
//        Optional<Post> post = postRepository.findById(id);
//
//        if (post.isEmpty()) {
//            throw new RuntimeException();
//        }
//
//        Like like = new Like();
//        like.setPost(post.get());
//
//    }
}