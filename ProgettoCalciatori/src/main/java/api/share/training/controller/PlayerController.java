package api.share.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.share.training.model.Player;
import api.share.training.service.PlayerService;

@RestController
@RequestMapping("/progettoCalciatori")
public class PlayerController {

	@Autowired
	private PlayerService pService;
	
	@GetMapping("/players")
	public List<Player> getAllPlayers(@RequestHeader int RequestId, @RequestHeader int SessionId) {
		return this.pService.getAllPlayers();
	}
	
	@GetMapping("/players/{id}")
	public Optional<Player> getPlayerByID(@PathVariable int id, @RequestHeader int RequestId, @RequestHeader int SessionId) {
		return pService.getPlayerByID(id);
	}
}
