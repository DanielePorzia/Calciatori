package api.share.training.model;

public class Player {

	private String nome,cognome,squadra;
	
	public Player(String nome, String cognome, String squadra) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.squadra = squadra;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	
	
}
