package day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H1lines implements Iline{
    String main;
    String regex;

    public H1lines(String x, String regex) {
        this.main = x;
        this.regex = regex;
    }


    @Override
    public int total() {
        int xx = 0;
        Matcher matcher = Pattern.compile(regex).matcher(main);
        while (matcher.find()) {
            xx += 1;
        }
        return xx;
    }
}
