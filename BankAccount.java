public class BankAccount {
    private int accountNum;
    private int accountBalance;
    private String password;
    private String customerName;
    private static String bankName;
    private static String bankAddress;
    private static String routingNumber;
    private static int totalBalance;

    public BankAccount() {

    }

    public String toString() {
        return customerName + "'s Bank account containing $" + accountBalance + " at " + bankName + " located at "
                + bankAddress;
    }

}
