package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer()); // 4바이트 이기때문에 4출력
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		rf.seek(0);  // 처음위치로 이동시키기
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		rf.close();
	}

}
