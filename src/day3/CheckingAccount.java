package day3;

public class CheckingAccount extends BankAccount {


    public CheckingAccount(double balances) {
        super(balances);
    }

    public double deposit(double money) {
        super.balances = (super.getBalances()+money-1);
        return super.getBalances()+money-1;
    }

    public double withdraw(double money) {
        super.balances = (super.getBalances()-money-1);
        return super.getBalances()-money-1;
    }
}
