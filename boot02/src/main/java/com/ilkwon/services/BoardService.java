package com.ilkwon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilkwon.models.Board;
import com.ilkwon.repositories.BoardRepository;

@Service

public class BoardService {
	
	@Autowired
	BoardRepository boardRepository;

	public void writer() {
		Board b = new Board();
		b.setTitle("Hello");
		b.setContent("World");
		b.setWritter("user00");
		boardRepository.save(b);
	}

	public String read() {
		return boardRepository.findById(1L).get().toString();
	}

}
