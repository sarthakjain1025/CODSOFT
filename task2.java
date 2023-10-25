import java.util.*;
public class task2 {
    public static void main(String[] args) {
        int i,n;
        double marks,total;
        double sum=0;
        double percentage;
        System.out.print("Enter number of subjects: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter marks in subject " + (i+1) + ":");
            marks=sc.nextDouble();
            sum+=marks;
            if((marks>100) || (marks<0))
            {
                System.out.println("Invalid input");
            }
        }
        total=n*100;
        percentage=(sum/total)*100;
        System.out.println("Total marks: " + sum +"/" + total);
        System.out.println("Average Percentage: " + percentage);
        if(percentage>=90)
        {
            System.out.println("A grade!!");
        }
        else if((percentage>=80) &&(percentage<90))
        {
            System.out.println("B grade");
        }
        else if((percentage>=70) &&(percentage<80))
        {
            System.out.println("C grade");
        }
        else if((percentage>=60) &&(percentage<70))
        {
            System.out.println("D grade");
        }
        else if((percentage>=50) &&(percentage<60))
        {
            System.out.println("E grade");
        }
        else if(percentage<50)
        {
            System.out.println("Fail!!");
        }
    }
}
