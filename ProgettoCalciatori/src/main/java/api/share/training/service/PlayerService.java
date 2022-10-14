package api.share.training.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import api.share.training.model.RequestInsertPlayer;
import api.share.training.model.RequestUpdatePlayer;
import api.share.training.repository.PlayerRepository;
import net.minidev.json.JSONObject;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository pRepo;
	
	/**
	public List<Player> getAllPlayers() {
		return pRepo.findAll();
	}
	
	
	public Optional<Player> getPlayerByID(int id) {
		return this.listaGiocatori.stream().filter(p->p.getId()==id).findFirst();
	}	
	*/
	
	public List <JSONObject> getAllPlayers(){
		return pRepo.getAllPlayers();
	}
	
	public List <JSONObject> getPlayerById(int id){
		return pRepo.getPlayersById(id);
	}
	
	///Nuovo da Qui
	public void insertPlayer(@RequestBody RequestInsertPlayer playerToBeInsered){
		this.pRepo.insertPlayer(playerToBeInsered.getNome(), playerToBeInsered.getCognome(), playerToBeInsered.getSquadra());
	}
	
	public void updatePlayer(@PathVariable int id, @RequestBody RequestUpdatePlayer playerToBeModified) {
		this.pRepo.updatePlayer(id, playerToBeModified.getSquadra());
	}
	
	public void deletePlayerById(int id){
		pRepo.deletePlayersById(id);
	}
	
}
