package squarestats.stat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import squarestats.stat.entity.StatEntity;

import java.util.Collection;

@Component
public interface StatRepository extends CrudRepository<StatEntity, Long> {
    @Query("SELECT count(stat_entity) from StatEntity stat_entity where stat_entity.factoryId = :factoryId AND stat_entity.gameStatus = :gameStatus")
    int ongoing(@Param("factoryId") String factoryId, @Param("gameStatus") String gameStatus);
}
