package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps;
		ResultSet rs;
		String user = "H20_WSI08I";
		String password = "H20_WSI08I";
		String sql = "insert into CARTS values(?, ?, ?, ?, ?)";
		Scanner sc = new Scanner(System.in);
        
		
		
		System.out.print("Kat id: ");
		int cat_id = sc.nextInt();
		System.out.println();
		
		System.out.print("Kat name: ");
		String cat_name = sc.nextLine();
		System.out.println();
		
		System.out.print("Kat breed: ");
		String cat_breed = sc.next();
		System.out.println();
		
		System.out.print("Kat age: ");
		int cat_age = sc.nextInt();
		System.out.println();
		
		System.out.print("Kat owner: ");
		String cat_owner = sc.nextLine();
		System.out.println();
		
		sc.close();
		
		try {
	        String url = "jdbc:oracle:thin:@193.6.5.58:1521:XE";
			conn = DriverManager.getConnection(url,user,password);
			ps = conn.prepareStatement(sql);
			rs=ps.executeQuery(sql);
			while(rs.next()) {
			ps.setInt(1, cat_id);
			ps.setString(2, cat_name);
			ps.setString(3, cat_breed);
			ps.setInt(4, cat_age);
			ps.setString(4, cat_owner);
			ps.executeUpdate();
			ps.close();
			}
			System.out.println("Katto recorded good job!");

		} catch (Exception e) {
						System.err.println(e.getMessage());
		}
	}

}
