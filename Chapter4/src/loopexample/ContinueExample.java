package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		
		int num;
		for(num =1; num <=100; num++) {
			
			if((num % 3) !=0) continue ; // 3의 배수가 아닌 경우 출력
			System.out.println(num);			
		}

	}

}
