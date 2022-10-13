package api.share.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.share.training.model.Player;
import api.share.training.repository.PlayerRepository;
import net.minidev.json.JSONObject;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository pRepo;
	private List<Player> listaGiocatori;
	
	public List<Player> getAllPlayers() {
		return pRepo.findAll();
		//return listaGiocatori;
	}
	
	public Optional<Player> getPlayerByID(int id) {
		return this.listaGiocatori.stream().filter(p->p.getId()==id).findFirst();
	}	
	
	public List <JSONObject> getAllPlayersSQL(){
		return pRepo.getAllPlayers();
	}
	
	public List <JSONObject> getPlayerByTeam(String squadra){
		return pRepo.getPlayersByTeam(squadra);
	}
}
