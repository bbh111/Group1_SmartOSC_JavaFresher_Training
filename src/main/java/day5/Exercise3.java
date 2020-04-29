package day5;

import java.util.List;

public class Exercise3 {
    public <T extends Comparable> T getMaxValueElement(List<T> input, int begin, int end) {
        if (begin > input.size()  || begin < 0 || end < 0) return null;
        int tmp;
        if (begin > end) {
            tmp = begin;
            begin = end;
            end = tmp;
        }else if(end>begin&&end>=input.size()){
            end = input.size()-1;
        }
        T maxValue = input.get(begin);
        for (int i = begin; i <= end; i++) {
            if (input.get(i).compareTo(maxValue) >=0) {
                maxValue = input.get(i);
            }
        }
        return maxValue;
    }
}
