package br.com.bassi.DsList.service;

import br.com.bassi.DsList.domain.GameList;
import br.com.bassi.DsList.dto.GameListDTO;
import br.com.bassi.DsList.repositories.GameListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GameListService {

    private final GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x ->new GameListDTO(x)).toList();

    }



}
