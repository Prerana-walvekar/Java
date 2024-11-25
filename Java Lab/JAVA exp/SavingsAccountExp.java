class SavingsAccount {
    private double balance;
    private static double interestRate = 0.05;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public static double calculateMonthlyInterest(double balance) {
        return balance * (interestRate / 12); 
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public void addMonthlyInterest() {
        double interest = calculateMonthlyInterest(balance);
        balance += interest;
    }

    public double getBalance() {
        return balance;
    }
}

public class SavingsAccountExp {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000.00);

        System.out.printf("Initial Balance: %.2f%n", account.getBalance());

        account.addMonthlyInterest();
        System.out.printf("Balance after interest: %.2f%n", account.getBalance());

        SavingsAccount.setInterestRate(0.07); 

        account.addMonthlyInterest();
        System.out.printf("Balance after interest with new rate: %.2f%n", account.getBalance());
    }
}
