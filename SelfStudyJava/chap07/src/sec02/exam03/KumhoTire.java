package sec02.exam03;

public class KumhoTire extends Tire{
    //필드
        //생성자
            public KumhoTire(String location, int maxRotation) {
                super(location, maxRotation);
            }

            @Override
            public boolean roll() {
                ++accmulatedRotation; //누적 회전수 1 증가
                if(accmulatedRotation<maxRotation) { //정상 회전( 누적 < 최대 ) 일 경우에 실행)
                    System.out.println(location + "KumhoTire 수명: " + (maxRotation- accmulatedRotation) + "회");
                    return true;
                } else { //펑크(누적 = 최대 )일 경우 실행
                    System.out.println("" + location + "KumhoTire 펑크 ");
                    return false;
                }
            }
}