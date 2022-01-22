package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void printStatus (int water, int milk, int beans, int cups, int money ) {
        System.out.println("The coffee machine has: \n" + water + " ml of water,\n" + milk + " ml of milk\n" + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money + " of money");
        System.out.println();
    }
    public static void main(String[] args) {
        // System.out.println("Hello World!");
//        final int initialWater = 400;
//        final int initialMilk = 540;
//        final int initialBeans = 120;
//        final int money = 550;
//        final int cups = 9;
        int water = 400;
        int milk = 540;
        int beans = 120;
        int money = 550;
        int cups = 9;

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):\n");
            String action = scanner.next();

//            final int water;
//            final int milk;
//            final int beans;
//            final int money;
//            final int cups;

            switch (action) {
                case "exit":
                    exit = true;
                    break;

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n");
                    String variety = scanner.next();

                    switch (variety) {
                        case "1":
                            if (water >= 250 && beans >= 16 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water = water - 250;
                                beans = beans - 16;
                                money = money + 4;
                                cups = cups - 1;
                            } else {
                                System.out.println("I can't make you a coffee!");
                            }
//                            System.out.println("The coffee machine has: \n" + water + " ml of water,\n" + milk + " ml of milk\n" + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money + " of money");
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water = water - 350;
//                                System.out.println(water);
                                milk = milk - 75;
                                beans = beans - 20;
                                money = money + 7;
                                cups = cups - 1;
                            } else {
                                System.out.println("I can't make you a coffee!");
                            }
//                            System.out.println("The coffee machine has: \n" + water + " ml of water\n" + milk + " ml of milk \n" + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money + " of money");
                            break;
                        case "3":
                            if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water = water - 200;
                                milk = milk - 100;
                                beans = beans - 12;
                                money = money + 6;
                                cups = cups - 1;
//                                System.out.println("The coffee machine has: \n" + water + " ml of water\n" + milk + " ml of milk \n" + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money + " of money");
                            } else {
                                System.out.println("I can't make you a coffee!");
                            }
                            break;

                        default:
                            System.out.println("Please enter the correct option 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu\n");
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
                    water = water + addWater;
                    milk = milk + addMilk;
                    beans = beans + addBeans;
                    cups = cups + addCups;

//                    System.out.println("The coffee machine has: \n" + water + " ml of water\n" + milk + " ml of milk \n" + beans + " g of coffee beans \n" + cups + " disposable cups \n$" + money + " of money");
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    System.out.println();
                    money = 0;
//                    System.out.println("The coffee machine has: \n" + water + " ml of water\n" + milk + " ml of milk \n" + beans + " g of coffee beans \n" + cups + " disposable cups \n" + "$0 of money");
                    break;
                case "remaining":
                    printStatus(water, milk, beans,cups, money);
//                    System.out.println("The coffee machine has:\n" + water + " ml of water\n" + milk + " ml of milk\n" + beans + " g of coffee beans\n" + cups + " disposable cups\n$" + money + " of money");
                    System.out.println();
                    break;

                case "default":
                    System.out.println("Please enter the correct option 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu\n");
                    break;
            }
            } while (!exit);

    }
}

