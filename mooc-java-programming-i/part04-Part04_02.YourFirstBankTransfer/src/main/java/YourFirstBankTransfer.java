
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account bank1 = new Account("Matthews account", 1000);
        Account bank2 = new Account("My account", 0);

        bank1.withdrawal(100.00);
        bank2.deposit(100.00);

        System.out.println(bank1);
        System.out.println(bank2);
    }
}
