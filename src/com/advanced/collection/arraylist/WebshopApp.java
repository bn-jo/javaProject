package com.advanced.collection.arraylist;

import java.util.ArrayList;

public class WebshopApp {
    public static void main(String[] args) {

        ArrayList<Product>   products = new ArrayList<>();

        products.add(new Product("Spinner",3.1,"Funny spinner"));
        products.add(new Product("Earbud",37.91,"Great sound + bluetooth"));

        products.add(1,new Product("36 AAA batteries",10.00,"High quality batteries"));
//        products.remove(2);

        products.set(0,new Product("Rubber duck",5.99,"You can`t have bath without this."));

       // System.out.println(products);


        for (Product product : products){

            System.out.println(product);
        }
        System.out.println("the third element in the list: ");
        System.out.println(products.get(2));


        System.out.println(products.size()+"  products can be found in the list");
    }
}
