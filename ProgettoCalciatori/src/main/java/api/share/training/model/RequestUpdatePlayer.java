package api.share.training.model;

import javax.persistence.Column;

public class RequestUpdatePlayer {
	
	@Column(name="squadra", nullable = true, updatable=true)
	private String squadra;

	public String getSquadra() {
		return squadra;
	}

}
