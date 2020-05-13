package day7;

public class  Demo<T extends Comparable>  implements Comparable<T >{
    T o;

    public Demo(T o) {
        this.o = o;
    }


    @Override
    public  int compareTo(T another) {
        return this.o.compareTo(another);
    }
}
