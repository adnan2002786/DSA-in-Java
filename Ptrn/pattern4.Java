import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int z = sc.nextInt();
        print3(z);


        
    }
    public static void print3(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j+" ");   
            }
            System.out.println();

        }
        
    }
}
