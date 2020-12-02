package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Update {

	public static void main(String[] args) {
		Connection conn;
		ResultSet rs;
		PreparedStatement ps;
		String user = "H20_WSI08I";
		String password = "H20_WSI08I";
		String breed = "Sziami";
		String owner = "Piros Ferenc";
		String sql = "update CATS set owner = ? where breed='" + breed + "'";

		try {
			String url = "jdbc:oracle:thin:@193.6.5.58:1521:XE";
			
			
			conn = DriverManager.getConnection(url,user,password);
			ps = conn.prepareStatement(sql);
			rs=ps.executeQuery(sql);
			while(rs.next()) {
			ps.setString(1, owner);

			ps.executeUpdate();
			ps.close();
			}

			System.out.println("Character name changed!");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
