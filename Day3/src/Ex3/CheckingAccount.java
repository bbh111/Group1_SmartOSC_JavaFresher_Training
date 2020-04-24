package Ex3;

import java.util.Scanner;

public class CheckingAccount extends BankAccount
{
    public double depositMoneyCharges(double money)
    {
        double depositMoneyCharges = super.depositMoney(money) - 1;
        super.setBalance(depositMoneyCharges);
        return super.getBalance();
    }

    public double withdrawMoneyCharges(double money)
    {
        double withdrawMoneyCharges = super.withdrawMoney(money) - 1;
        super.setBalance(withdrawMoneyCharges);
        return withdrawMoneyCharges;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
