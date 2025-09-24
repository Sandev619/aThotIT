package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//executeUpdate() is for insert/delete/update
//executeQuery() is used for select(fetch operation)
public class Dao {

	private static final String url = "jdbc:mysql://localhost:3306/test.db";
	private static final String username = "root";
	private static final String password = "root";

	static Connection getConnection() throws SQLException {

		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}

	void insertRecord(int id, String name, String email) {
		try {
			String sql = "insert into users(id,name,email) values(? ,?,?)";
			// get connection
			Connection conn = Dao.getConnection();
			// create a statement
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			int noOfModifiedRows = ps.executeUpdate();
			if (noOfModifiedRows > 0) {
				System.out.println("inserted successfully");
			} else {

				System.out.println("some issue with insertion");
			}
		} catch (Exception e) {
			System.out.println("some exception..details are");
			System.out.println(e.getMessage());
		}
	}

	public void deleteRecord(String name) {
		try {
			String sql = "delete from users where name = ?";
			// get connection
			Connection conn = Dao.getConnection();
			// create a statement
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			int noOfModifiedRows = ps.executeUpdate();
			if (noOfModifiedRows > 0) {
				System.out.println("deleted successfully");
			} else {

				System.out.println("some issue with deletion");
			}

		} catch (Exception e) {
			System.out.println("some exception..details are");
			System.out.println(e.getMessage());

		}
	}

	public void updateRecord(int providedId, String providedName) {
		try {
			String sql = "update users set name=? where id =?";
			// get connection
			Connection conn = Dao.getConnection();
			// create a statement
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, providedName);
			ps.setInt(2, providedId);

			int noOfModifiedRows = ps.executeUpdate();
			if (noOfModifiedRows > 0) {
				System.out.println("updated successfully");
			} else {

				System.out.println("some issue with update");
			}

		} catch (Exception e) {
			System.out.println("some exception..details are");
			System.out.println(e.getMessage());

		}
	}

	public void fetchRecords(boolean b) {
		try {
			String sql = "SELECT id, name, email FROM users";

			// get connection
			Connection conn = Dao.getConnection();
			// create a statement
			PreparedStatement ps = conn.prepareStatement(sql);
			// run query
			ResultSet rs = ps.executeQuery();
			
				
			

			// Process the result set
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
			}

		} catch (Exception e) {
			System.out.println("some exception..details are");
			System.out.println(e.getMessage());
		}

	}
}