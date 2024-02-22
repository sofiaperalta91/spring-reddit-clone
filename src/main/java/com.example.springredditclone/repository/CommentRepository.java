package com.example.springredditclone.repository;

import com.example.springredditclone.model.Comment;
import com.example.springredditclone.model.Post;
import com.example.springredditclone.model.User;

import java.util.List;

public interface CommentRepository {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
