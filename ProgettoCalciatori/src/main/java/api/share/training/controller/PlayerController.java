package api.share.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.share.training.model.Player;
import api.share.training.service.PlayerService;

@RestController
@RequestMapping("/progettoCalciatori")
public class PlayerController {

	@Autowired
	private PlayerService pService;
	
	@GetMapping("/player")
	public List<Player> getAllPlayers() {
		return this.pService.getAllPlayers();
	}
}
