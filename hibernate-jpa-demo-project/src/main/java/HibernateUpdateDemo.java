import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateUpdateDemo {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Student fetchedStudent = session.find(Student.class, 101); // we first fecth the record that we want to update
		
		Transaction trans = session.beginTransaction(); // now perform the update within a transaction
		fetchedStudent.setStudentScore(100); // set the updated score for the fetched student 
		session.update(fetchedStudent);
		trans.commit(); // the update query is executed only when transaction is commited
		
		System.out.println(fetchedStudent);
		
		session.close();
		HibernateUtil.getSessionFactory().close();

	}

}
