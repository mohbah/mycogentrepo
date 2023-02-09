package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Author;

import com.example.spring.service.AuthorServicee;


@RestController
@RequestMapping("author")
public class AuthorController {
	
	@Autowired
	AuthorServicee service;
	
	
	@GetMapping
	public List<Author> getAll(){
		return service.getAll();
	}
	
	
	@PostMapping
	public Author addAuthor(@Validated @RequestBody Author author) {
		return service.addAuthor(author);
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable int id) {
		return service.deleteAuthor(id);
	}
	


}
