package exception;

public class AutoCloseTest {

	public static void main (String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		
		try (obj){ // ���� 9 ���Ͽ��� Ÿ�Ա��� �ۼ��������
			throw new Exception();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
