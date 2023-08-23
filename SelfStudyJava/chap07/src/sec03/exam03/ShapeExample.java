package sec03.exam03;

public class ShapeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[3];
//		참조변수
		s[0] = new Circle(3);
		s[1] = new Rect(4,5);
		s[2] = new Box(2,3,4);
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString() + " : " + s[i].area());
		}
	}

}
