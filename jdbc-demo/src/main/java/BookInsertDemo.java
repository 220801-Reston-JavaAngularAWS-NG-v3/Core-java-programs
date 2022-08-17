import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BookInsertDemo {

	public static void main(String[] args) {
		// steps for JDBC
		
		try {
			// Step 1 - Load the driver class
			// Driver is a class present in a package org.postgres
			// so we specify the fully qualified name of the class to be loaded
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded successfully...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Connection conn = null;
		try {
			// Step 2 - establish connection to the Database
			
			// here we provide 3 string arguments to the getConnection() method of DriverManager
			// 1st argument - connection url ( protocol, ipaddress, port)
			// 2nd argument - user name
			// 3rd argument - password
			// connection url should be in this format - <protocol>://<ipaddress>:<port>/<dbname>
			String connectionUrl = "jdbc:postgresql://localhost:5432/book_management_system";
			String userName = "postgres";
			String password = "root";
			conn = DriverManager.getConnection(connectionUrl, userName, password); // in this line java code will hit the DB and
																									// try to establish a connection to the DB server
			// if the connection was not successful then conn==null
			// if the connection was successfull then conn!=null
			if(conn != null) {
				System.out.println("Connection established...");
			}
			
			// Step 3 - create a statement and execute it
			// create the statement
			Statement stmt = conn.createStatement();
			// get the query ready and execute it
			String query = "INSERT INTO book_details(book_title, book_author, book_genre, book_cost, book_image_url) VALUES('Harry Potter and the Deathly Hallows', 'J.K.Rowling', 'Fiction', 50, '')";
			int rowsAffected = stmt.executeUpdate(query); // in this line java code will hit the DB and submit the query
															// the query gets compiled and executed at the DB server side 
															// and the response is received back into your java program
															// the response received here is an int variable
			System.out.println(rowsAffected + " rows inserted...");
			
			
			// Step 4 - handle the exception

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Step 5 - close the connection
			try {
				conn.close();// conn cannot be used here if it was declared locally to the try block
								// so for this reason we move the declaration of conn to outside(top) of the try block
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		
		
		
	}

}
