import java.io.*;
import java.util.Scanner;
class Account {
    String name;
    double balance;
    Account(String n, double b) {
        name = n;
        balance = b;
    }
    void deposit(double amount) {
        if(amount > 0) balance += amount;
    }
    void withdraw(double amount) {
        if(amount > 0 && amount <= balance) balance -= amount;
    }
    double getBalance() { return balance; }
    String getName() { return name; }
}
public class BankAccountIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("Bhavya", 1000.0);
        while(true) {
            System.out.print("\n1=Deposit 2=Withdraw 3=Balance 4=Save 5=Load 0=Exit: ");
            int choice = sc.nextInt();
            if(choice == 0) break;
            else if(choice == 1) {
                System.out.print("Amount: ");
                acc.deposit(sc.nextDouble());
            }
            else if(choice == 2) {
                System.out.print("Amount: ");
                acc.withdraw(sc.nextDouble());
            }
            else if(choice == 3) {
                System.out.println("Balance: Rs " + acc.getBalance());
            }
            else if(choice == 4) {
                saveAccount(acc, "account.txt");
            }
            else if(choice == 5) {
                acc = loadAccount("account.txt");
                System.out.println("Account loaded!");
            }
        }
        sc.close();
    }
    static void saveAccount(Account a, String filename) {
        try (PrintWriter pw = new PrintWriter(filename)) {
            pw.println(a.getName());
            pw.println(a.getBalance());
            System.out.println("Saved to " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Save failed!");
        }
    }
    static Account loadAccount(String filename) {
        try (Scanner fileSc = new Scanner(new File(filename))) {
            String name = fileSc.nextLine();
            double balance = Double.parseDouble(fileSc.nextLine());
            return new Account(name, balance);
        } catch (Exception e) {
            System.out.println("Load failed! Using default.");
            return new Account("Default", 0.0);
        }
    }
}