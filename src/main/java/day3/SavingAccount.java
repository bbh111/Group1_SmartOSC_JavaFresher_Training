package main.java.day3;
public class SavingAccount extends BankAccount {
    int count = 0;

    public SavingAccount(double balance) {
        super(balance);
    }

    public double earnMonthlyInterest() {
        count = 0;
        double x = super.getBalance() * 0.01;
        super.setBalance(super.getBalance() + x);
        return x;
    }

    @Override
    public void deposit() {
        super.deposit();
        count++;
        process(count);
    }

    @Override
    public void withdraw() {
        super.withdraw();
        count++;
        process(count);
    }

    public void process(int count) {
        if (count > 3) {
            super.setBalance(super.getBalance() - 1);
            System.out.println("Balance after process: " + super.getBalance());
        } else {
            System.out.println("You just have " + (3 - count) + " times free");
        }
    }
}
