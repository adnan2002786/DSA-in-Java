
import java.util.Scanner;

public class ptrn19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int m = sc.nextInt();
        print19(m);
        sc.close();

        
    }
    public static void print19(int n){
        int patternWidth =1;
        for(int i =1; i<=n; i++){
            for(int j=1; j<patternWidth; j++){
                System.out.print(j+" ");
            }
            patternWidth++;
            System.out.println();

        }
    }
    
}
