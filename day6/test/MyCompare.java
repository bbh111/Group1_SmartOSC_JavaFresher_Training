import java.util.Collections;

public class MyCompare {
    public MyCompare() {
        System.out.println("MyCompare{}");
    }

    public MyCompare(String s, String s1) {
    }

    public static int compare(String s, String s1) {
        return Collections.reverseOrder().compare(s, s1);
    }

    public MyCompare(String s) {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "MyCompare{}";
    }
}
