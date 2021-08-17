package singleton;

public class SystemSpeaker {

    static private SystemSpeaker instance;    //인스턴스가 하나만 존재하기 때문에 static을 쓴다.

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private SystemSpeaker(){
        volume = 5;
    }

    public static SystemSpeaker getInstance(){
        if(instance == null){                   //인스턴스가 하나만 필요하기 때문에 instance == null 인 조건이 필요하다.
            instance = new SystemSpeaker();
            System.out.println("새로 생성");
        }else {
            System.out.println("이미 생성");
        }
        return instance;
    }
}
