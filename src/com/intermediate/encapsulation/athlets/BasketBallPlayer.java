package com.intermediate.encapsulation.athlets;

import java.util.Random;

public class BasketBallPlayer extends Athlete implements BasketBallPlayers{




    private double freeTrowPercentage;
    private double pointsPerGame ;
    public int trowFrom3;


    public BasketBallPlayer(String name, String nikename, int yearOfBorn, String team, double freeTrowPercentage, double pointsPerGame, int gamesPlayed , int trowFrom3) {
super(name, nikename, yearOfBorn, team, gamesPlayed);
        this.freeTrowPercentage = freeTrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.trowFrom3 = trowFrom3;

    }

    public void  freeThrow(){

        Random randomNumberGenerator = new Random();
        if ((randomNumberGenerator.nextDouble()* 100 )> freeTrowPercentage) {
            System.out.println(super.getName() + " failed to score free throw. ");
        } else {
            System.out.println(super.getName() +" score free throw .");

        }

    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free throw percentage : " + freeTrowPercentage);
        System.out.println("Points per game : " + pointsPerGame);


    }

    @Override
    public void finaPoints() {

    }


    @Override
    public void compete() {
        super.compete();
        freeThrow();
    }

    @Override
    public String getBodyType() {
        return "Tall and lean muscle.";
    }

    public void setFreeTrowPercentage(double freeTrowPercentage) {
        this.freeTrowPercentage = freeTrowPercentage;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }


    @Override
    public void trowFrom3() {
       // this.trowFrom3 = trowFrom3;
        System.out.println("Trow from 3 : " + trowFrom3 );

    }

    @Override
    public void trowFrom3(int dis) {
        System.out.println("Trows from the 3 rage  : "+dis);

    }
}


