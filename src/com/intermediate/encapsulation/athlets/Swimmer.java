package com.intermediate.encapsulation.athlets;

public class Swimmer extends Athlete implements Swimming{


    private int finaPoints;

    public Swimmer(String name, String nikename, int yearOfBorn, String team, int numberOfcompatition ,int finaPoints) {
        super(name, nikename, yearOfBorn, team, numberOfcompatition);
        this.finaPoints=finaPoints;


    }

    @Override
    public String getBodyType() {
        return "lean muscle , long torso and flexible ankles. ";

        }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("FINA points : "+finaPoints);
    }

    @Override
    public void freeStyle() {
        System.out.println("Swimming Free style very fast. ");
    }

    @Override
    public void freeStyle(int distance) {
        System.out.println("Swiming "+distance+ "m Freestyle very fast. ");
    }

    @Override
    public void finaPoints() {
        System.out.println(finaPoints);

    }

    @Override
    public void compete() {
        super.compete();
    freeStyle();
    }
}
