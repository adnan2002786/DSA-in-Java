
import java.util.Scanner;

public class ptrn21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number of rows");
        int q = sc.nextInt();
        print21(q);
        sc.close();
        
    }
    public static void print21(int n){
        int space = 1;
        

        for(int i=1; i<=n; i++){
            int num = n-i+1;

            for(int j=1; j<=space; j++){
                System.out.print(num+" ");
            }
            
            space++;
           
            System.out.println();
        }
    }
    
}
