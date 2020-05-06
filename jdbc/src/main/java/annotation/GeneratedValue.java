package annotation;

import util.JdbcUtil;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GeneratedValue {
    JdbcUtil.GenerationType strategy() default JdbcUtil.GenerationType.IDENTITY;
}
