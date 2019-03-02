package com.superhero;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HeroStatistics {

    private int health;
    private int attack;
    private int defense;


    public void increaseHealth (int amount){
        health += amount;
    }
    public void increaseAttack (int amount){

        attack += amount;
    }
    public void increaseDefense (int amount){
        defense += amount;
    }
}
