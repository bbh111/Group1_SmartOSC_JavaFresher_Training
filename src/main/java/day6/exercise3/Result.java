package day6.exercise3;

public class Result implements Comparable{
    private int maxDivisorsNumber;
    private int maxCount;

    public Result() {
    }

    public Result(int maxDivisorsNumber, int maxCount) {
        this.maxDivisorsNumber = maxDivisorsNumber;
        this.maxCount = maxCount;
    }

    public int getMaxDivisorsNumber() {
        return maxDivisorsNumber;
    }

    public void setMaxDivisorsNumber(int maxDivisorsNumber) {
        this.maxDivisorsNumber = maxDivisorsNumber;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public int compareTo(Object other) {
        return   this.getMaxCount()<=((Result)other).getMaxCount()?1:0;
    }
}

