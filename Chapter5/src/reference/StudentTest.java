package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 90);

		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 70);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}