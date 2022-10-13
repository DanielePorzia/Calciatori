package api.share.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="player")
@Table(name="player")
public class Player {

	@Column(name="id", nullable = false)
	@Id
	private int id;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="cognome", nullable = false)
	private String cognome;
	
	@Column(name="squadra", nullable = true)
	private String squadra;
	
	public Player() {
		super();
	}
	/**
	 * Crea classe Request e RequestUpdate
	 * @param id
	 * @param nome
	 * @param cognome
	 * @param squadra
	 */
	public Player(int id, String nome, String cognome, String squadra) {
		super();
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
