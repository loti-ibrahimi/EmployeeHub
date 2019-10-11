package org.employee.db;

/**
 *
 * @author loti ibrahimi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Properties;

public class DBConnection {
    
    /** The name of the MySQL account to use (or empty for anonymous) */
    private final String userName = "root";

    /** The password for the MySQL account (or empty for anonymous) */
    private final String password = "";

    /** The name of the computer running MySQL */
    private final String serverName = "localhost";

    /** The port of the MySQL server (default is 3306) */
    private final int portNumber = 8889;

    /** The name of the database we are testing with (this default is installed with MySQL) */
    private final String dbName = "test";

    /** The name of the table we are testing with */
    private final String tableName = "employee_table";

    /**
     * Get a new database connection
     * 
     * @return
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
            Connection conn = null;
            Properties connectionProps = new Properties();
            connectionProps.put("user", this.userName);
            connectionProps.put("password", this.password);

            conn = DriverManager.getConnection("jdbc:mysql://"
                            + this.serverName + ":" + this.portNumber + "/" + this.dbName,
                            connectionProps);
            return conn;
    }
}
