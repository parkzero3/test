package practice;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort Ascending");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort Descending");
		
	}

	@Override
	public void description() {
		
		Sort.super.description();
		System.out.println("BubbleSort ¿‘¥œ¥Ÿ.");

	}
	

}
