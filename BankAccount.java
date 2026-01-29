class BankAccount {
    String accountNumber;
    String ownerName;
    double balance;

    BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("So du khong du!");
    }

    double checkBalance() {
        return balance;
    }

    void display() {
        System.out.println("STK: " + accountNumber + " - Chu tai khoan: " + ownerName + " - So du: " + balance);
    }
}
