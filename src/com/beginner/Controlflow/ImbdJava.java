package com.beginner.Controlflow;

public class ImbdJava {
    public static void main(String[] args) {

      String actorName = "Leonardo DiCaprio";

      int yearBorn = 1974 ;
      int age = 2022 - yearBorn ;

      String[] movieTitles ={
              "Akira " , "Captain Planet ", "The Corporation ",
             "Roosevelt ", "Atari ", "The Black Hand ", "The Devil in the White City "
      };


        float[] movieRatings = {
                9.7F, 8.6F, 7.9F,
                7.5F, 6.9F, 5.4F, 4.1F
        };


        System.out.println("Actor's name: " + actorName);
        System.out.println("Born: " + yearBorn + " (" + age + " years old)");
        System.out.println();
        System.out.println("Movies:");
        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i]+" - " +getRating(movieRatings[i]));

        }}


        static String getRating (float rating) {

            if (rating <= 5.0){
                return "bad";
            } else if (rating > 5.0 && rating <= 6.5){
                return "average";
            } else if (rating > 6.5 && rating <= 7.0){
                return "good";
            } else if (rating > 7.0 && rating <= 8.0){
                return "very good";
            }else{
                return "amazing";
            }
        }


        }







