package day3;

public abstract class BankAccount {
    public static double balances = 100;
    private double rate = 0.01;

    public double getRate() {
        return rate;
    }


    public double getBalances() {
        return balances;
    }


    public void setBalances(double balances) {
        this.balances = balances;
    }

    public abstract double deposit(double money);
    public abstract double withdraw(double money);
}
