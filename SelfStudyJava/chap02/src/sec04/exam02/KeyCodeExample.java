package sec04.exam02;

public class KeyCodeExample {

//	throws Exception : 단순히 모니터에 예외 내용을 출려만 함
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int keyCode1, keyCode2;
		
//		System.in.read(); : 시스템이 가지고 있는 입력 장치에서 입력된 키코드를 읽어라 
//		키보드로 치는 것을 다 문자열로 받아들인다
//		System.out.print("첫번째 수 입력 : ");
//		keyCode1 = System.in.read();
//		System.out.print("두번째 수 입력 : ");
//		keyCode2 = System.in.read();
		
//		System.out.println(keyCode1);
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
//			113 == 'q'
			if(keyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}

}
