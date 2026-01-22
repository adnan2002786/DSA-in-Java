
import java.util.Scanner;

public class ptrn14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = sc.nextInt();
        print14(rows);
        sc.close();

    }
    public static void print14(int n){
        int space =n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("* ");
            }
            space--;
            System.out.println();

        }
    }
}
