package squarestats.stat.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import squarestats.stat.entity.StatEntity;
import squarestats.stat.repository.StatRepository;

import java.util.UUID;

public class GameStatResponseDTO {
    private String factoryId;
    private int onGoing;
    private int setup;
    private int terminated;
    public void setFactoryName(String factoryName) {
        this.factoryId = factoryName;
    }

    public void setOnGoing(int onGoing) {
        this.onGoing = onGoing;
    }

    public void setSetup(int setup) {
        this.setup = setup;
    }

    public void setTerminated(int terminated) {
        this.terminated = terminated;
    }

    public int getOnGoing() {
        return onGoing;
    }

    public int getSetup() {
        return setup;
    }

    public int getTerminated() {
        return terminated;
    }

    public String getFactoryId() {
        return factoryId;
    }
}
