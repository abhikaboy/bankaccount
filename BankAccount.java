public class BankAccount {
    private int accountNum;
    private double accountBalance;
    private String password;
    private String customerName;
    private static String bankName = "";
    private static String bankAddress = "";
    private static String routingNumber = "";
    private static double totalBalance = 0;

    public BankAccount(int accountNum, double accountBalance, 
    String password, String customerName)
    {
        this.accountNum = accountNum;
        this.accountBalance = accountBalance;
        this.password = password;
        this.customerName = customerName;
        totalBalance += accountBalance;
    }

    public String toString() {
        return customerName + "'s Bank account containing $" + accountBalance + " at " + bankName + " located at "
                + bankAddress;
    }

    public BankAccount(int n, String p, String c){
        accountNum = n;
        password = p;
        customerName = c;
        accountBalance = 0;
    }
}
