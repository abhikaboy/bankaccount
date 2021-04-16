public class BankAccount {
    private int accountNum;
    private int accountBalance;
    private String password;
    private String customerName;
    private static String bankName;
    private static String bankAddress;
    private static String routingNumber;
    private static int totalBalance;

    public BankAccount(int accountNum, int accountBalance, 
    String password, String customerName, String bName, String bAddress, String rNum, int totalB)
    {
        this.accountNum = accountNum;
        this.accountBalance = accountBalance;
        this.password = password;
        this.customerName = customerName;
        bankName = bName;
        bankAddress = bAddress;
        routingNumber = rNum;
        totalBalance = totalB;
    }
}
