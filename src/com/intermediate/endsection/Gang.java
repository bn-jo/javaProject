package com.intermediate.endsection;


import java.util.Random;


public class Gang {

    private Criminal[] criminals = new Criminal[2];
    public Random randomNumberGenerator = new Random();
    private double sumRobbedValue;

    Gang(){

    Item[] robItems = new Item[2];
    robItems[0]=new Item("Blunt swiss knife",10.5);
    robItems[1]=new Item("Half rotten apple",0.0);
    Criminal rob = new Criminal("Rob","The Head",1976,"Breaking in",robItems);
    criminals[0]=rob;
    Item[] bobbyItems = new Item[2];
    bobbyItems[0]=new Item("Hat",20.5);
    bobbyItems[1]=new Item("Toothbrush",0.2);
    Criminal bobby = new Criminal("Bobby","The Mountain",1978,"Knocking Out",bobbyItems);
    criminals[1]=bobby;

}

    public double getSumRobbedValue() {

        return sumRobbedValue;
    }

    public void printGangInfo(){


        //        for (int i = 0; criminals.length >= i; i++ ){
        for(Criminal criminal : criminals) {
            System.out.println("_______________________");
            criminal.printBioData();

        }


    }



    private boolean isSuccessfulRobbery(){
    int randomNumber =randomNumberGenerator.nextInt(101);
    int summarizedSuccessChange = criminals.length * Criminal.SUCCESS_PERCENTAGE;
    if (randomNumber >= summarizedSuccessChange) {
        return false;
    }
    return true;
    }

    public void letsRob(Building[] buildings) {
        int randomBuildingsIndex = randomNumberGenerator.nextInt(buildings.length + 1);
        System.out.println("-------------------------------");

        if (isSuccessfulRobbery()) {
            System.out.println("The gang rob the following items :"+buildings[randomBuildingsIndex].getName() +":");

            for (Item item : buildings[randomBuildingsIndex].getItems()) {
            sumRobbedValue += item.getValue();
            System.out.println("-" + item.getName());
        }

    }else{
            System.out.println("Not a good one.The gang tried to rob the"+ buildings[randomBuildingsIndex].getName() + "but failed.");
    }
    }
}
