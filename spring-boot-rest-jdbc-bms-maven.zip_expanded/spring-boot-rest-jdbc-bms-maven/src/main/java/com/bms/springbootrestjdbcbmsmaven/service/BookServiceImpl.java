package com.bms.springbootrestjdbcbmsmaven.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bms.springbootrestjdbcbmsmaven.dao.BookDao;
import com.bms.springbootrestjdbcbmsmaven.dao.BookDaoJdbcImpl;
import com.bms.springbootrestjdbcbmsmaven.exception.ApplicationException;
import com.bms.springbootrestjdbcbmsmaven.pojo.BookPojo;

//@Component // use stereotype annotation @Service instead
@Service // this tells the spring framenwork that this class is a bean
public class BookServiceImpl implements BookService{

	// Logging Step 1 - obtain an instance of Logger
	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	
	// fill in the code later for each methods 
	// will fill in after the dao layer is done
	
	// BookDao interface reference variable
	@Autowired
	BookDao bookDao; // this is the preferred way as the class is abstracted through the interface reference variable
	
	//BookDaoArrayImpl bookDao; // is highly not recomended as we need to abstract the class
		
	public BookServiceImpl() {
		// the interface reference variable points to the jdbc implementation class
		// this line is no longer needed after we have autowired bookDao
		// bookDao = new BookDaoJdbcImpl();
	}

	// the methods in my service layer don't do anything much, they just call the respective dao methods
	@Override
	public List<BookPojo> getAllBooks()throws ApplicationException {
		logger.info("Entered getAllBooks() in service layer...");
		return bookDao.getAllBooks();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo)throws ApplicationException {
		logger.info("Entered getAllBooks() in service layer...");
		return bookDao.addBook(bookPojo);
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo)throws ApplicationException {
		logger.info("Entered getAllBooks() in service layer...");
		return bookDao.updateBook(bookPojo);
	}

	@Override
	public void deleteBook(int bookId)throws ApplicationException {
		logger.info("Entered getAllBooks() in service layer...");
		bookDao.deleteBook(bookId);
	}

	@Override
	public BookPojo getABook(int bookId)throws ApplicationException {
		logger.info("Entered getAllBooks() in service layer...");
		return bookDao.getABook(bookId);
	}

}
