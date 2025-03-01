import java.util.Scanner;

public class studentgradecalc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numofsubjects=0;
        int totalmarks=0;

        System.out.println("Enter Numbers of Subject: ");
        numofsubjects=scanner.nextInt();

        System.out.println("Enter marks of subjects between 0 to 100");
        for(int i=1;i<=numofsubjects;i++)
        {
            System.out.println("Enter Marks of Subjet: "+i);
            int marks=scanner.nextInt();
            totalmarks+=marks;
        }

        double avgper=(double)totalmarks/numofsubjects;

        String grade;
        if(avgper>90)
        {
            grade="+A";
        }
        else if(avgper>80)
        {
            grade="A";
        }
        else if(avgper>70)
        {
            grade="B";
        }

        else if(avgper>60)
        {
            grade="C";
        }
        else if(avgper>50)
        {
            grade="D";
        }
        else{
            grade="Fail";
        }

        System.out.println("Total Marks: "+totalmarks);
        System.out.println("Percentage: "+avgper);
        System.out.println("Grade: "+grade);

        scanner.close();
    }    
}
