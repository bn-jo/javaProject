package expert.treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExtraFunctionApp {


    public static void main(String[] args) {

        TreeMap<String, Double> productPricesTreeMap= new TreeMap<>();
        productPricesTreeMap.put("Chocolate bar", 1.5) ;
        productPricesTreeMap.put("Apple",0.15) ;
        productPricesTreeMap.put("Pasta", 1.1) ;
        productPricesTreeMap.put("Avocado", 1.2) ;
        productPricesTreeMap.put("Orange", 0.2) ;
        productPricesTreeMap.put("Coffee", 2.2) ;
        productPricesTreeMap.put("Tea box", 1.4) ;

        System.out.println("The first product in the map: " + productPricesTreeMap.firstKey());
        System.out.println("TreeMap : ");
        for (String product : productPricesTreeMap.descendingKeySet()) {

            System.out.println(product + " $ " + productPricesTreeMap.get(product));
        }
            System.out.println();
            System.out.println("DescendingMap : ");
        NavigableMap<String , Double> productPriceDescendingMap = productPricesTreeMap.descendingMap();
        for (String product : productPriceDescendingMap.keySet() ){
            System.out.println(product + " $ " +productPriceDescendingMap .get(product));
        }
        System.out.println();
        System.out.println("Lower key : "+productPricesTreeMap.lowerKey("Shower gel"));
        System.out.println("Floor key : "+productPricesTreeMap.floorKey("Coffee"));
        System.out.println("Higher key : "+productPricesTreeMap.higherKey("Coffee"));
        System.out.println("Ceiling key : "+productPricesTreeMap.ceilingKey("Coffee"));
        System.out.println();
        System.out.println("Poll first entry:"+productPricesTreeMap.pollFirstEntry());
        System.out.println("the first entry: "+ productPricesTreeMap.firstEntry());
        System.out.println("the last entry: "+ productPricesTreeMap.lastEntry());
        System.out.println("Lower entry: "+productPricesTreeMap.lowerEntry("Pasta"));
        System.out.println("Floor entry: "+productPricesTreeMap.floorKey("Pasta"));
        System.out.println("Higher entry: "+productPricesTreeMap.higherEntry("Pasta"));
        System.out.println("Ceiling entry: "+productPricesTreeMap.ceilingKey("Pasta"));
        System.out.println();
        System.out.println("Tail map: "+productPricesTreeMap.tailMap("Orange",true));
        System.out.println("Head map: "+productPricesTreeMap.headMap("Orange",true));
        System.out.println("Sub map: "+productPricesTreeMap.subMap("Orange",true,"Tea box",true));
    }
}
