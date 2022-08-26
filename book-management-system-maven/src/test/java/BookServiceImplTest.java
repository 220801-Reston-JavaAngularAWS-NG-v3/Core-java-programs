import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

import dao.BookDaoJdbcImpl;
import exception.ApplicationException;
import pojo.BookPojo;
import service.BookService;
import service.BookServiceImpl;
  
@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {

	@InjectMocks
	BookServiceImpl bookService = new BookServiceImpl();

	@Mock
	BookDaoJdbcImpl bookDao = new BookDaoJdbcImpl();
	
	@Test
	public void testGetABookWithoutMockito() {
		int bookId = 13;
		
		BookPojo expectedPojo = new BookPojo(13, "Dragons of the Ocean", "Stilton", "Commedy", 33, "");
		BookPojo actualPojo = null;
		
		BookService bookService = new BookServiceImpl();
		
		try {
			actualPojo = bookService.getABook(13); // here when i call a methodof the service layer, it in turn call a method of dao
														// according to unit testing the method that we are testing should be tested in isolation
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(expectedPojo, actualPojo); // in order for the assertion to check iof the book pojo are equal 
													// we should override equals and hashcode methods in the BookPojo class
	}
	
	@Test
	public void testGetABookWithMockito() {
		
		// define the mockito rule here
		
		BookPojo dummyBookPojo = new BookPojo(13, "Dragons of the Ocean", "Stilton", "Commedy", 33, "");
		try {
			when(bookDao.getABook(13)).thenReturn(new BookPojo(13, "Dragons of the Ocean", "Stilton", "Commedy", 33, ""));
			
		} catch (ApplicationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int bookId = 13;
		
		BookPojo expectedPojo = new BookPojo(13, "Dragons of the Ocean", "Stilton", "Commedy", 33, "");
		BookPojo actualPojo = null;
		
		// the stubbing in mockito was not working because of the below line
		// the bookService which is declared at the class level (annotated with @InjectMocks) should be used and not the local bookService created in the below line
		// so commenting the below line
		
		//BookService bookService = new BookServiceImpl();
		
		try {
			// the bookService declared at class level is used here
			actualPojo = bookService.getABook(13); // here when i call a methodof the service layer, it in turn call a method of dao
														// according to unit testing the method that we are testing should be tested in isolation
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(expectedPojo.getBookId(), actualPojo.getBookId()); // in order for the assertion to check if the book pojo are equal 
													// we should override equals and hashcode methods in the BookPojo class
	}
}
