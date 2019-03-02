package com.superhero;

public class SuperHero extends AbstractHero{
    public SuperHero(String name, HeroStatistics heroStatistics, TeamType teamType) {
        super(name, heroStatistics, teamType);
    }

    public int getPower() {
        int healt =  getHeroStatistics().getHealth();
        int attack = getHeroStatistics().getAttack();
        int defene = getHeroStatistics().getDefense();

        return (defene + attack) * healt ;
    }


}
