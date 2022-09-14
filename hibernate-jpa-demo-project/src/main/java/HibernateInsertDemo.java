import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateInsertDemo {

	public static void main(String[] args) {
		// 1. obtain the sessionFactory
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println("sessionFactory obtained...");
		
		// 2. open a session from the sessionFactory
		Session session = sessionFactory.openSession();
		System.out.println("session opened....");
		
		// 3. perform the CRUD operation
		// 3.a create a new entity object
		Student newStudent = new Student(102, "LMN", 70);
		System.out.println("Student enitity object created...");
		
		// 3.b begin a transaction
		Transaction transaction = session.beginTransaction();
		System.out.println("transaction has started....");
		
		// 3.c save the newStudent entity object
		session.save(newStudent); // insert query is not executed here
		System.out.println("entity object saved....");
		
		// 3.d commit the transaction
		transaction.commit(); // the insert query is executed only when the transaction is committed
		System.out.println("transaction committed...");
		
		// 4. close the session
		session.close();
		System.out.println("session closed....");
		
		// 5. close the sessionFactory
		HibernateUtil.getSessionFactory().close();
		System.out.println("sessionFactory closed....");
	}

}
