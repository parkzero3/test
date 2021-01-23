package exception;

public class AutoCloseTest {

	public static void main (String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		
		try (obj){ // 버젼 9 이하에선 타입까지 작성해줘야함
			throw new Exception();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
