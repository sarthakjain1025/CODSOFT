import java.util.*;
class task3 {
    public static void main(String[] args) {
        int withdraw, deposit;
        int balance = 50000;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("ATM MACHINE!!!!");
            System.out.println(""); 
            System.out.println("Press 11 to withdraw");
            System.out.println("Press 2 to Deposit");
            System.out.println("Press 3 to Check Account Balance");
            System.out.println("Press 4 to EXIT");
            int choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter withdrawl amount: ");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw)
                    {
                        balance=balance-withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Available Balance: "+ balance); 
                    }
                    else
                    {
                        System.out.println("Insufficient Balance ");
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to be deposited: "); 
                    deposit=sc.nextInt();
                    balance= balance+deposit;
                    System.out.println("Available Balance: " + balance); 
                    System.out.println("Money Deposited Successfully!!! "); 
                    break;
                case 3:
                        System.out.println("Account Balance: " + balance);
                        break;
                        case 4:
                            System.exit(0);
            }
        }
    }
}
