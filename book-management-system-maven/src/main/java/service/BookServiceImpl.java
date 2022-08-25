package service;

import java.util.List;

import exception.ApplicationException;
import dao.BookDao;
import dao.BookDaoJdbcImpl;
import pojo.BookPojo;

public class BookServiceImpl implements BookService{

	// fill in the code later for each methods 
	// will fill in after the dao layer is done
	
	// BookDao interface reference variable
	BookDao bookDao; // this is the preferred way as the class is abstracted through the interface reference variable
	
	//BookDaoArrayImpl bookDao; // is highly not recomended as we need to abstract the class
		
	public BookServiceImpl() {
		// the interface reference variable points to the jdbc implementation class
		bookDao = new BookDaoJdbcImpl();
	}

	// the methods in my service layer don't do anything much, they just call the respective dao methods
	@Override
	public List<BookPojo> getAllBooks()throws ApplicationException {
		return bookDao.getAllBooks();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo)throws ApplicationException {
		return bookDao.addBook(bookPojo);
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo)throws ApplicationException {
		return bookDao.updateBook(bookPojo);
	}

	@Override
	public void deleteBook(int bookId)throws ApplicationException {
		bookDao.deleteBook(bookId);
	}

	@Override
	public BookPojo getABook(int bookId)throws ApplicationException {
		return bookDao.getABook(bookId);
	}

}
