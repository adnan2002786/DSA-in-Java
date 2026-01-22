import java.math.BigInteger;
import java.util.Scanner;

public class Question {

    public static void main(String[] args) {
        getFact();   // only function call
    }

    public static void getFact() {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            BigInteger fact = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            System.out.println("Factorial = " + fact);

            System.out.print("Press y and n continue, other to exit: ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'n');

        sc.close();
    }
}
