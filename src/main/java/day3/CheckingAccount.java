package day3;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit() {
        super.deposit();
        processChecking();
    }

    @Override
    public void withdraw() {
        super.withdraw();
        processChecking();
    }

    public void processChecking() {
        super.setBalance(super.getBalance() - 1);
        System.out.println("Balance after process: " + super.getBalance());
    }
}
