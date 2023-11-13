import java.util.*;
public class ATMInterface {
    static Scanner sa = new Scanner(System.in);
    public static void main(String args[]){
        // make a object of bankaccount class with name useraccount
        BankAccount useraccount = new BankAccount();
        // make a object for atm class in which bankccount's object i.e. connect bankaccount class with atm class
        ATM user = new ATM(useraccount);
        user.start();
    }   
}
class ATM{
    //embedded the bankaccount class in atm class with access modifier of private type i.e. other classes cannot directly access with the same variable
    private BankAccount useracc;
    static Scanner sa = new Scanner(System.in);
    //constructor declaration to initialize the object of the atm class
    public ATM(BankAccount useraccount){
        // useraccount -> it is a object of bankaccount when atm object is created
        this.useracc = useraccount;
    }

    // choices function which gives many choices to the user
    public void choices(){
        System.out.println("WELCOME!!");
        System.out.println("You have many options with account");
        System.out.println("1. check balance");
        System.out.println("2. withdraw amount");
        System.out.println("3. deposit amount");
        System.out.println("4. Exit");
    }

    public void start(){
        while(true){
            choices();
            System.out.println("Please select the option (1/2/3/4): ");
            String choice = sa.next();

            switch (choice) {
                // here, case 1 is to check the balance calling via checkbalance() function in the bankaccount class using bank account class object i.e useracc 
                case "1":
                    useracc.checkbalance();
                    System.out.println("Press # to go to previous menu: ");
                    String hash = sa.next();
                    if(hash == "#"){
                        choices();
                    }
                    break;
                case "2":
                // here, case 2 is to Withdraw the amount calling via AmountWithdraw() function in the bankaccount class using bankaccount class object i.e useracc 
                    useracc.AmountWithdraw();
                    System.out.println("Press # to go to previous menu: ");
                    String hash2 = sa.next();
                    if(hash2 == "#"){
                        choices();
                    }
                    break;
                case "3":
                // here, case 3 is to Deposit the money calling via depositMoney() function in the bankaccount class using bank account class object i.e useracc 
                    useracc.depositMoney();
                    System.out.println("Press # to go to previous menu: ");
                    String hash3 = sa.next();
                    if(hash3 == "#"){
                        choices();
                    }
                    break;
                case "4":
                // when all the options are done, you can exist using this case.
                    System.out.println("Thank You for using the ATM");
                    return;            
                default:
                System.out.println("Invalid Input. Try using these options (1/2/3/4): ");
                    break;
            }
        }
    }
}
class BankAccount{
     int balance;
    int withdraw;
    int deposit;
    static Scanner sa = new Scanner(System.in);
    // function to check the balance
     public void checkbalance(){
        System.out.println("Current Balance: "+balance);
    }

    // function to withdraw the amount from the bankaccount
    public void AmountWithdraw(){
        System.out.println("Enter the amount you want to withdraw: ");
        withdraw = sa.nextInt();
        if(withdraw > balance){
            System.out.println("Not sufficient balance");
            System.out.println();
            System.out.println("UNABLE TO PROCESS TRANSACTION");
            System.out.println();
        }
        else{
            balance -= withdraw;
            System.out.println("Your Updated current balance is: "+balance);
            System.out.println("You can collect your money...");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("ThankingYou");
            System.out.println();
            System.out.println("TRANSACTION APPROVED");
        }
    }

    // function to add money in the bank account.
    public void depositMoney(){
        System.out.println("Enter the amount you want to deposit: ");
        deposit = sa.nextInt();
        balance += deposit;                                     
        System.out.println("You deposited INR "+ deposit +" successfully..");
        System.out.println("Your Updated current balance is: "+balance);
    }
}
