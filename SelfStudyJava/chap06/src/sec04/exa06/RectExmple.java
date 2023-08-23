package sec04.exa06;

public class RectExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 인스턴스 생성시 필드(width, height) 초기화했을 경우,
		//areaRantangle()메소드 호출시 width,height 인수 필요없음
		Rect myRect = new Rect();
		System.out.println(myRect.areaRectangle());  //1
		
		Rect myRect1 = new Rect(8);
		System.out.println(myRect1.areaRectangle());  //64
		
		Rect myRect2 = new Rect(8,10);
		System.out.println(myRect2.areaRectangle());  //80
		
		//p265 필드, 생성자 정의하지 않았을 경우,
		//areaRantangle()메소드 호출시 width,height 인수 필요 
		System.out.println(myRect.areaRectangle(10)); //100
		
	}

}