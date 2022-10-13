package api.share.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import api.share.training.model.Player;
import net.minidev.json.JSONObject;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
	
	@Query(value = "select * from player", nativeQuery = true)
    public List <JSONObject> getAllPlayers();
	
	@Query(value = "select * from player where squadra=:squadra", nativeQuery = true)
    public List <JSONObject> getPlayersByTeam(@Param("squadra") String squadra);
}
