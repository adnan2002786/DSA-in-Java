
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        login();
    }
    public static void login() {
        Scanner sc = new Scanner(System.in);
        String password ="Adnan";
        int Maxattempt=3;
        int i;
        System.out.println("Welcome to the secure login");
        for(i=1; i<=Maxattempt; i++){
            System.out.println("Enter the password ");
            String Enterpassword= sc.next();
            if(password.equals(Enterpassword)){
                System.out.println("Loging Scuessfull");
                break;
            }else{
                if(i<Maxattempt){
                    System.out.println("Try again");

                }
            }
        }
        if(i>Maxattempt){
            System.out.println("Account is locked");
        }   
        sc.close();
        
    }
}

// Create a login simulation where the user has
// maximum 3 attempts to enter the correct password. If
// the password is correct, print Login Successful. If all 3
// attempts are used and the password is incorrect, print
// Account Locked.