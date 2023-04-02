public class pro_1 

{

    private String depositorName;

    private String accountNumber;

    private String accountType;

    private double balance;

    

    

    public pro_1(String depositorName, String accountNumber, String accountType, double balance) {

        this.depositorName = depositorName;

        this.accountNumber = accountNumber;

        this.accountType = accountType;

        this.balance = balance;

    }

    

    

    public pro_1(String depositorName, String accountNumber) {

        this(depositorName, accountNumber, "Checking", 0.0);

    }

    

   

    public pro_1(String depositorName, String accountNumber, String accountType) {

        this(depositorName, accountNumber, accountType, 0.0);

    }

    

   

    public void deposit(double amount) {

        this.balance += amount;

    }

    

    

    public void withdraw(double amount) {

        if (this.balance >= amount) {

            this.balance -= amount;

        } else {

            System.out.println("Insufficient balance!");

        }

    }

    

    

    public void display() {

        System.out.println("Depositor name: " + this.depositorName);

        System.out.println("Balance: " + this.balance);

    }

    public static void main(String[] args) {

    pro_1 account = new pro_1("Kaushik Khatwani", "1234567890", "Savings", 1000.0);

    account.display();  

    account.deposit(500.0);

    account.display();  

    account.withdraw(2000.0); 

    account.withdraw(500.0);

    account.display();  

}

