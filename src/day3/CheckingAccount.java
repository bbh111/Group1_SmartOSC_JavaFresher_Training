package day3;

public class CheckingAccount extends BankAccount {

    public double deposit(double money) {
        super.setBalances(super.getBalances()+money-1);
        return super.getBalances()+money-1;
    }

    public double withdraw(double money) {
        super.setBalances(super.getBalances()-money-1);
        return super.getBalances()-money-1;
    }
}
