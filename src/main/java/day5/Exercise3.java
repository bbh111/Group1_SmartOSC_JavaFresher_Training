package day5;

import java.util.Collection;
import java.util.List;

public class Exercise3 {
    public <T extends Number> T getMaxValueElement(List<T> input, int begin, int end){
        T maxValue = null;
        if(begin>input.size()||end>input.size()||begin<0||end<0) return null;
        int tmp;
        if(begin>end){
            tmp = begin;
            begin = end;
            end = tmp;
        }
        for (int i = begin;i<end;i++){
            if(input.get(i).doubleValue()>maxValue.doubleValue()){
                maxValue = input.get(i);
            }
        }
        return maxValue;
    }
}
