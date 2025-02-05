package classComponents.methods;

public class BankAccount {
    private int bankAccountNumber;
    private String accountHolderName;
    private double accountBalance;

    private static String BANK_NAME = "Bank of Mallya";

    public void deposit() {
        System.out.println("money deposited");
    }

    public void withDraw() {
        System.out.println("withdraw");
    }

    public static void bankDetails() {
        System.out.println("Bank details");
    }


}
