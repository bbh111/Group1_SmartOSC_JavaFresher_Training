package day6.exercise3;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long end = 0;
        CountDivisor countDivisor = new CountDivisor();
        try {
            Result rs = countDivisor.findOutLagestDevisor(1);
            System.out.println(rs.getMaxDivisorsNumber()+" with "+rs.getMaxCount()+" divisors");
            end = System.currentTimeMillis();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Time elapsed: " + (end - start));
        }
    }
}
