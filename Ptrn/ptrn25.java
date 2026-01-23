
import java.util.Scanner;

public class ptrn25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int  a = sc.nextInt();
        print25(a);
        sc.close();

        
    }
    public static void print25(int n) {
        for(int i=1; i<=n; i++){
            int num = i*(i+1)/2;
            for(int j=1; j<=i; j++){
                System.out.print(num+"\t");
                num--;
            }
            System.out.println();
        }
        
    }
}
