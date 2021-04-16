public class BankAccount {
    private int accountNum;
    private int accountBalance;
    private String password;
    private String customerName;
    private static String bankName;
    private static String bankAddress;
    private static String routingNumber;
    private static int totalBalance;

    public BankAccount()
    {

    }

    Public BankAccount(int n, String p, String c){
	accountNum = n;
	password = p;
	customerName = c;
	accountBalance = 0;
    }
}
