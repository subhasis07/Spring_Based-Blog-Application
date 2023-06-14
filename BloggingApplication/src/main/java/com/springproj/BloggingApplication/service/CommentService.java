package com.springproj.BloggingApplication.service;

import com.springproj.BloggingApplication.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
