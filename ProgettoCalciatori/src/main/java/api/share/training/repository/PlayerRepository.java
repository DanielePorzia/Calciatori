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
	
	@Transactional
    @Modifying
    @Query(value="INSERT INTO player (nome,cognome,squadra) VALUES(:nome, :cognome, :squadra) ", nativeQuery = true)
    public void insertPlayer(@Param("nome") String nome, @Param("cognome") String cognome, @Param("squadra") String squadra);
	
	@Transactional
    @Modifying
    @Query(value="UPDATE player SET squadra=:squadra WHERE id=:id) ", nativeQuery = true)
    public void updatePlayer(@Param("id") int id, @Param("squadra") String squadra);

	@Transactional
    @Modifying
	@Query(value = "DELETE from player where id=:id", nativeQuery = true)
    public void deletePlayersById(@Param("id") int id);;
}

