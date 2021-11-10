package Activity3;

import LaptopDB.Laptop;
import LaptopDB.LaptopService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Activity31 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store_cms_plusplus", "root", "21102000");

//        1. Viết hàm tìm kiếm laptop theo khoảng giá từ x đến y. (x và y có thể ko đồng thời có mawtj) => check null
//        2. Viết hàm tìm kiếm laptop theo loại ổ cứng và hãng sản xuất. VD(haangx: asus, ổ ssd)

        LaptopService laptopServices = new LaptopService(con);
        List<Laptop> laptops = laptopServices.findLaptopByPrice(null,30000000f);
        for (Laptop laptop :laptops){
            System.out.println(laptop.getId()+". "+ laptop.getName()+", maker: "+ laptop.getMaker()+", price: "+ laptop.getPrice());
        }

        List<Laptop> laptops1 = laptopServices.findLaptopByMaker("ASUS","hdd",null);
        for (Laptop laptop1: laptops1
        ) {
            System.out.println("\n"+laptop1.getName()+", maker: "+ laptop1.getMaker()+", hdd: "+ laptop1.getHdd()+", ssd: "+ laptop1.getSsd());
        }
    }
}
