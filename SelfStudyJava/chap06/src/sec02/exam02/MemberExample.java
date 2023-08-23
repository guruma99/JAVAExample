package sec02.exam02;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("여상현", 26);
		Member member1 = new Member("이미경", "lee", "lee2", 30);
		Member user1 = new Member("홍길동", "hong");
//		member.name = "여상현";
//		member.age = 26;
		
//		메소드 받을려면 변수가 필요함
		member.setId("aaa");
		member.setPass("asdsad");
		member.printMemberInfo();
		member1.printMemberInfo();
	}

}


