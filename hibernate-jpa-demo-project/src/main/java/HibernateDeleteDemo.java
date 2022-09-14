import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateDeleteDemo {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Student fetchedStudent = session.find(Student.class, 101); // first fetch the student record that you would want to delete
		
		Transaction transaction = session.beginTransaction(); // perform the deletion within a transaction
		session.delete(fetchedStudent); // and then delete the student record 
		transaction.commit(); // the delete query is executed only when the transaction is commited
				
		session.close();
		HibernateUtil.getSessionFactory().close();
	}

}
