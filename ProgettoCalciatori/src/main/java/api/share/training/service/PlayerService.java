package api.share.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import api.share.training.model.Player;

@Service
public class PlayerService {

	private List<Player> listaGiocatori;

	public PlayerService() {
		super();
		listaGiocatori = new ArrayList<>(List.of(new Player("Francesco", "Totti", "As Roma"), 
												 new Player("Javier","Zanetti","FC Inter"), 
												 new Player("Paolo","Maldini","AC Milan")));
	}
	
	public List<Player> getAllPlayers() {
		return listaGiocatori;
	}
	
	
}
