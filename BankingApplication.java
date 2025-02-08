import java.util.*;
public class BankingApplication{
    static int currentbal=0;
    public static void main(String[] args){
        int currentbal=0;
        Scanner in = new Scanner(System.in);
        int ch = 0;
        while (ch != 4) {
            System.out.println("\n");
          System.out.println("Welcome to the Bank of Java");
          System.out.println("1. Check Balance");
          System.out.println("2. Deposit");
          System.out.println("3. Withdraw");
          System.out.println("4. Exit");
          System.out.print("Enter an option: ");
          int option = in.nextInt();
    
          switch (option) {
            case 1:
              checkBalance();
              break;
            case 2:
              deposit();
              break;
            case 3:
              withdraw();
              break;
            case 4:
              ch=4;
              exit();
              break;
            default:
              System.out.println("Invalid option. Try again.");
              break;
          }
        }
        
    }
    public static void deposit(){
            System.out.println("Enter the deposit amount:");
            Scanner in = new Scanner(System.in);
            int amt=in.nextInt();
            currentbal=currentbal+amt;
            System.out.println("Balance:"+currentbal);
    }
    public static void withdraw(){
        System.out.println("Enter the withdraw amount:");
            Scanner in = new Scanner(System.in);
            int amt=in.nextInt();
            if (amt<currentbal){
                currentbal=currentbal-amt;
                System.out.println("Balance:"+currentbal);
            }
    }
    static void checkBalance() {
    System.out.println("Your current balance is $" + currentbal);
    }
    static void exit() {
    System.out.println("Thank you for banking with us. Have a great day!");
    }
}
