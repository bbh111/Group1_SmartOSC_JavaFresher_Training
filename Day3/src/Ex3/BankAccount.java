package Ex3;

public class BankAccount
{
    private double balance;

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double depositMoney(double money)
    {
        double depositMoney = this.balance + money ;
        setBalance(depositMoney);
        return depositMoney;
    }

    public double withdrawMoney(double money)
    {
        double withdrawMoney = 0;
        if(money > this.balance)
        {
            System.out.println("Số tiền của bạn không đủ để rút !!!");
        }else
        {
            withdrawMoney = this.balance - money;
            setBalance(withdrawMoney);
        }
        return withdrawMoney;
    }
}
