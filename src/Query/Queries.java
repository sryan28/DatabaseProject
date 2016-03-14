package Query;

import java.sql.*;

/*
 * This class is for opening and closing the database 
 * Use queryDatabase method for querying
 * 
 * When using this class make sure you check the returned ResultSet is not null!
 * Remember to close the database after you use it!
 */

public class Queries {

	private final static String PASSWORD = "Cake=Lie1";
	private final static String USERNAME = "";
	

	/*
	 * Opens the database and returns a connection
	 */
	public Connection openDatabase() {

		Connection con = null;

		/*
		 * Showing error for some reason
		 */
		//		try {
		//			DriverManager.registerDriver(new com.ibm.db2.jcc.DB2Driver());
		//		} catch(Exception e) {
		//			e.printStackTrace();
		//		}

		String url = "jdbc:db2://comp421.cs.mcgill.ca.50000/cs421";

		try {
			con = DriverManager.getConnection(url, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	/*
	 * Closes the database connection
	 */
	public void closeDatabase(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * This is for general querying
	 */
	public ResultSet queryDatabase(Connection con, String query) {
		ResultSet results = null;
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			results = stmt.executeQuery(query);
			
			stmt.close();
			return results;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
