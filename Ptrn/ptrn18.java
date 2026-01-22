
import java.util.Scanner;

public class ptrn18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a = sc.nextInt();
        Print18(a);
        sc.close();
    }
    public static void Print18(int n) {
        int patternWidth =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=patternWidth; j++){
                System.out.print(i%2+" ");
            }
            patternWidth++;
            System.out.println();

        }

        
    }
    
}
