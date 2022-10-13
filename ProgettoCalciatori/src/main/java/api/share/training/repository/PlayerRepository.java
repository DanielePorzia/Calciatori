package api.share.training.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import api.share.training.model.Player;
import net.minidev.json.JSONObject;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
	
	@Query(value = "select * from player", nativeQuery = true)
    public List <JSONObject> getAllPlayers();
	
	@Query(value = "select * from player where id=:id", nativeQuery = true)
    public List <JSONObject> getPlayersById(@Param("id") int id);
	
	
	///Nuovo da Qui
	
	@Transactional
    @Modifying
    @Query(value="INSERT INTO players (nome,cognome,squadra) VALUES(:nome, :cognome, :squadra) ", nativeQuery = true)
    void insertPlayer(@Param("nome") String nome, @Param("cognome") String cognome, @Param("squadra") String squadra);



}
