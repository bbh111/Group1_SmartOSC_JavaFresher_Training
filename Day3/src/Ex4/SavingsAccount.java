package Ex4;

import Ex3.BankAccount;

public class SavingsAccount extends BankAccount
{
    int transactionCount = 3;

    public double getBalance()
    {
        return super.getBalance();
    }

    public double depositMoney(double money)
    {
        double depositMoney = 0;
        if(transactionCount != 0) {
            depositMoney = super.depositMoney(money);
            transactionCount --;
        }
        else
        {
            depositMoney = super.depositMoney(money) - 1;
            setBalance(depositMoney);
        }
        return depositMoney;
    }

    public double withdrawMoney(double money)
    {
        double withdrawMoney = 0;
        if(transactionCount != 0) {
            withdrawMoney = super.withdrawMoney(money);
            transactionCount--;
        }
        else
        {
            withdrawMoney = super.withdrawMoney(money) - 1;
            setBalance(withdrawMoney);
        }
        return withdrawMoney;
    }

    public void earnMonthlyInterest()
    {
        double rate = 0.1;
        double earnMonthlyInterest = super.getBalance() + super.getBalance() * rate;
        setBalance(earnMonthlyInterest);
        System.out.println(getBalance());

        transactionCount = 3;
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        sa.earnMonthlyInterest();
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));

    }
}
