package com.intermediate.classesandobjects;

public class BasketBallApp {
    public static void main(String[] args) {
// Player 1:
        BasketBallPlayer kobe = new BasketBallPlayer("Kobi Bryent","Black mamba",
                1978,"Lakers",83.7,25.0,1346);

        //Player 2
        BasketBallPlayer jorden = new BasketBallPlayer("Michel Jorden","MJ",
                1963,"Chicago Bulls",83.5,30.1,1072);


        //Player 3
        BasketBallPlayer majic = new BasketBallPlayer("Earvin Jonson","Magic",
                1959,"Lakers",84.8,19.5,906);


BasketBallPlayer[] basketBallPlayers = new BasketBallPlayer[3];
basketBallPlayers[0] = kobe;
basketBallPlayers[1] = jorden;
basketBallPlayers[2] = majic;
for (BasketBallPlayer basketBallPlayer : basketBallPlayers){

    basketBallPlayer.freeThrow();

}






    }
}
