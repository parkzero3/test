package loopexample;

public class BreakeExample {

	public static void main(String[] args) {
		
		int sum= 0;
		int num;
		for(num =1; ; num++) {
			sum+= num;
			if( sum >= 100) { //  num ++ 증감이 이루어지기 전에 브레이크 원하는 14 값을 얻을수있음 
				break;
			}
		}
		System.out.println(sum);
		System.out.println(num);
		
	}

}
