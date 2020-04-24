package Ex4;

import Ex3.BankAccount;

public class SavingsAccount extends BankAccount
{
    int transactionCount = 0;
    int day = 10;

    public double getBalance()
    {
        return super.getBalance();
    }

    public boolean dayCount()
    {
        day --;
        if( day != 0)
        {
            return false;
        }
        return true;
    }

    public void updateTransaction()
    {
        transactionCount = 3;
    }

    public void chargeCount()
    {
        transactionCount --;
    }

    public double depositMoney(double money)
    {
        double depositMoney = 0;
        if(dayCount())
        {
            earnMonthlyInterest();
            day = 10;
        }
        if(transactionCount != 0) {
            depositMoney = super.depositMoney(money);
            chargeCount();
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

        System.out.println("Tiền gốc: " + getBalance() + "$ Tiền lãi: " + super.getBalance() * rate);
        setBalance(earnMonthlyInterest);

        updateTransaction();
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
//        sa.earnMonthlyInterest();
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));
        System.out.println(sa.depositMoney(5));

    }
}
