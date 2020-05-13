package util;

import annotation.Entity;
import annotation.GeneratedValue;
import annotation.Id;
import com.sun.istack.internal.Nullable;
import model.ConnectionHelper;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.scanners.TypeElementsScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Set;

public class JdbcUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JdbcUtil.class);
    private static final StringBuilder BUILDER = new StringBuilder();
    private Connection connection;
    private static final ResourceBundle bundle = ResourceBundle.getBundle("application");

    public JdbcUtil() {
        this.connectDb();
    }

    private void connectDb() {
        String username = bundle.getString("database.username");
        String password = bundle.getString("database.password");
        String url = bundle.getString("database.url");
        this.connection = ConnectionHelper.getInstance().connection(url, username, password);
    }

    private static Set<Class<?>> getReflectionsSubTypes() {
        Reflections reflections = new Reflections("entity", new SubTypesScanner(false),
                new TypeElementsScanner(), new MethodAnnotationsScanner(), new TypeAnnotationsScanner());
        return reflections.getTypesAnnotatedWith(Entity.class);
    }

    public void initDb(int action) {
        if (action == ActionType.CREATE.getCode()) {
            this.createDb();
        }
    }

    private void updateDB() {
        BUILDER.delete(0, BUILDER.length());
        for (Class<?> aClass : getReflectionsSubTypes()) {
            System.out.println(aClass.getSimpleName());
        }
    }

    private void createDb() {
        BUILDER.delete(0, BUILDER.length());
        for (Class<?> aClass : getReflectionsSubTypes()) {
            BUILDER.append("create table if not exists ").append(aClass.getSimpleName()).append(" (");
            for (Field field : aClass.getDeclaredFields()) {
                BUILDER.append("\n");
                BUILDER.append(field.getName())
                        .append(" ")
                        .append(convertTypeToString(field));
                if (field.isAnnotationPresent(Id.class)){
                    BUILDER.append(" primary key ");
                    if (field.isAnnotationPresent(GeneratedValue.class)) {
                        BUILDER.append(field.getAnnotation(GeneratedValue.class).strategy().getType());
                    }
                }
                BUILDER.append(",");
            }
            BUILDER.delete(BUILDER.length() - 1, BUILDER.length());
            BUILDER.append("\n) CHARACTER SET utf8 COLLATE utf8_general_ci;");
        }
        this.dropAllTable();
        try (PreparedStatement statement = this.connection.prepareStatement(BUILDER.toString().replaceAll("\\s{2,}", " "))) {
            statement.execute();
            LOGGER.debug(String.valueOf(statement));
        } catch (SQLException throwable) {
            LOGGER.error("Create DB errors", throwable);
        }
    }

    private String convertTypeToString(Field field) {
        String typeStr = "";
        Class<?> type = field.getType();
        if (type == int.class || type == Integer.class) {
            typeStr = " int ";
        } else if (type == long.class || type == Long.class) {
            typeStr = " bigint ";
        } else if (type == String.class) {
            typeStr = " varchar(191) ";
        } else if (type == double.class || type == Double.class) {
            typeStr = " double ";
        }
        return typeStr;
    }

    private void dropAllTable() {
        String sql = "SET FOREIGN_KEY_CHECKS = 0;" +
                " SET @tables = NULL;" +
                " SELECT GROUP_CONCAT('`', table_schema, '`.`', table_name, '`') INTO @tables" +
                " FROM information_schema.tables" +
                " WHERE table_schema = '" + bundle.getString("database.name") + "';" +
                " SET @tables = CONCAT('DROP TABLE ', @tables);\n" +
                " PREPARE stmt FROM @tables;" +
                " EXECUTE stmt;" +
                " DEALLOCATE PREPARE stmt;" +
                " SET FOREIGN_KEY_CHECKS = 1;";
        try (PreparedStatement statement = this.connection.prepareStatement(sql)) {
            statement.execute();
        } catch (SQLException throwable) {
            LOGGER.error(throwable.getMessage());
        }
    }

    public enum GenerationType {
        IDENTITY("auto_increment");
        private final String type;

        GenerationType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public enum ActionType {
        CREATE(1), UPDATE(2);
        private final int code;

        ActionType(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }
}
