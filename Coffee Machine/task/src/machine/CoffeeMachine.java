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
        System.out.println("The coffee machine has:\n" + initialWater + " ml of water\n" + initialMilk + " ml of milk\n" + initialBeans + " g of coffee beans\n" + initialCups + " disposable cups\n$" + initialMoney + " of money");
//        System.out.println("What would you like to do?\nInput \"buy\" \"fill\" or \"take\".");
        System.out.println();
        System.out.println("Write action (buy, fill, take):\n");
        String action = scanner.nextLine();
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:\n");
//                String variety = scanner.nextLine();
                int variety = scanner.nextInt();

                switch (variety) {
                    case 1:
                        water = initialWater - 250;
                        beans = initialBeans - 16;
                        money = initialMoney + 4;
                        cups = initialCups - 1;
                        System.out.println("The coffee machine has: \n" + water + " ml of water,\n" + initialMilk + " ml of milk\n" + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money +" of money");
                        break;
                    case 2:
                        water = initialWater - 350;
                        milk = initialMilk - 75;
                        beans = initialBeans - 20;
                        money = initialMoney + 7;
                        cups = initialCups - 1;
                        System.out.println("The coffee machine has: \n" + water + " ml of water\n" + milk + " ml of milk \n"  + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money +" of money");
                        break;
                    case 3:
                        water = initialWater - 200;
                        milk = initialMilk - 100;
                        beans = initialBeans - 12;
                        money = initialMoney + 6;
                        cups = initialCups - 1;
                        System.out.println("The coffee machine has: \n" + water + " ml of water\n" + milk + " ml of milk \n"  + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money +" of money");
                        break;
                    default:
                        System.out.println("Not available at the moment");
                        break;
                }

                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add:\n");
                int addWater = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int addMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int addCups = scanner.nextInt();
                water = initialWater + addWater;
                milk = initialMilk + addMilk;
                beans = initialBeans + addBeans;
                cups = initialCups + addCups;

                System.out.println("The coffee machine has: \n" + water + " ml of water\n" + milk + " ml of milk \n"  + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + initialMoney +" of money");
                break;
            case "take":
                System.out.println("I gave you $" + initialMoney);
                System.out.println();
                System.out.println("The coffee machine has: \n" + initialWater + " ml of water\n" + initialMilk + " ml of milk \n"  + initialBeans + " g of coffee beans \n" + initialCups + " disposable cups \n" + "$0 of money");
                break;
        }



//        System.out.println("Starting to make a coffee\n" + "Grinding coffee beans\n" + "Boiling water\n" + "Mixing boiled water with crushed coffee beans\n" + "Pouring coffee into the cup\n" +"Pouring some milk into the cup\n" + "Coffee is ready!");
    
    }
}

