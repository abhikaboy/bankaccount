public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount.setBankName();
        BankAccount.setBankAddress();
        BankAccount.setRoutingNumber();
        BankAccount[] accounts = { new BankAccount(0, 100, "password1", "bob"),
                new BankAccount(1, 100, "password2", "jamal"), new BankAccount(2, 100, "password3", "Hammad"),
                new BankAccount(3, 100, "password4", "Vinu"), new BankAccount(4, 100, "password5", "Abhik"), };

        int widthdrawAmount = 10;
        int depositAmount = 10;

        accounts[0].withdraw(widthdrawAmount);
        accounts[1].deposit(depositAmount);
        accounts[2].changePassword("bababab");

    }
}
