package day5.ex3;

import java.util.List;

public class Exercise3 {
    public static <T extends Number> T findMax(List<T> t, int begin, int end) {
        T max = t.get(begin);
        for (int i = begin+1; i < end; i++) {
            if (t.get(i).doubleValue() > max.doubleValue())
                max = t.get(i);
        }
        return max;
    }
}
