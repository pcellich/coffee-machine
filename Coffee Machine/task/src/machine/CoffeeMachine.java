package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cups of coffee you want to make: \n");
        int numberInput = scanner.nextInt();
//        One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
        final int water = 200;
        final int milk = 50;
        final int beans = 15;

        int waterNeeded = numberInput * water;
        int milkNeeded = numberInput * milk;
        int beansNeeded = numberInput * beans;

        System.out.println("To make " + numberInput + " cups of coffee, you need \n" +
                waterNeeded + " ml of water \n" + milkNeeded + " ml of milk, and \n" +
                beansNeeded + " g of coffee beans.");

//        System.out.println("Starting to make a coffee\n" + "Grinding coffee beans\n" + "Boiling water\n" + "Mixing boiled water with crushed coffee beans\n" + "Pouring coffee into the cup\n" +"Pouring some milk into the cup\n" + "Coffee is ready!");
    
    }
}

