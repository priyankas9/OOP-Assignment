public class SavingAccount extends Account {
    public SavingAccount(int accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds account balance.");
        }
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accountNumber=" + getAccountNumber() +
                ", balance=" + getBalance() +
                ", annualInterestRate=" + getAnnualInterestRate() +
                '}';
    }
}
