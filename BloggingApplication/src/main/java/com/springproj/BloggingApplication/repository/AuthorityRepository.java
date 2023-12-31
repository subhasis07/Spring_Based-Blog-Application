package com.springproj.BloggingApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproj.BloggingApplication.model.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    Optional<Authority> findByAuthority(String authority);

}
