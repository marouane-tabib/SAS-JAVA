import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

        private static final String URL = "jdbc:mysql://localhost:3306/db_bibliotique";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "";

        private static Connection connection;

        public static  Connection dbConnection(){
            //jdbc:mysql://localhost:3306/db_bibliotique
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }catch (SQLException e){
                e.printStackTrace();
            }
            return connection ;
        }

}
