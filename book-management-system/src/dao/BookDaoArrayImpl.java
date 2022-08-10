package dao;

import pojo.BookPojo;

public class BookDaoArrayImpl implements BookDao{

	// allBooks is my temporary database
	// i can hold a max of 20 books
	BookPojo[] allBooks = new BookPojo[20];
	
	public BookDaoArrayImpl() {
		// we are trying to have 3 books in the array when the program startups
		allBooks[0] = new BookPojo(101, "Harry Potter and the Goblet of Fire", "J.K.Rowling", "Fiction", 35 ,"");
		allBooks[1] = new BookPojo(102, "Harry Potter and the Half Blood Prince", "J.K.Rowling", "Fiction", 45 ,"");
		allBooks[2] = new BookPojo(103, "Harry Potter and the Order of Phoenix", "J.K.Rowling", "Fiction", 30 ,"");
	}
	
	@Override
	public BookPojo[] getAllBooks() {
		return allBooks;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookPojo getABook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
