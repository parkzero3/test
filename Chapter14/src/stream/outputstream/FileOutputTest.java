package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt" , true)){  // true 작성시 계속 append 됨
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
