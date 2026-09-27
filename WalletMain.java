package Assignmet01;

public class WalletMain {

    public static void main(String[] args) {

        DigitalWallet wallet = new DigitalWallet("Ihsan Ullah", 50000, "1234");

        System.out.println("Account Holder: " + wallet.getAccountHolder());

        System.out.println("Initial Balance: " + wallet.getBalance());

        boolean result = wallet.withdraw(10000, "1234");

        System.out.println("Withdrawal Successful: " + result);

        System.out.println("Remaining Balance: " + wallet.getBalance());
    }
}