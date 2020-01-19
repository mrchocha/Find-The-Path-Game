package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConectionClass {
    Connection connection;
    public Connection getConection() throws ClassNotFoundException, SQLException {
        String name="Rahul";
        String username="root";
        String password="";
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/score",username,password);
        return connection;
    }
}
