package day3;

public class SavingAccount extends BankAccount {
    private static int count=3;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SavingAccount.count = count;
    }

    @Override
    public double deposit(double money) {
        if (count <= 3) {
            count-=1;
            super.setBalances(super.getBalances()+money);
            return super.getBalances() + money;
        } else {

            super.setBalances((super.getBalances()+money-1));
            return super.getBalances() + money - 1;
        }
    }

    @Override
    public double withdraw(double money) {
        if (count <= 3) {
            count-=1;
            super.setBalances(super.getBalances()-money);
            return super.getBalances() - money;
        } else {

            super.setBalances((super.getBalances()-money-1));
            return super.getBalances() - money - 1;
        }
    }

    public double earnMonthlyInteres(){
        this.count = 3;
        double rs = super.getBalances()*super.getRate();
        super.setBalances(super.getBalances()+super.getBalances()*super.getRate());
        return rs;
    }
}
