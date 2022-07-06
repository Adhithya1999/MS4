package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Players;

public interface PlayersRepository extends JpaRepository<Players,Integer> {
	

}
