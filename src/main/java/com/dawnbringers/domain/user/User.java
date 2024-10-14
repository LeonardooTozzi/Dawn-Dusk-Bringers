package com.dawnbringers.domain.user;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique=true)
    private String username;

    private String password;

    private String firstName;

    private String lastName;

    @Column(unique=true)
    private String email;

    private String phone;

    @Enumerated(EnumType.STRING)
    private String type;

}
