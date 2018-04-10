package com.ilkwon.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ilkwon.models.Board;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long>{ 

}
