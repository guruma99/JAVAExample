package sec02.exam06;

public class ArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];
		
//		System.out.println(mathScores.length);
//		System.out.println(mathScores[0].length);
		
		int cnt = 0;
		for(int i = 0; i < mathScores.length; i++) {
			for(int k = 0; k < mathScores[i].length; k++) {
				mathScores[i][k] = ++cnt;
				System.out.println(mathScores[ i ][ k ] + "   ");
			}
			System.out.println();
		}
		
		
		int [][] javaScores = {{95, 67, 78},{55, 77, 88}};
		
		for(int i = 0; i < javaScores.length; i++) {
			for(int k = 0; k < javaScores[i].length; k++) {
				System.out.print(javaScores[ i ][ k ] + "   ");
			}
			System.out.println();
		}
		
	}

}
