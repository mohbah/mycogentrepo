package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {

}
