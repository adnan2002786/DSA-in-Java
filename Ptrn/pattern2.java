
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of  rows");
        int m = sc.nextInt();
        print(m);
        sc.close();
    }
    public static void print(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i%2+" ");
                
                
            }
            System.out.println();

        }
        
    }
    
}
