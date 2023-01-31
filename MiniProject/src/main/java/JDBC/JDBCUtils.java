package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {

    private static String jdbcUrl="jdbc:mysql://localhost:3306/jdbc_demos";
    private static String jdbcUser="root";
    private static String jdbcPassword="root";

    public static Connection getCOnnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl,jdbcUser,jdbcPassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}
