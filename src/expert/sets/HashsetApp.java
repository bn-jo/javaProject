package expert.sets;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class HashsetApp {
    public static void main(String[] args) {

        Set<String >  carModels = new HashSet<>();
        carModels.add("Toyota");
        carModels.add("Kia");
        carModels.add("Nissan");
        carModels.add("Ford");
        carModels.remove("Ford");
        System.out.println(carModels);
        System.out.println("Kia is in the set : "+carModels.contains("Kia"));
        System.out.println("The size of the set : "+carModels.size());
        System.out.println();
        System.out.println("Car models: ");
        System.out.println();
        for (String carModel: carModels){
            System.out.println("-"+ carModel.toUpperCase());

        }

    }
}
