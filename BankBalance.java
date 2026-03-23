class BankAccount 
{
    private double balance;
    public void deposit(double amount) 
    {
        balance += amount;
    }
    public double getBalance() 
    {
        return balance;
    }
}
public class BankBalance 
{
    public static void main(String[] args) 
    {
        BankAccount acc = new BankAccount();
        acc.deposit(2000);
        System.out.println("Bhavya's Balance: " + acc.getBalance());
    }
}
