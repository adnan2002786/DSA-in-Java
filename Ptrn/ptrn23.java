
import java.util.Scanner;

public class ptrn23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice ='y';
        do { 
            System.out.println("Enter the number of Rows ");
            int n = sc.nextInt();
            print23(n);
            System.out.println("Enter y to continue and other key to exit ");
            choice = sc.next().charAt(0);
            

        } while (choice =='y' ||  choice =='y');
        sc.close();
        
    }
    public static void print23(int n){
        int patternWide =1;
        int  k =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=patternWide; j++){
                System.out.print(k+" ");
                k++;
                
            }
            patternWide++;
            System.out.println();
        }
    }
}
