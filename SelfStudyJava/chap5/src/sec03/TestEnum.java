package sec03;
import java.util.Calendar;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: 
			today = Week.SUNDAY; break;
			
		case 2:
			today = Week.MONDAY;break;
			
		case 3:
			today = Week.TUESDAY;break;
			
		case 4:
			today = Week.WEDNEDAY;break;
			
		case 5:
			today = Week.THURSDAY;break;
			
		case 6:
			today = Week.FRIDAY;break;
			
		case 7:
			today = Week.SATURDAY;break;
		}
		System.out.println("오늘 요일 :" + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일은 영화를 봅니다");
		}else {
			System.out.println("열심히 코딩을 합니다.");
		}
		
//		열거형
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("FAIL_PASSWORD");
		}else if (result == LoginResult.FAIL_ID) {
			System.out.println("FAIL_ID");
		}else {
			System.out.println("SUCCESS");
		}
	}

}
