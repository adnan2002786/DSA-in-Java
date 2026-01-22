
import java.util.Scanner;

public class ptrn9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int m =sc.nextInt();
        if(m%2==0){
            System.out.println("Pattern is not possible");
        }
        int mid =m/2+1;
        for(int i =1; i<=m; i++){
            for(int j=1; j<=m; j++){
                if(i==mid || j==mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    
}
