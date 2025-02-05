package _5_classComponents.variables;

public class BankAccount {
    int customerId;
    int accountNumber;
    String customerName;
    int balance;
    static String bankName = "SBI";

    public static void main(String[] args) {
        //static variable
        System.out.println(BankAccount.bankName);

        //instance variable
        BankAccount bankAccount = new BankAccount();
        bankAccount.customerId = 101;
        bankAccount.accountNumber = 1234;
        bankAccount.customerName = "Sachin";
        bankAccount.balance = 1000;

        System.out.println("Customer ID: " + bankAccount.customerId);
        System.out.println("Customer Account Number : " + bankAccount.accountNumber);
        System.out.println("Customer Name : "+bankAccount.customerName);
        System.out.println("Customer Bank Balance : "+bankAccount.balance);
    }
}
