
import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number of row");
        int y = sc.nextInt();
        print4(y);
        
    }

    public static void print4(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j%2+" ");   
            }
            System.out.println();

        }
    }

}

