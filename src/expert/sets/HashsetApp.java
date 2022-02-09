package expert.sets;


import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class HashsetApp {

    public static void main(String[] args) {

        Set<String >  carBrands = new HashSet<>();
        carBrands.add("Toyota");
        carBrands.add("Kia");
        carBrands.add("Nissan");
        carBrands.add("Ford");
        carBrands.remove("Ford");
//        carModels.clear();
        System.out.println(carBrands);
        System.out.println("Kia is in the set : "+carBrands.contains("Kia"));
        System.out.println("The size of the set : "+carBrands.size());
        System.out.println();
        System.out.println("Car models: ");
        System.out.println();

        System.out.println("We have the following car brands");

        for (String carBrand : carBrands){
            System.out.println("-"+ carBrand.toUpperCase());

        }

    }
}
