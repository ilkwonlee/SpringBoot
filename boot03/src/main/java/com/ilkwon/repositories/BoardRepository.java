package com.ilkwon.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ilkwon.models.Board;


public interface BoardRepository extends CrudRepository<Board, Long>{

	
}
