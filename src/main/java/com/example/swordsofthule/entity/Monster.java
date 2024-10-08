package com.example.swordsofthule.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "monsters")
@Data
@NoArgsConstructor
public class Monster extends Character{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Campo obbligatorio")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MonsterType type;

    public Monster(String name, int level, int attack, int defence, int hitPointsMax, int hitPoints, MonsterType type){
        super(name,level,attack,defence,hitPointsMax,hitPoints);
        this.type=type;
    }
}
