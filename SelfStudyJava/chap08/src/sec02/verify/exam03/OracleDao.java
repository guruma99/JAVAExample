package sec02.verify.exam03;

public class OracleDao implements DataAccessObject  {
//	4개를 구현 해줘야함
//	4개 abstract 메소드 구현
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	
	public void insert() {
		System.out.println("Oracle DB에서 레코드 추가");
	}
	
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}
	
	public void delete() {
		System.out.println("Oracle DB에서 데이터 삭제");
	}
}
