
import java.util.Scanner;

public class ptrn15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter the nuber of row ");
        int a = sc.nextInt();
        Print15(a);
        sc.close();
        
    }
    public static void Print15(int n) {
        int space =n-1; 
        int width = 1;
        for(int i =1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=width; j++){
                System.out.print("* ");
            }
            space--;
            width++;

              System.out.println();
        }
      
        
    }
}
