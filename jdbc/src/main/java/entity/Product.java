package entity;

import annotation.Entity;
import annotation.GeneratedValue;
import annotation.Id;
import util.JdbcUtil;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = JdbcUtil.GenerationType.IDENTITY)
    private Long id;
}
