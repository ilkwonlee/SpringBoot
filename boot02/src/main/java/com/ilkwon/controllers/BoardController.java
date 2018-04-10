package com.ilkwon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilkwon.repositories.BoardRepository;


@RestController

public class BoardController {
	
	@Autowired
	BoardRepository boardRepository;
	
	@GetMapping("/board")
	String hello() {
		return "Hello World!";
	}

	@PostMapping("/board")
	String world() {
		return "Done";
	}
	
}
