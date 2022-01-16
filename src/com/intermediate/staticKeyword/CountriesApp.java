package com.intermediate.staticKeyword;

import com.intermediate.finalKeyword.Brazil;

import java.util.concurrent.Callable;

public class CountriesApp {
    public static void main(String[] args) {


        Country brazil = new Country("Brazil",210000000,"Brasilia");


        System.out.println("Number of countries : "+brazil.getNumberOfcountries());

        Country germany = new Country("Germany",83000000,"Berlin");
brazil.getDetails();
germany.getDetails();
        System.out.println("Number of countries : "+Country.getNumberOfcountries());

        Country japan = new Country("Japan",12500000,"Tokyo");
japan.getDetails();
        System.out.println("Number of countries : "+japan.getNumberOfcountries());



    }
}
