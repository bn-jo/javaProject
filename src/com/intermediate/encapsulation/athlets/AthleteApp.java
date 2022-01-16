package com.intermediate.encapsulation.athlets;

public class AthleteApp {
    public static void main(String[] args) {

// Player 1:
        BasketBallPlayer kobe = new BasketBallPlayer("Kobi Bryent", "Black mamba",
                1978, "Lakers", 83.7, 25.0, 1346,556) ;


        //Player 2
        BasketBallPlayer jorden = new BasketBallPlayer("Michel Jorden", "MJ",
                1963, "Chicago Bulls", 83.5, 30.1, 1072,654);


        //Player 3
        BasketBallPlayer majic = new BasketBallPlayer("Earvin Jonson", "Magic",
                1959, "Lakers", 84.8, 19.5, 906,344 );


        BasketBallPlayer[] basketBallPlayers = new BasketBallPlayer[3];
        basketBallPlayers[0] = kobe;
        basketBallPlayers[1] = jorden;
        basketBallPlayers[2] = majic;

        for (BasketBallPlayer basketBallPlayer : basketBallPlayers) {





            System.out.println("_________________________________");

            basketBallPlayer.compete();
            System.out.println("_________________________________");
            basketBallPlayer.getBio();
            System.out.println(basketBallPlayer.getBodyType());
            basketBallPlayer.trowFrom3();
        }

        FootballPlayer tom = new FootballPlayer("Tom Brady","Tom Terrific",1977,"Tampa Bay",285,9988,637);

tom.increaseCompletions(35);
tom.increasePassingYards(17);

        FootballPlayer ed = new FootballPlayer("ed Brady","ed Terrific",1979,"New England Patrios",265,8988,604);
ed.setTeam("Tampa Bay");
        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = ed;

                for (FootballPlayer footballPlayer :  footballPlayers) {
                    System.out.println("__________________________________");
                    footballPlayer.getBio();
                    System.out.println(footballPlayer.getBodyType());
                }
Swimmer kantinka = new Swimmer("kantinka Hosszu","Iron Lady ", 1989, "Team Iron",54235,455);
        System.out.println("__________________________________");
        kantinka.getBio();
        kantinka.freeStyle(100);
        kantinka.freeStyle(200);
        System.out.println(kantinka.getBodyType());
    }}
