package br.com.bassi.DsList.service;

import br.com.bassi.DsList.domain.GameList;
import br.com.bassi.DsList.dto.GameListDTO;
import br.com.bassi.DsList.projections.GameMinProjection;
import br.com.bassi.DsList.repositories.GameListRepository;
import br.com.bassi.DsList.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GameListService {

    private final GameListRepository gameListRepository;
    private final GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x ->new GameListDTO(x)).toList();

    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex:sourceIndex;
        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);}
    }



}
