package sec03.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a; local variable ==> 사용전에 반드시 초기화 필요
		int[] oldIntArray = {1, 2, 3};
//		배열 == 참조 tc와 같은것
//		oldIntArray에다가 1,2,3 줘서 나머지 두개는 초기화되서 0으로 나옴
		int[] newIntArray = new int[5]; // 배열은 객체 ==> newIntArray[0]~[4] ==> 0으로 초기화
		
		for(int i = 0; i < oldIntArray.length; i++) {
//			oldIntArray에 있는 만큼 newIntArray에 저장시킴
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5]; // String 배열 생성 
		
//		arraycopy : 총 몇개를 복사를 할건가 new String[5]에다가 5개 배열 생성한다음 
//		oldStrArray = {"java","array","copy"}배열 3개넣은다음 나머지는 null이 나옴
//		❤️❤️❤️❤️❤️❤️❤️ A배열, A배열의 인덱스, B배열, B배열의 인덱스 , A배열의 길이 --> A배열의 A인덱스에서 B배열의 B인덱스부터 시작해서 A배열의 길이만큼 복사해라!
		System.arraycopy(oldStrArray, 0 , newStrArray, 0 , oldStrArray.length);
		System.out.println();
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
//		TestClass 클래스 가져오기 = new TestClass();
//		클래스가져오기.method1();
		TestClass tc = new TestClass();
		tc.method1(); // 0으로 초기화됨
		
//		public static void method1() {
//			System.out.println(this.a);
//		}
	}

}
