package Practice;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.addBook("�¹���1", "������");
		studentLee.addBook("�¹���2", "������");
		
		Student studentKim = new Student(101, "Kim");
		studentKim.addBook("����1", "����");
		studentKim.addBook("����2", "����");
		studentKim.addBook("����3", "����");
		
		
		Student studentCho = new Student(102, "Cho");
		studentCho.addBook("�ظ�����1", "�ظ�");
		studentCho.addBook("�ظ�����2", "�ظ�");
		studentCho.addBook("�ظ�����3", "�ظ�");
		studentCho.addBook("�ظ�����4", "�ظ�");
		studentCho.addBook("�ظ�����5", "�ظ�");
		studentCho.addBook("�ظ�����6", "�ظ�");
		
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();

	}

}
