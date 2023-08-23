package sec02.exam01;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int a = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = ++a;
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}

}
