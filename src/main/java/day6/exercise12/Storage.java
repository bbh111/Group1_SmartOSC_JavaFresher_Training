package day6.exercise12;

import java.util.List;

public class Storage {
    public Storage(List<Integer> list) {
        this.list = list;
    }

    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}

