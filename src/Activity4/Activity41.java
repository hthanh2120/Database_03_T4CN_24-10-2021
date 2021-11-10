package Activity4;

import LaptopDB.Counter;
import LaptopDB.LaptopService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Activity41 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store_cms_plusplus", "root", "21102000");

        LaptopService laptopServices = new LaptopService(connection);
        List<Counter> result = laptopServices.getCounterByMaker();
        System.out.println(result);
    }
}
