package br.com.bassi.DsList.repositories;

import br.com.bassi.DsList.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
