
import java.util.Scanner;

public class ptrn10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of  Rows");
        int row = sc.nextInt();
        printP(row);
        sc.close();
    }
    public static void printP(int n){
        if(n%2==0){
            System.out.println("Pattern is not possible");
            return;
        }
        int mid= n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n ||i==mid || j==mid || i==j || i+j==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    
}
