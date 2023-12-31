package com.springproj.BloggingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproj.BloggingApplication.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}