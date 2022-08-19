package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.BookPojo;

public class BookDaoJdbcImpl implements BookDao{

	// next week once we have session on Collections we will change the return type of this method to a collection
	@Override
	public BookPojo[] getAllBooks() {
		Connection connection = DBUtil.makeConnection();
		BookPojo[] fetchedBooks = null;
		try {
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM book_details";
			ResultSet rs = stmt.executeQuery(query);
			
			// create an array whose size is the same as the number of record available in the rs
			
			// first let us find out the number of records in the rs
			int counter = 0;
			while(rs.next()) {
				counter++;
			}
			// now create the BookPojo array
			fetchedBooks = new BookPojo[counter];
			
			// iterating through the rs and copying it into the array
			int i = 0;
			rs.beforeFirst();
			while(rs.next()) {
				fetchedBooks[i] = new BookPojo();
				fetchedBooks[i].setBookId(rs.getInt(1));
				fetchedBooks[i].setBookTitle(rs.getString(2));
				fetchedBooks[i].setBookAuthor(rs.getString(3));
				fetchedBooks[i].setBookGenre(rs.getString(4));
				fetchedBooks[i].setBookCost(rs.getInt(5));
				fetchedBooks[i].setBookImageUrl(rs.getString(6));	
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return the array of book pojo objects
		return fetchedBooks;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		Connection connection = DBUtil.makeConnection(); // step 1 and 2 is done in this
		
		String query = "INSERT INTO book_details(book_title, book_author, book_genre, book_cost, book_image_url) VALUES(?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			pstmt.setString(1, bookPojo.getBookTitle());
			pstmt.setString(2, bookPojo.getBookAuthor());
			pstmt.setString(3, bookPojo.getBookGenre());
			pstmt.setInt(4, bookPojo.getBookCost());
			pstmt.setString(5, "");
			
			pstmt.executeUpdate();
			
			// what is pending is , get the auto generated book id and set it into the bookPojo and return the book pojo
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookPojo;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
Connection connection = DBUtil.makeConnection(); // step 1 and 2 is done in this
		
		String query = "UPDATE book_details SET book_cost=? WHERE book_id=?";
		try {
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			pstmt.setInt(1, bookPojo.getBookCost());
			pstmt.setInt(2, bookPojo.getBookId());
						
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookPojo;
	}

	@Override
	public void deleteBook(int bookId) {
		Connection connection = DBUtil.makeConnection();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			String query = "DELETE FROM book_details WHERE book_id=" + bookId;
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public BookPojo getABook(int bookId) {
		Connection connection = DBUtil.makeConnection();
		Statement stmt = null;
		BookPojo bookPojo = null;
		try {
			stmt = connection.createStatement();
			String query = "SELECT * FROM book_details WHERE book_id=" + bookId;
			ResultSet rs = stmt.executeQuery(query);
			// traverse the rs
			// as i traverse i would copy the contents into a book pojo object
			while(rs.next()) {
				bookPojo = new BookPojo();
				bookPojo.setBookId(rs.getInt(1));
				bookPojo.setBookTitle(rs.getString(2));
				bookPojo.setBookAuthor(rs.getString(3));
				bookPojo.setBookGenre(rs.getString(4));
				bookPojo.setBookCost(rs.getInt(5));
				bookPojo.setBookImageUrl(rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookPojo;
	}

}
