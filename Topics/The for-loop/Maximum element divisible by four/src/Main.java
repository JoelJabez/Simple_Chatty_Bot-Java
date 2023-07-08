import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int range = scanner.nextInt();
        if (range < 1000) {
            int max = 0, number;
            for (int i = 0; i < range; i++) {
                number = scanner.nextInt();

                if (number % 4 == 0 && number > max) {
                    max = number;
                }
            }

            System.out.println(max);
        }
    }
}