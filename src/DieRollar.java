import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int roll = 0;
            int d1, d2, d3;

            System.out.printf("%-8s%-8s%-8s%-8s%-8s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("------------------------------------------------");

            do {
                roll++;
                d1 = rand.nextInt(6) + 1;
                d2 = rand.nextInt(6) + 1;
                d3 = rand.nextInt(6) + 1;
                int sum = d1 + d2 + d3;

                System.out.printf("%-8d%-8d%-8d%-8d%-8d\n", roll, d1, d2, d3, sum);
            } while (!(d1 == d2 && d2 == d3));

            System.out.print("Roll again? (yes to continue): ");
            String input = in.next();
            if (!input.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        in.close();
    }
}
