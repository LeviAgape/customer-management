package com.example.Gerenciamento.domain.user;

import jakarta.persistence.*;
import lombok.*;

@Table(name="user")
@Entity(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id @GeneratedValue (strategy = GenerationType.UUID)
    private String id;

    private String login;

    private String password;

    public User(RequestUser requestuser){
        this.login = requestuser.login();
        this.password = requestuser.password();
    }
}
