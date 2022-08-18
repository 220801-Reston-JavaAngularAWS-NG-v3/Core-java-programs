package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.BookPojo;

public class BookDaoJdbcImpl implements BookDao{

	@Override
	public BookPojo[] getAllBooks() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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
			// as i traverse i would copy the contetns into a book pojo object
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
