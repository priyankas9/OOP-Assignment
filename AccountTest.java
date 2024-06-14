public class AccountTest {
    public static void main(String[] args) {
        // Create a checking account with an overdraft limit of 500
        CheckingAccount checkingAccount = new CheckingAccount(12345, 1000.0, 1.5, 500.0);
        // Create a savings account
        SavingAccount savingAccount = new SavingAccount(67890, 2000.0, 2.0);

        // Deposit and withdraw from checking account
        checkingAccount.deposit(500.0);
        checkingAccount.withdraw(1700.0); // Should be allowed
        checkingAccount.withdraw(300.0);  // Should not be allowed
        System.out.println(checkingAccount);

        // Deposit and withdraw from savings account
        savingAccount.deposit(300.0);
        savingAccount.withdraw(2500.0); // Should not be allowed
        savingAccount.withdraw(100.0);  // Should be allowed
        System.out.println(savingAccount);
    }
}
