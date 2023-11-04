package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Product coffee = new Product("coffee", 150, 300);
        System.out.println(coffee.toString());
        Product coffee1 = new HotDrinks("coffee", 150, 300, 90);
        System.out.println(coffee1.toString());
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Tea", 100, 400, 70),
                new HotDrinks("Coffee", 150, 300, 90),
                new HotDrinks("Milk", 125, 200, 45)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск кофе объёмом 300 мл с температурой 90: " + 
                            vmHotDrinks.getProduct("Coffee", 300, 90));
    }
}
