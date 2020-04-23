package day3;

public class SavingAccount extends BankAccount {
    int count = 0;
    public SavingAccount(double balance) {
        super(balance);
    }

    public double earnMonthlyInterest(){
        count = 0;
        double x = super.getBalance()*0.01;
        super.setBalance(super.getBalance()+x);
        return x;
    }

    @Override
    public void deposit() {

        super.deposit();
        count++;

        if(count > 3){
            super.setBalance(super.getBalance()-1);
            System.out.println("Balance after process: "+ super.getBalance());
        }else{
            System.out.println("You just have " + (3-count)+ " times free");
        }

    }

    @Override
    public void withdraw() {
        super.withdraw();
        count++;
        if(count > 3){
            super.setBalance(super.getBalance()-1);
            System.out.println("Balance after process: "+ super.getBalance());
        }else{
            System.out.println("You just have " + (3-count)+ " times free");
        }
    }
}
