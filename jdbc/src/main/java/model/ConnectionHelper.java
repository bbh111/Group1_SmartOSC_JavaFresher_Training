package model;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class ConnectionHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionHelper.class);
    private static ConnectionHelper instance;
    public Connection connection(String url, String user, String password) {
        Connection cnn = null;
        try {
            cnn = getConnection(url, user, password);
        } catch (SQLException e) {
            LOGGER.debug(e.getSQLState());
        }
        return cnn;
    }

    public static ConnectionHelper getInstance() {
        if (instance == null) {
            instance = new ConnectionHelper();
        }
        return instance;
    }
}
