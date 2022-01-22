package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        final int  water;
        final int milk;
        final int beans;
        final int money;
        final int cups;

        final int  initialWater = 400;
        final int initialMilk = 540;
        final int initialBeans = 120;
        final int initialMoney = 550;
        final int initialCups = 9;
        System.out.println("The coffee machine has:\n" + initialWater + "ml of water\n" + initialMilk + "ml of milk\n" + initialBeans + " g of coffee beans\n" + initialCups + " disposable cups\n" + initialMoney + " of money");
//        System.out.println("What would you like to do?\nInput \"buy\" \"fill\" or \"take\".");
        System.out.println();
        System.out.println("Write action (buy, fill, take):\n");
        String action = scanner.nextLine();
        switch (action) {
            case "buy":
                System.out.println("Choose a variety. \"1 - espresso\" \"2 - latte\" or \"3 - cappuccino\". ");
//                String variety = scanner.nextLine();
                int variety = scanner.nextInt();

                switch (variety) {
                    case 1:
                        water = initialWater - 250;
                        beans = initialBeans - 16;
                        money = initialMoney - 4;
                        cups = initialCups - 1;
                        System.out.println("The coffee machine has: \n" + water + " ml of water,\n"  + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money +" of money");
                        break;
                    case 2:
                        water = initialWater - 350;
                        milk = initialMilk - 75;
                        beans = initialBeans - 20;
                        money = initialMoney - 7;
                        cups = initialCups - 1;
                        System.out.println("The coffee machine has: \n" + water + " ml of water\n" + milk + " ml of milk \n"  + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money +" of money");
                        break;
                    case 3:
                        water = initialWater - 200;
                        milk = initialMilk - 100;
                        beans = initialBeans - 12;
                        money = initialMoney - 6;
                        cups = initialCups - 1;
                        System.out.println("The coffee machine has: \n" + water + "ml of water\n" + milk + "ml of milk \n"  + beans + " g of coffee beans \n" + cups + " disposable cups \n" + money +" of money");
                        break;
                    default:
                        System.out.println("Not available at the moment");
                        break;
                }

                break;
            case "fill":
                System.out.println("Enter the amount of water, milk, coffee and disposable cups you want to add: \n");
                int numberInput = scanner.nextInt();
//        One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
                water = 200;
                milk = 50;
                beans = 15;

                int waterNeeded = numberInput * water;
                int milkNeeded = numberInput * milk;
                int beansNeeded = numberInput * beans;

                System.out.println("To make " + numberInput + " cups of coffee, you need \n" +
                        waterNeeded + " ml of water \n" + milkNeeded + " ml of milk, and \n" +
                        beansNeeded + " g of coffee beans.");
                break;
            case "take":
                System.out.println();
                break;
        }



//        System.out.println("Starting to make a coffee\n" + "Grinding coffee beans\n" + "Boiling water\n" + "Mixing boiled water with crushed coffee beans\n" + "Pouring coffee into the cup\n" +"Pouring some milk into the cup\n" + "Coffee is ready!");
    
    }
}

