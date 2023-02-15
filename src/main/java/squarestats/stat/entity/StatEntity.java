package squarestats.stat.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import squarestats.stat.DTO.GameStatDTO;

import java.util.UUID;


@Builder
@Getter
@Setter
@AllArgsConstructor
@Entity
public class StatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String factoryId;
    private UUID gameId;
    private String gameStatus;
    private UUID playerA;
    private UUID playerB;
    public StatEntity() {
    }
    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }
    public void setPlayerB(UUID playerB) {
        this.playerB = playerB;
    }
    public void setPlayerA(UUID playerA) {
        this.playerA = playerA;
    }
    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }
    public void setGameId(UUID gameId) {
        this.gameId = gameId;
    }
}
