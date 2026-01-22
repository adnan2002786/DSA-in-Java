
import java.util.Scanner;

public class ptrn16 {
    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int z = sc.nextInt();
        print16(z);
        sc.close();


    }public static void print16(int n){
        int space = 0;
        int patternWidth = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=patternWidth; j++){
                System.out.print("* ");
            }
            space++;
            patternWidth--;
            System.out.println();
        }


    }
    
}
