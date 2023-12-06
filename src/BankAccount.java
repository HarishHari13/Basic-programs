
public class BankAccount {
	private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
 
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(12345, 1000.0);


        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        account.setAccountNumber(54321);
        account.setBalance(1500.0);
        System.out.println("after modifying account number:"+account.getAccountNumber());
        System.out.println("after modifying balance: $"+account.getBalance());
    }}
