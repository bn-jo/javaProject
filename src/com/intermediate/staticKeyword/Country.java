package com.intermediate.staticKeyword;

public class Country {
    private static int numberOfcountries;
    private final String NAME;
    private int population;
    private String capital;
static {
    numberOfcountries = 5;
}static {
    numberOfcountries = 0;
}
    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
        numberOfcountries++;
    }
    public final void PopulationChange(int change){
        population+= change;
    }
    public void getDetails(){
        System.out.println("Country name: "+NAME+" population: "+population+" Capital "+capital);
    }

    public static int getNumberOfcountries() {
        return numberOfcountries;
    }
}
