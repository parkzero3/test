package Practice;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.addBook("태백산맥1", "조정래");
		studentLee.addBook("태백산맥2", "조정래");
		
		Student studentKim = new Student(101, "Kim");
		studentKim.addBook("토지1", "김김김");
		studentKim.addBook("토지2", "김김김");
		studentKim.addBook("토지3", "김김김");
		
		
		Student studentCho = new Student(102, "Cho");
		studentCho.addBook("해리포터1", "해리");
		studentCho.addBook("해리포터2", "해리");
		studentCho.addBook("해리포터3", "해리");
		studentCho.addBook("해리포터4", "해리");
		studentCho.addBook("해리포터5", "해리");
		studentCho.addBook("해리포터6", "해리");
		
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();

	}

}
