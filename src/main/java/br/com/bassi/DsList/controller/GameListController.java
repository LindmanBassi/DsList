package br.com.bassi.DsList.controller;

import br.com.bassi.DsList.dto.GameListDTO;
import br.com.bassi.DsList.dto.GameMinDTO;
import br.com.bassi.DsList.dto.ReplacementDTO;
import br.com.bassi.DsList.service.GameListService;
import br.com.bassi.DsList.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/lists")
@RestController
@RequiredArgsConstructor
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }


    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());}



}
