package sec01.exam03;

public class SmartTelevision2 extends Television implements Searchable  {
	
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");
	}
}
