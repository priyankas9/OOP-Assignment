public class AccountTest {
    public static void main(String[] args) {
  
        CheckingAccount checkingAccount = new CheckingAccount(12345, 1000.0, 1.5, 500.0);
        
        SavingAccount savingAccount = new SavingAccount(67890, 2000.0, 2.0);

        checkingAccount.deposit(500.0);
        checkingAccount.withdraw(1700.0);
        checkingAccount.withdraw(300.0); 
        System.out.println(checkingAccount);

    
        savingAccount.deposit(300.0);
        savingAccount.withdraw(2500.0);
        savingAccount.withdraw(100.0); 
        System.out.println(savingAccount);
    }
}
