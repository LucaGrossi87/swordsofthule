package com.example.swordsofthule.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Campo obbligatorio")
    @Column(nullable = false)
    private String firstName;

    @NotBlank(message = "Campo obbligatorio")
    @Column(nullable = false)
    private String lastName;

    @NotBlank(message = "Campo obbligatorio")
    @Column(nullable = false)
    private String userName;

    @Email(message = "Campo obbligatorio")
    @Column(nullable = false)
    private String email;

    @NotBlank(message = "Campo obbligatorio")
    @Column(nullable = false)
    private String password;

    @NotNull(message = "Campo obbligatorio")
    @Column(nullable = false)
    private int goldShards;

    @OneToMany
    @Column(nullable = false)
    private List<Hero> heroList;

    public User (String firstName,String lastName, String userName, String password, String email, int goldShards, List<Hero> heroList){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.email=email;
        this.password=password;
        this.goldShards=goldShards;
        this.heroList=heroList;
    }
}
