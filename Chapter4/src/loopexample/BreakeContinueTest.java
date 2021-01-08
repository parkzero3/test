package loopexample;

public class BreakeContinueTest {

	public static void main(String[] args) {
		
		int dan ; 
		int count ;
		
		for(dan =2 ; dan <= 9 ; dan++) {
			if((dan %2)!= 0) continue; // 짝수단만 출력
		
			for(count =1 ; count <=9; count++) {
				System.out.println(dan+"X"+count+"=" +dan*count);
				if ( count >= dan) break;
			}
			System.out.println();
		}

	}

}
