import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String result;
        int input = scanner.nextInt();
        if (input > 0) {
            result = "YES";
        } else {
            result = "NO";
        }
        System.out.println(result);
    }
}