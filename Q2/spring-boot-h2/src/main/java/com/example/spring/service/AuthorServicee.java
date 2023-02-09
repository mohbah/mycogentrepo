package com.example.spring.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Author;
import com.example.spring.repository.AuthorRepository;


@Service
public class AuthorServicee {

	@Autowired
	private AuthorRepository authorRepository;
	
	
	public String deleteAuthor(long authorId) {
		authorRepository.deleteById(authorId);
		return "has been deleted!";
	}
	
	public List<Author> getAll() {
		return authorRepository.findAll();
	}
	
	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}
	
	
	
	
	
}
