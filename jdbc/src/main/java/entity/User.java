package entity;

import annotation.Entity;
import annotation.GeneratedValue;
import annotation.Id;
import util.JdbcUtil;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = JdbcUtil.GenerationType.IDENTITY)
    private long id;

    private String name;

    public User(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
