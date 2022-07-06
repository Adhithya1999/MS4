package com.springboot.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Players;
import com.springboot.repository.PlayersRepository;

public class Playerservice {
	@Service
	public class CricketDataService {
	    @Autowired
	    private PlayersRepository repository;

	    // to add the Player
	    public Players addPlayer(Players Player) {
	        return repository.save(Player);
	    }

	    // to get the Player based on his id
	    public Players getPlayerById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    // to get all the Player
	    public List<Players> getAllPlayer() {
	        return repository.findAll();
	    }



	    // to delete the Player
	    public String deletePlayer(int id) {
	        repository.deleteById(id);
	        return "Player deleted";
	    }

	}

	public Players getPlayerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
