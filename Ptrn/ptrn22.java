
import java.util.Scanner;

public class ptrn22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int m= sc.nextInt();
        print22(m);
        sc.close();
    }
    public static void print22(int n) {
        for(int i=1; i<=n; i++){
            for(int j =i; j>=1; j--){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        
        
    }
    
}
