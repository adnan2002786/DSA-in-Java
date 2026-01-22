
import java.util.Scanner;

public class ptrn12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        print12(m);
        sc.close();

    }
    public static void print12(int n){
        if(n%2==0){
            System.out.println("Pattern is not possible");
            return;
        }
        int mid= n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
               if (j == 1 || j == n  || j==mid|| i == mid || 
                    (j == mid && i > mid) || (i == 1 && j == mid)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
