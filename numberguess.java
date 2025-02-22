import java.util.Random;
import java.util.Scanner;


public class numberguess {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        int lownumber=0;
        int uppernumber=100;
        int numbertoguess=random.nextInt(uppernumber -lownumber+1)+lownumber;
        int userguess;
        int attempts=0;

        System.out.println("Welcome to number guess game");
        System.out.println("number is between "+lownumber+"to"+uppernumber);

        while (true) { 
            System.out.println("enter number :");
            userguess=scanner.nextInt();
            attempts++;

            if(userguess < numbertoguess)
            {
                System.out.println("Too low ! number");
            }
            else if(userguess > numbertoguess)
            {
                System.out.println("Too high ! number");
            }
            else{
                System.out.println("congratulation ! guess Number in "+attempts);
                break;
            }
        }
        scanner.close();
    }
}
