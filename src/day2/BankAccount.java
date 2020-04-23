package day2;

public class BankAccount {
    private double balance;


    public BankAccount() {
        this.balance = 100 ;
    }

    public double getBalance() {
        return balance;
    }
    public void depositMoney(double money){
        this.balance += money;
    }

    public void withdrawMoney(double money){
        if(money>this.balance){
            System.out.println("Your money has not enough !!!");
        }else{
            this.balance -= money;
            System.out.println("Withdraw $"+money+" successfully");
        }
    }

}
