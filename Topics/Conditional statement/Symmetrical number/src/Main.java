import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        final int bound = 100;
        // start coding here
        int num = scanner.nextInt();
        String val = String.valueOf(num);
        StringBuilder sb = new StringBuilder(val);
        if (val.equals(sb.reverse().toString())) {
            System.out.println(1);
        } else {
            int randNum = rand.nextInt(bound);
            System.out.println(randNum);
        }


    }
}