package br.com.bassi.DsList.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_game_list")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
