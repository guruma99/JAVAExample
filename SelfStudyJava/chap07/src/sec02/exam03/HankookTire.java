package sec02.exam03;

public class HankookTire extends Tire{

    //필드
    //생성자
        public HankookTire(String location, int maxRotation) {
            super(location, maxRotation);
        }

        @Override
        public boolean roll() {
            ++accmulatedRotation; //누적 회전수 1 증가
            if(accmulatedRotation<maxRotation) { //정상 회전( 누적 < 최대 ) 일 경우에 실행)
                System.out.println(location + "HankookTire 수명: " + (maxRotation- accmulatedRotation) + "회");
                return true;
            } else { //펑크(누적 = 최대 )일 경우 실행
                System.out.println("" + location + "HankookTire 펑크 ");
                return false;
            }
        }
}