import util.JdbcUtil;

public class Main {
    public static void main(String[] args) {
        JdbcUtil jdbcUtil = new JdbcUtil();
        jdbcUtil.initDb(JdbcUtil.ActionType.CREATE.getCode());
    }
}
