package practice;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
	ArrayList<Book> bookList;
	int index;
	
	public Student (int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title, String author) {
		Book book = new Book();
		
		book.setBookName(title);
		book.setAuthor(author);
		
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(studentName + " 학생이 읽은책은 : " );
		
		for(Book book: bookList) {
			System.out.print(book.getBookName()+" ");
			System.out.print(book.getAuthor()+ " ");
		}
		System.out.println("입니다.");
	}
}
