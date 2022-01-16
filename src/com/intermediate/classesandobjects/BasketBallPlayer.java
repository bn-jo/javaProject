package com.intermediate.classesandobjects;

import java.util.Random;

public class BasketBallPlayer {


    private String name;
    private String nikename;
    private int yearOfBorn;
    private String team;



    private double freeTrowPercentage;
    private double pointsPerGame ;
    private int gamesPlayed;

    public BasketBallPlayer(String name, String nikename, int yearOfBorn, String team, double freeTrowPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nikename = nikename;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.freeTrowPercentage = freeTrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void  freeThrow(){

        Random randomNumberGenerator = new Random();
        if ((randomNumberGenerator.nextDouble()* 100 )> freeTrowPercentage) {
            System.out.println(name + " faild to score free throw. ");
        } else {
            System.out.println(name+" score free throw .");

        }

    }
}
