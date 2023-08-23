package sec03.exam03;

public class EscapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		\t : 탭만큼 띄움
//		\n : 줄바꿈(라인피드)
//		\r :캐리지 리턴 
//		\" : " 츨력
		System.out.println("번호\t이름\t작업");
		System.out.println("행 단위 출력\n");
		System.out.println("봄\\여름\\가을\\겨울");
		
		int value = 123;
		float f =3.141592f;
		System.out.printf("상품의 가격 : %d원\n",value);
		System.out.printf("소수3자리%5.2f", f);
	}

}
