package sec01.exam03;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl[] rc = new RemoteControl[2];
        rc[0] = new Television();
        rc[1] = new Audio();

        for(int i=0; i<rc.length; i++) {
            rc[i].turnOn();
            rc[i].setVolume(13);
            rc[i].turnOff();
        }
    }
}