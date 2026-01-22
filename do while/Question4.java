import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        userInput();
        
    }
    public static void userInput() {

        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n;
        do{
            System.out.println("Enter the nummber ");
            n = sc.nextInt();
            if(n>0){
                sum=sum+n;
            }

        }while(n>0);
        System.out.println(" sum of all the number "+sum);
        sc.close();
    }
}
// WAJP to keep taking input from the user until
// they enter a negative number. When –ve
// number or zero is entered then print sum of all
// the +ve number entered.