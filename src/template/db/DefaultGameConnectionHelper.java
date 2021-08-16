package template.db;

public class DefaultGameConnectionHelper extends GameConnectHelper {

    @Override
    protected String doSecurity(String str) {
        System.out.println("디코드");
        System.out.println("강화된 방식의 보안");

        return str;
    }

    @Override
    protected boolean authentication(String id, String pw) {
        System.out.println("아이디 암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        //서버에서 유저 아이디를 통해 유저 연령 확인/시간확인
        System.out.println("밤 10시 이후에는 접속할 수 없습니다.");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }
}
