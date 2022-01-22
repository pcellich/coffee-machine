import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        if (input >= 1000) {
            System.out.println("legion");
        } else if (input >= 250) {
            System.out.println("zounds");
        } else if (input >= 20) {
            System.out.println("throng");
        } else if (input >= 1) {
            System.out.println("pack");
        } else {
            System.out.println("no army");
        }
    }
}