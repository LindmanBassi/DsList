package br.com.bassi.DsList.dto;

import br.com.bassi.DsList.domain.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class GameListDTO {

    private Long id;

    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
