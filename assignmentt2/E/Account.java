public class Account {
    // Private member variables
    private String id;
    private String name;
    private int balance;

    // Constructor with id and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor with id, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter for ID
    public String getID() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Method to credit amount to the balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Method to debit amount from the balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Method to transfer amount to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString method
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        Account acc1 = new Account("A001", "John Doe", 1000);
        Account acc2 = new Account("A002", "Jane Smith", 500);

        // Testing the Account class
        System.out.println(acc1);
        System.out.println(acc2);

        acc1.credit(500);
        System.out.println("After crediting 500 to acc1: " + acc1);

        acc1.debit(300);
        System.out.println("After debiting 300 from acc1: " + acc1);

        acc1.transferTo(acc2, 700);
        System.out.println("After transferring 700 from acc1 to acc2:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
