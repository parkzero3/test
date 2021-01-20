package string;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String ("java");
		String android = new String ("android");
		
		StringBuilder buffer = new StringBuilder();
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append("android");
		
		java = buffer.toString();
		System.out.println(System.identityHashCode(buffer));
	}

}
