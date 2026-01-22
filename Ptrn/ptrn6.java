
import java.util.Scanner;

public class ptrn6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a = in.nextInt();
        for(int i=1; i<=a; i++ ){
            for(int j=1; j<=a; j++){
                if(i==1 || i==a-1 ||i==a || i==2|| j==1 || j==a || j==2 || j==a-1){
                    System.out.print("* ");
                }
                else{
                    System.err.print("  ");
                }
            }
            System.out.println();
        }

        in.close();
    }
    
}
