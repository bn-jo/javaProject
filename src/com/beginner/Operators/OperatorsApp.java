package com.beginner.Operators;

public class OperatorsApp {
    public static void main(String[] args) {
        String carModel =" Doge Chalenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamadeg =true ;
        System.out.println("price of a "+carModel+": $ " +price);

        int increasedPrice = price + 1000;

        System.out.println("price increased of a " +price +"$ : " +increasedPrice+ " $ " );


        int decreasedPrice = price - 1000;

        System.out.println("price decreased of a " + price + " $ : " + decreasedPrice + " $ " );


        int twoCarsPrice = price * 2;

        System.out.println("Price for Two "+carModel + " cars : "+twoCarsPrice+" $ ");


        int dodgesYouCanBuy = moneyInTheBank / price ;

        System.out.println("From the money we have in the bank we can buy  "+dodgesYouCanBuy+" " +carModel);

        int moneyRemaining = moneyInTheBank % price;

        System.out.println("Money we would reamin after buiny "+dodgesYouCanBuy+ carModel + ": $ " +moneyRemaining);
        System.out.println();

        int priceNegative = -14999;
        int priceNagativeWithPlusSign = +priceNegative;
        System.out.println("Nagative Price with plus sign :$"+priceNagativeWithPlusSign);
        int priceNagativeWithMinusSign = -priceNegative;
        System.out.println("Nagative Price with minus sign :$"+priceNagativeWithMinusSign);
        int priceOneEuroPriceIncrease = ++price;
        System.out.println("Price after 1 dollar price increse :$"+priceOneEuroPriceIncrease);
        int priceOneEuroPriceDecrease = --price;
        System.out.println("Price after 1 dollar price decrese :$"+priceOneEuroPriceDecrease);
        System.out.println("This car is damadged : "+!isDamadeg);
        System.out.println();


        System.out.println("Cars price equal the money in the bank: "+(price==moneyInTheBank));
        System.out.println("Cars price doesnot equal the money in the bank: "+(price!=moneyInTheBank));
        System.out.println("Cars price greater than the  money in the bank or equal: "+(price >= moneyInTheBank));
        System.out.println("Cars price less than the  money in the bank or equal: "+(price <= moneyInTheBank));
        System.out.println("The car model variable atatype is a string " +(carModel instanceof String));
        System.out.println();



        String damagedText = isDamadeg ? "The car is damaged " : "The car isnt damaged ";
        System.out.println(damagedText);
        System.out.println();



        String wothSeeingText = isDamadeg || price <= 2000 ? "its worth seeing the car " : "its isnt worth seeing the car ";
        System.out.println(wothSeeingText);
        System.out.println();


        String worthReperingTheCar = isDamadeg && price <= 10000 ? "its worth repier the car " : "its isnt worth repier the car ";
        System.out.println(worthReperingTheCar);
        System.out.println();


        price += 1000;
        System.out.println("Price incresed : $" + price);
        price -= 2000;
        System.out.println("Price decresed : $" + price);
        price *= 2;
        System.out.println("Price multiplaid : $" + price);
        price /= 2;
        System.out.println("Price divided : $" + price);
        price %= 10000;
        System.out.println("Money remained in the bank after buying " + dodgesYouCanBuy + carModel + " : $" + price);


    }



}
