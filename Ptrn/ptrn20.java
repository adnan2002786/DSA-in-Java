
import java.util.Scanner;

public class ptrn20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrr the number of rows ");
        int w = sc.nextInt();
        print20(w);
        sc.close();

        
    }
    public static void print20(int n) {
        int patternWidth =1;
        for(int i =1; i<=n; i++){
            for(int j=1; j<patternWidth; j++){
                System.out.print(j%2+" ");
            }
            patternWidth++;
            System.out.println();

        }
    }
}
