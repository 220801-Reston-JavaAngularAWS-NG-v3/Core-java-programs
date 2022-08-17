import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookSelectDemo {

	public static void main(String[] args) {
		// steps for JDBC
		
				try {
					// Step 1 - Load the driver class
					Class.forName("org.postgresql.Driver");
					System.out.println("Driver loaded successfully...");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} 
				
				Connection conn = null;
				try {
					// Step 2 - establish connection to the Database
					String connectionUrl = "jdbc:postgresql://localhost:5432/book_management_system";
					String userName = "postgres";
					String password = "root";
					conn = DriverManager.getConnection(connectionUrl, userName, password); // in this line java code will hit the DB and
		
					if(conn != null) {
						System.out.println("Connection established...");
					}
					
					// Step 3 - create a statement and execute it
					Statement stmt = conn.createStatement();
					String query = "SELECT * FROM book_details";
					ResultSet rs = stmt.executeQuery(query); 
					// now we have to traverse the rs and take out all the data
					while(rs.next()) {
						
						// rs.next() does 2 things
								// first moves the pointer to the next record
								// second returns true or false based whether a record is presnt or not
						
						
						// now take out each column's info
						int bookId = rs.getInt(1);
						String bookTitle = rs.getString(2);
						String bookAuthor = rs.getString(3);
						String bookGenre = rs.getString(4);
						int bookCost = rs.getInt(5);
						
						System.out.println(bookId + "\t\t" + bookTitle + "\t\t" + bookAuthor + "\t\t" + bookGenre + "\t\t" + bookCost);
					}
					
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
