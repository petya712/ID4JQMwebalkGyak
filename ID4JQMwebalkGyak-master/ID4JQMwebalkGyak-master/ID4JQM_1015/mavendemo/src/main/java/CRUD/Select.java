package CRUD;

import java.sql.*;

public class Select {
	public static void main (String[] args) {
		Connection conn;
		ResultSet rs;
		PreparedStatement ps;
		String user = "H20_WSI08I";
		String password = "H20_WSI08I";
        try {
            String url = "jdbc:oracle:thin:@193.6.5.58:1521:XE";
            conn = DriverManager.getConnection(url,user,password);
            ps = conn.prepareStatement("SELECT * FROM CATS");
            
            rs = ps.executeQuery("SELECT * FROM CATS");
            while ( rs.next() ) {
                String name= rs.getString("1");
                String breed= rs.getString("2");
                int age= rs.getInt("3");
                String owner= rs.getString("4");
                System.out.println(name + " " + breed + " " + age + " " + owner);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
