package practice;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort Ascending");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort Descending");	
	}

	@Override
	public void description() {
		
		Sort.super.description();
		System.out.println("QuickSort ¿‘¥œ¥Ÿ.");

	}
}
