import java.util.Scanner;

public class BankAccount
{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney(double money)
    {
        this.balance += money;
    }

    public void withdrawMoney(double money)
    {
        if(money>this.balance)
        {
            System.out.println("Số tiền của bạn không đủ để rút !!!");
        }else
        {
            this.balance -= money;
            System.out.println("Rút " + money + " VNĐ thành công");
        }
    }

}
