package squarestats.stat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import squarestats.stat.DTO.GameStatDTO;
import squarestats.stat.DTO.GameStatResponseDTO;
import squarestats.stat.entity.StatEntity;
import squarestats.stat.repository.StatRepository;

@RestController
public class StatController {
//    @Autowired
//    private GameStatDTO gameStatDTO;
    @Autowired
    private StatServiceApplication statServiceApplication;
    @Autowired
    private StatRepository statRepository;
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    @PostMapping("/push/{gameId}")
    public GameStatResponseDTO pushGameStats(@RequestBody GameStatDTO gameStatDTO){
        return statServiceApplication.pushGameStats(gameStatDTO, statRepository);
    }
    @GetMapping("/get/{factoryId}")
    public GameStatResponseDTO getGameStats(@PathVariable String factoryId ){
        return statServiceApplication.toResponseDTO(factoryId, statRepository);
    }
}
