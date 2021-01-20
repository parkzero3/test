package object;

class Book implements Cloneable{  // 복제시 임플리먼트 선언해줘야함
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override  
	protected void finalize() throws Throwable {  //GC 에서 사용됨  불리는 메서드가 아님.
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}
public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("토지", "박경리") ;
		
		System.out.println(book);  // 주소가 나오며 오버라이드 투스트링 하면 설정한 값이 나옴
		
		String str = new String("토지");
		System.out.println(str.toString());
		
		Book book2 = (Book)book.clone();
		
		System.out.println(book2);
		
		
	}

}
