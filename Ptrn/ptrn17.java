
import java.util.Scanner;

public class ptrn17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of the rows");
         int y = sc.nextInt();
         print17(y);
         sc.close();

        
    }
    public static void print17(int n){
        int patternWidth = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=patternWidth; j++){
                System.out.print(i+" ");
            }
            patternWidth++;
            System.out.println();

        }
    }
    
}
