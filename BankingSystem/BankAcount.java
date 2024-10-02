
public class BankAcount {
    private double accountBalance;

    //constructor
    public BankAcount(){
        this.accountBalance = 0.0;
    }

    public void checkBalance(){
        System.out.println("Your balance is: " + accountBalance);
    }

    public void deposit(double amount){
        if(amount  > 0){
            accountBalance += amount;
            System.out.println("Your current balance is: " + accountBalance);
        }else{
            System.out.println("Deposit amount is invalid");
        }
    }
    //withdrawal
    public void withdrawal(double amount){
        if(amount > 0){
            if(amount <= accountBalance){
                accountBalance -= amount;
                System.out.println("RM " + amount + " is successfully withdraw ");
            }else{
                System.out.println("Error:: Insufficient fund");
            }
        }else{
            System.out.println("Withdrwal must be positive amount");
        }
    }
}
