package day6.exercise3;

public class CountDivisor {
    private int start;
    private int end;
    private int MAX = 100000;

    public Result findOutLagestDevisor(int numberOfThread) throws Exception {
        Result finalRs = new Result();
        if (MAX % numberOfThread != 0) {
            numberOfThread += 1;
        }
        FindThread[] totalThread = new FindThread[numberOfThread];
        start = 1;
        end = MAX / numberOfThread;
        for (int i = 0; i < numberOfThread; i++) {
            totalThread[i] = new FindThread(start, end);
            Result rs = totalThread[i].call();
            if (finalRs.getMaxCount()<rs.getMaxCount()) {
                finalRs = rs;
            }
            start = end + 1;
            end += MAX / numberOfThread;
            while (totalThread[i].isAlive()){
                totalThread[i].join();
            }
        }
        return finalRs;
    }
}
