package loopexample;

public class BreakeExample {

	public static void main(String[] args) {
		
		int sum= 0;
		int num;
		for(num =1; ; num++) {
			sum+= num;
			if( sum >= 100) { //  num ++ ������ �̷������ ���� �극��ũ ���ϴ� 14 ���� ���������� 
				break;
			}
		}
		System.out.println(sum);
		System.out.println(num);
		
	}

}
