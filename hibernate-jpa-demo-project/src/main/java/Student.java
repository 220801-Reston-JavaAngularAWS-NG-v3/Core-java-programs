import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // this annotation tells hibernate that this is an entoty class which will be mapped to a table in the DB
			// make sure to import javax.persistence.Entity - because this follows the JPA specification
@Table(name="student_table") // this says we are mapping the Student class to student_details table in the DB
public class Student {

		@Id // this tells hibernate that this is the primary key
		@Column(name="stud_id")
		private int studentId;
		
		@Column(name="stud_name")
		private String studentName;
		
		@Column(name="stud_score")
		private int studentScore;

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(int studentId, String studentName, int studentScore) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentScore = studentScore;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getStudentScore() {
			return studentScore;
		}

		public void setStudentScore(int studentScore) {
			this.studentScore = studentScore;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
					+ "]";
		}
}
