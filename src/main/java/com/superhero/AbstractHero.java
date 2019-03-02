package com.superhero;




import lombok.Data;


@Data

public abstract class AbstractHero {

    private String name;
    private HeroStatistics heroStatistics;
    private TeamType teamType;

    public AbstractHero(String name, HeroStatistics heroStatistics, TeamType teamType) {
        this.name = name;
        this.heroStatistics = heroStatistics;
        this.teamType = teamType;

        updateStats();
    }


    private void updateStats (){



        switch (teamType){
            case RED:
                heroStatistics.increaseHealth(50);
                break;
            case BLUE:
                heroStatistics.increaseAttack(50);
                break;
            case GREEN:
                heroStatistics.increaseDefense(50);

        }

    }

    public abstract int getPower();
}

