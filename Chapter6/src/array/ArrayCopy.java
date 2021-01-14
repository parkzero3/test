package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5};
		
		System.arraycopy(arr1, 0, arr2, 1, 3); // 배열 복사하기  (어디에서/ 몇번째부터/  어디에다가 /몇번째부터 /몇번째까지)
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
