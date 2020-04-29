package day5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Exercise2 {
    public <T extends Number> List exchangeValue(Collection<T> input, int position1, int position2) {
        T temp;
        if (position2 > input.size() - 1 || position1 > input.size() - 1) return Arrays.asList(input);
        List tmp = Arrays.asList(input);
        temp = (T) tmp.get(position1);
        tmp.set(position1,tmp.get(position2));
        tmp.set(position2,temp);
        return tmp;
    }
}
