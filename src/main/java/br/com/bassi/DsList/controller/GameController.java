package br.com.bassi.DsList.controller;

import br.com.bassi.DsList.domain.Game;
import br.com.bassi.DsList.dto.GameMinDTO;
import br.com.bassi.DsList.service.GameService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/games")
@RestController
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return  result;
    }
}
