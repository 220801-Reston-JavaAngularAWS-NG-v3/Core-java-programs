import org.hibernate.Session;

public class HibernateFetchDemo {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Student fetchedStudent = session.find(Student.class, 101);
		System.out.println(fetchedStudent);
		
		session.close();
		HibernateUtil.getSessionFactory().close();
		

	}

}
