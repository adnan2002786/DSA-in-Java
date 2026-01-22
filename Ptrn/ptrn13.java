
import java.util.Scanner;

public class ptrn13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entter the number of rows ");
        int x = sc.nextInt();
        print13(x);
        sc.close();
        
    }
    public static void print13(int n){
        int space =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("* ");
                
            }
            space++;
            System.out.println();
        }
    }
    
}
