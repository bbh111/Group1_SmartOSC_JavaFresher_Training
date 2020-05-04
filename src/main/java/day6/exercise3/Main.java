package day6.exercise3;

public class Main {
    public static void main(String[] args) {
        CountDivisor countDivisor = new CountDivisor();
        try {
            System.out.println(countDivisor.findOutLagestDevisor(10).getMaxDivisorsNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
