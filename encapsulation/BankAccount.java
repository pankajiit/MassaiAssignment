package encapsulation;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Getter and setter methods for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and setter methods for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter and setter methods for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount();

        // Set values using setters
        account.setAccountNumber("123456789");
        account.setBalance(1000.50);
        account.setAccountHolderName("John Doe");

        // Display account details using getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());
    }
}

