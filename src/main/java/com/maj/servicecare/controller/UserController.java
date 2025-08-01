package com.maj.servicecare.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maj.servicecare.entity.Person;
import com.maj.servicecare.repository.UserRepository;

	@RestController
	@RequestMapping("/users")
	public class UserController {

	    private final UserRepository repo;

	    public UserController(UserRepository repo) {
	        this.repo = repo;
	    }

	    @PostMapping
	    public Person create(@RequestBody Person user) {
	        return repo.save(user);
	    }

	    @GetMapping
	    public List<Person> readAll() {
	        return repo.findAll();
	    }
	}
