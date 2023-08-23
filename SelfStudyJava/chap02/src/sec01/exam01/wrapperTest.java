package sec01.exam01;

public class wrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "10";
		byte value = Byte.parseByte(str);
		System.out.println(value);
		
		String str2 = "true";
		boolean value2 = Boolean.parseBoolean(str2);
		System.out.println(value2);
		
		int value3 = Integer.parseInt("10");
		String str3 = String.valueOf(value3);
		System.out.println(str3);
	}

}
