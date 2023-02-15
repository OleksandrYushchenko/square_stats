package squarestats.stat.DTO;

import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class GameStatDTO {
    private String factoryId;
    private UUID gameId;
    private String gameStatus;
    private UUID playerA;
    private UUID playerB;
    public UUID getGameId() {
        return gameId;
    }
    public String getFactoryId() {
        return factoryId;
    }
    public UUID getPlayerB() {
        return playerB;
    }
    public UUID getPlayerA() {
        return playerA;
    }
    public String getGameStatus() {
        return gameStatus;
    }
}
