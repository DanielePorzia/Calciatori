package api.share.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import api.share.training.model.Player;

@Service
public class PlayerService {

	private List<Player> listaGiocatori;

	public PlayerService() {
		super();
		listaGiocatori = new ArrayList<>(List.of(new Player(1, "Francesco", "Totti", "As Roma"), 
												 new Player(2, "Javier","Zanetti","FC Inter"), 
												 new Player(3, "Paolo","Maldini","AC Milan")));
	}
	
	public List<Player> getAllPlayers() {
		return listaGiocatori;
	}
	
	public Optional<Player> getPlayerByID(int id) {
		return this.listaGiocatori.stream().filter(p->p.getId()==id).findFirst();
	}	
	
	
}
