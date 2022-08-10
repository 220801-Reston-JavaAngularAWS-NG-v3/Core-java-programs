import java.util.Scanner;

import pojo.BookPojo;
import service.BookService;
import service.BookServiceImpl;


public class BookPresentation {

	public static void main(String[] args) {

		// here we will have the input and the outputs
		// the menus are displayed here
		
		// presentation layers calls the methods of the service layer
		// so i need an object of BookServiceImpl
		BookService bookService = new BookServiceImpl(); // always the interface reference variable should point to the object of the implementation class
		
		Scanner scan = new Scanner(System.in);
		char continueApp = 'y';

		while (continueApp == 'y' || continueApp == 'Y') {

			System.out.println("*************************************************");
			System.out.println("\t\tBOOK MANAGEMENT SYSTEM");
			System.out.println("*************************************************");
			System.out.println("MAIN MENU");
			System.out.println("*************************************************");
			System.out.println("1. List all the books.");
			System.out.println("2. Add a new book.");
			System.out.println("3. Update a book.");
			System.out.println("4. Delete a book.");
			System.out.println("5. Fetch a book");
			System.out.println("6. Exit.");
			System.out.println("*************************************************");
			System.out.println("Please enter an option : ");
			int option = scan.nextInt();
			System.out.println("*************************************************");
			switch (option) {
			case 1:
				// will remove this statement later an dput the actual code here
				// System.out.println("Listing all the books....");
				
				BookPojo[] fetchedAllBooks = bookService.getAllBooks();
				System.out.println("=============================================================================");
				System.out.println("ID\tTITLE\t\t\t\t\tAUTHOR\t\tGENRE\tCOST");
				System.out.println("=============================================================================");
				for(int i=0;i<fetchedAllBooks.length;i++) {
					if(fetchedAllBooks[i] != null) {
						System.out.println(fetchedAllBooks[i].getBookId() + "\t" + fetchedAllBooks[i].getBookTitle() + "\t" + fetchedAllBooks[i].getBookAuthor() + "\t" + fetchedAllBooks[i].getBookGenre() + "\t" + fetchedAllBooks[i].getBookCost());
					}
				}
				System.out.println("=============================================================================");
				break;
			case 2:
				// will remove this statement later an dput the actual code here
				System.out.println("Adding a book....");
				break;
			case 3:
				// will remove this statement later an dput the actual code here
				System.out.println("Updating a book....");
				break;
			case 4:
				// will remove this statement later an dput the actual code here
				System.out.println("Deleting a book....");
				break;
			case 5:
				// will remove this statement later an dput the actual code here
				System.out.println("Fetching a book....");
				break;
			case 6:
				System.out.println("*************************************************");
				System.out.println("THANKYOU FOR USING BOOK MANAGEMENT SYSTEM!!");
				System.out.println("*************************************************");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a valid option!!");

			}
			System.out.println("*************************************************");
			System.out.println("Do you want to continue(y/n) ?");
			continueApp = scan.next().charAt(0); // taking out the first character of the string that was given as input
			// here
		}
		System.out.println("*************************************************");
		System.out.println("THANKYOU FOR USING BOOK MANAGEMENT SYSTEM!!");
		System.out.println("*************************************************");

	}

}
