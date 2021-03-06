public class BankAccount {
    private int accountNum;
    private double accountBalance;
    private String password;
    private String customerName;
    private static String bankName = "";
    private static String bankAddress = "";
    private static String routingNumber = "";
    private static double totalBalance = 0;

    public BankAccount(int accountNum, double accountBalance, String password, String customerName) {
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

    public void withdraw(double n) {
        if (n < 0) {
            System.out.println("Can't withdraw a negative amount");
        }

        else if (accountBalance - n >= 0) {
            accountBalance -= n;
        } else {
            System.out.println("Withdraw rejected - withdrawal amount would put the account into a negative balance");
        }
    }

    public BankAccount(int n, String p, String c) {
        accountNum = n;
        password = p;
        customerName = c;
        accountBalance = 0;
    }

    public double getBalance() {
        return accountBalance;
    }

    public static double getTotalBalance() {
        return totalBalance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public static void setBankName(String bName) {
        bankName = bName;
    }

    public static void setBankAddress(String bAddress) {
        bankAddress = bAddress;
    }

    public static void setRoutingNumber(String rNumber) {
        routingNumber = rNumber;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            accountBalance += amount;
            totalBalance += amount;
        } else
            System.out.println("Can't deposit a negative amount");
    }
}
