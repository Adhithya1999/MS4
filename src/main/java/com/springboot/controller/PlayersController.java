package com.springboot.controller;

    import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

import com.springboot.entity.Players;
import com.springboot.servicelayer.Playerservice;

import java.util.List;

	@RestController
	public class PlayersController {

	    @Autowired
	    private Playerservice service;

	    @GetMapping("/player/{id}")
	    public Players getPlayerById(@PathVariable int id) {
	        return service.getPlayerById(id);
	    }

	    @GetMapping("/Player")
	    public List<Players> getPlayer(){
	        return service.getAllPlayer();
	    }
	    @PostMapping("/Player")
	    public Players savePlayer(@RequestBody Players Player) {
	        return service.addPlayer(Player);
	    }

	}


}
