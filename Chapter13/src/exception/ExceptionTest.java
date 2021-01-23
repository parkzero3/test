package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	//AutoCloseable 
	//colse() 를 명시하지 않아도 자동으로 close를 시킴 
	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} 
	}
}
