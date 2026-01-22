/*WAJP to print power of a and b and ask user in
end to press Y/y to continue or any other key to
exit.*/

import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        getPower();
    }
    public static void getPower() {
        Scanner sc = new Scanner(System.in);
        char choice;
        
        do {
            
            long power = 1; 

            System.out.println("Enter the number a:");
            int a = sc.nextInt(); // 2. Must use sc.nextInt()

            System.out.println("Enter the number b:");
            int b = sc.nextInt(); // 3. Must use sc.nextInt()

            // 4. Fixed loop variable (i=1 instead of 1=1)
            for (int i = 1; i <= b; i++) {
                power = power * a;
            }

            System.out.println("Power of the number: " + power);
            System.out.println("Press y to continue (any other key to exit):");
            choice = sc.next().charAt(0);

            
        } while (choice == 'y' || choice == 'Y'); 
        
        sc.close();
    }
}
    

