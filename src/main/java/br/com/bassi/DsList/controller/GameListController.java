package br.com.bassi.DsList.controller;

import br.com.bassi.DsList.dto.GameListDTO;
import br.com.bassi.DsList.service.GameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/lists")
@RestController
@RequiredArgsConstructor
public class GameListController {

    private final GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }



}
