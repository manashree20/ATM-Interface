import java.util.*;
public class ATM_Interface {
    public static void main(String[] args) {
        int balance =0;
        System.out.println("Balance : " +balance);
        System.out.println("ATM MACHINE");
        try (Scanner sc = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for Exit");
                System.out.print("Choose the Operation:");
                int ch=sc.nextInt();
                System.out.println(ch);
                switch (ch)
                {
                    case 1: System.out.println("You have chosen to withdraw ----");
                            System.out.println("Enter the amount to withdraw:");
                            int withdraw=sc.nextInt();

                           if(withdraw >= balance) 
                           {
                            System.out.println("you have not sufficient balance.\nYour balance is:"+ balance+"Rupees");
                           } 
                           else 
                           {
                            balance=balance-withdraw;
                            System.out.println("Your Withdrawal was successful");
                           }
                            break;

                    case 2: System.out.println("You have chosen to Deposit----");
                            System.out.println("Enter the Amount to be Deposit : ");
                            int deposit=sc.nextInt();
                            balance=balance+deposit;
                            System.out.println("Your Money has been successfully Deposited");
                            break;

                    case 3: System.out.println("You have chosen to Check Balance--");
                            System.out.println("Your current Account Balance is:" +balance+" Rupees.");
                            break;

                    case 4:
                            return ;    // exit 
                    default :
                            System.out.println("Invalid choice...Try Again"); //  for invalid input
                }  
            }
        }
    }
}