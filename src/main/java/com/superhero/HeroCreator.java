package com.superhero;

//fabryka abstrakcyjna - nazwa wzorca

public class HeroCreator {
    //metody stworzeniowe, metody factory
    public static AbstractHero createVillain(){
        return new Villain("Marianek", new HeroStatistics(50,50,50), TeamType.RED);
    }

    public static AbstractHero createSzeregowyWillain (String name){
        return new Villain(name, new HeroStatistics(50,50,50), TeamType.RED);
    }

    public static AbstractHero createSuperHero (String name) {
        return new SuperHero(name, new HeroStatistics(50, 40, 600), TeamType.BLUE);

    }
}