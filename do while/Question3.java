// WAJP to check a number is a prime number or
// not and ask user in end to press Y/y to continue
// or any other key to exit.



import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        isPrime();
        
    }
    public static void  isPrime(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        char choose;
       
        
        do { 
            int n = sc.nextInt();
             int count = 0;
            for (int i = 1; i <= n; i++) {
                if(n%i==0){
                    count++;
                }
                
            }
            
            if(count==2){
                System.out.println("it is a prime number ");
            }else{
                System.out.println("it is not prime ");
            }
            System.out.print("Enter y or z to continue or other key to exist ");
            choose=sc.next().charAt(0);
            
        } while (choose =='y'|| choose == 'z');
        sc.close();

    }
}
