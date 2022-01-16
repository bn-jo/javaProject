package com.intermediate.encapsulation.athlets;

public abstract class Athlete {


    private String name;
    private String nikename;
    private int yearOfBorn;
    private String team;
    private int numberOfcompatition;


    public Athlete(String name, String nikename, int yearOfBorn, String team, int numberOfcompatition) {
        this.name = name;
        this.nikename = nikename;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.numberOfcompatition = numberOfcompatition;

    }


    public String getName() {
        return name;
    }
    public void getBio(){
        System.out.println(name+" ("+nikename+")");
        System.out.println("Born in " + yearOfBorn);
        System.out.println("Last team is " + team + " and played " + numberOfcompatition +" games");
}

    public abstract void finaPoints();

    public void compete(){
    System.out.println(name+" took part in a competition . ");
    numberOfcompatition++;
}

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public abstract String getBodyType();


}
