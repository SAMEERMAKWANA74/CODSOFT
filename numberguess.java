import java.util.Random;
import java.util.Scanner;

public class numberguess {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int lownumber=0;
        int uppernumber=100;
        int numbertoguess=random.nextInt(uppernumber - lownumber +1)+lownumber;
        int userguess;
        int attempts=0;


        System.out.println(": Welcome to Number guess game :");
        System.out.println("Enter number between "+lownumber+"to"+uppernumber);

        while (true) { 
            
            System.out.println("Enter number :");
            userguess=scanner.nextInt();
            attempts++;

            if(userguess < numbertoguess)
            {
                System.out.println("Too low number ! try Again");
            }
            else if(userguess > numbertoguess)
            {
                System.out.println("Too high number ! try Again");   
            }
            else{
                System.out.println("Congratulation ! Guess number in"+attempts+" attempts");
                break;
            }
        }
        scanner.close();
    }
}
