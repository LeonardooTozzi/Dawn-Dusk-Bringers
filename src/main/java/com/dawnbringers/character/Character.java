package com.dawnbringers.character;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="character")
@Table(name="users_characters")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@NoArgsConstructor

public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
