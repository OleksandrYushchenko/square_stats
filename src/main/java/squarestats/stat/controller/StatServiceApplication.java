package squarestats.stat.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import squarestats.stat.DTO.GameStatDTO;
import squarestats.stat.DTO.GameStatResponseDTO;
import squarestats.stat.entity.StatEntity;
import squarestats.stat.repository.StatRepository;
@Component
public class StatServiceApplication {
    public GameStatResponseDTO toResponseDTO (String factoryName, StatRepository statRepository){
        GameStatResponseDTO gameStatResponseDTO = new GameStatResponseDTO();
        System.out.println(factoryName);
        gameStatResponseDTO.setFactoryName(factoryName);
        gameStatResponseDTO.setOnGoing(statRepository.ongoing(factoryName, "ONGOING"));
        gameStatResponseDTO.setSetup(statRepository.ongoing(factoryName, "SETUP"));
        gameStatResponseDTO.setTerminated(statRepository.ongoing(factoryName, "TERMINATED"));
        return gameStatResponseDTO;
    }
    public GameStatResponseDTO pushGameStats(@RequestBody GameStatDTO gameStatDTO, StatRepository statRepository){
        StatEntity statEntity = new StatEntity();
        statEntity.setGameId(gameStatDTO.getGameId());
        statEntity.setPlayerA(gameStatDTO.getPlayerA());
        statEntity.setPlayerB(gameStatDTO.getPlayerB());
        statEntity.setFactoryId(gameStatDTO.getFactoryId());
        statEntity.setGameStatus(gameStatDTO.getGameStatus());
        statRepository.save(statEntity);
        return toResponseDTO(gameStatDTO.getFactoryId(), statRepository);
    }
}
