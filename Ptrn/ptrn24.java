
import java.util.Scanner;

public class ptrn24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "yes";
        do { 
            System.out.println("Ente the number of Rows");
            int n = sc.nextInt();
            print24(n);
            System.out.println("Enter yes for continue and No for Exit");
            choice = sc.next();


        } while (choice.equals("yes"));
         sc.close();
    }
    
    public static void print24(int n) {
        int num = n*(n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+"\t");
                num--;
            }
            System.out.println();
        }
        
    }
}
