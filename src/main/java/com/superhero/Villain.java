package com.superhero;

public class Villain extends AbstractHero {
    public Villain(String name, HeroStatistics heroStatistics, TeamType teamType) {
        super(name, heroStatistics, teamType);
    }

    public int getPower() {

        int health = getHeroStatistics().getHealth();
        int attack = getHeroStatistics().getAttack();
        int defence = getHeroStatistics().getDefense();
        return (health + attack) * defence;
    }

}
