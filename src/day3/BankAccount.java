package day3;

public abstract class BankAccount {
    protected double balances ;

    public BankAccount(double balances) {
        this.balances = balances;
    }

    public double getBalances() {
        return balances;
    }
    public abstract double deposit(double money);
    public abstract double withdraw(double money);
}
