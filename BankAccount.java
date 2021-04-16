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

    public void changePassword(String password) {
        this.password = password;
    }

    public void setBankName(String bName) {
        bankName = bName;
    }
    public void setBankAddress(String bAddress) {
        bankAddress = bAddress;
    }
    public void setRoutingNumber(String rNumber) {
        routingNumber = rNumber;
    }
    public void deposit(double amount) {
        if (amount >=0){
            accountBalance += amount;
            totalBalance += amount;
        }
        else
            System.out.println("Can't deposit a negative amount");
    }
}
