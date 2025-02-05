package _5_classComponents.methods;

public class BankAccount {
    int accountNumber;
    int balance;
    String accountHolderName;
    static String BANK_NAME = "SBI";

    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
    }

    int getBalance() {
        return balance;
    }

    static String getBankDetails() {
        return BANK_NAME + " \t is located at Pune";
    }

}
