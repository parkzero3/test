package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl(); //인터페이스 사용시
		impl.makeString("hello", "world");

		StringConcat concat = (s,v)->System.out.println(s+","+v); //람다식
		concat.makeString("hello", "world");
		
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
				
			}
			
		};
		concat2.makeString("hello", "world");
				
	}

}
