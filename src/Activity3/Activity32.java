package Activity3;

import LaptopDB.Laptop;
import LaptopDB.LaptopService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Activity32 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store_cms_plusplus", "root", "21102000");

        LaptopService laptopServices = new LaptopService(con);
        List<Laptop> laptops = laptopServices.findLaptopBySelection(8000000f,38000000f,null,null,null,null,null,null,null,null);
        for (Laptop laptop: laptops
        ) {
            System.out.println(laptop.getName()+", Maker :"+ laptop.getMaker()+", Screen size: "+ laptop.getScreen_size()+", RAM: "+ laptop.getRam()+", CPU: "+ laptop.getCpu()+", Card: "+ laptop.getCard()+", Price: "+ laptop.getPrice());
        }
    }
}
