package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set); // ��ü���
		Iterator<String> ir = set.iterator(); //�ϳ��� ���
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
