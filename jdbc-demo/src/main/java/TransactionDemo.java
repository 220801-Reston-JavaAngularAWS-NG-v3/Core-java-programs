import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

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
					String connectionUrl = "jdbc:postgresql://localhost:5432/sample";
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
					// here I should execute 2 update queries
					
					String query1 = "UPDATE account_details SET account_balance=account_balance-100 WHERE account_id=22222";
					String query2 = "UPDATE account_details SET account_balance=account_balance+100 WHERE account_id=11111";
					
					Statement stmt = conn.createStatement();
					
					// begin the transaction which will set the auto commit to false
					conn.setAutoCommit(false); // any changes made to the table after this line is not permamnently reflected 
					
					stmt.executeUpdate(query1);
					
						// lets say for some reason the DB server crashed
					
					stmt.executeUpdate(query2);
					
					// commit the transaction
					conn.commit(); // here both the update queries will be reflected in the DB permanenlty
					
					
					// Step 4 - handle the exception

				} catch (SQLException e) {
					try {
						// in order for rollback to take place purposefully make a syntax error in query2
						conn.rollback(); // if the DB crashes that is going to come back as a exception to your program
										// so the right place to roll back is the catch block
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
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
