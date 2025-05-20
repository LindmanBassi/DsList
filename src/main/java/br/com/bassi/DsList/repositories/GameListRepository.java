package br.com.bassi.DsList.repositories;

import br.com.bassi.DsList.domain.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
