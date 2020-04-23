package day3;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit() {
        super.deposit();

        super.setBalance(super.getBalance()-1);
        System.out.println("Balance after process: "+ super.getBalance());
    }

    @Override
    public void withdraw() {
        super.withdraw();

        super.setBalance(super.getBalance()-1);
        System.out.println("Balance after process: "+ super.getBalance());
    }
}
