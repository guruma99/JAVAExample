package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		생성자 없이도 객체는 만들어진다.
		CellPhone cp = new CellPhone("자바폰", "검정");
		DmbCellPhone dcp = new DmbCellPhone("자바폰","검정",10);
		System.out.println("모델 : " + dcp.model);
		System.out.println("색상 : " + dcp.color);
		System.out.println("채널 : " + dcp.channel);
		
//		부모클래스의 메소드
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요");
		dcp.receiveVoice("안녕하세요, 홍길동입니다.");
		dcp.sendVoice("반갑습니다.");
		
//		자식클래스의 메소드
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
		
		System.out.println(DmbCellPhone.NORMAL);
		System.out.println(dcp.ABNORMAL);
	}

}
