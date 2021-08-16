package template.db;

public abstract class GameConnectHelper {

    protected abstract String doSecurity(String str);

    protected abstract boolean authentication(String id, String pw);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);


    //템플릿 메서드
    public String requestConnection(String encodedInfo){

        //보안 작업(암호화된 문자열을 복호화한다)
       String decodedInfo = doSecurity(encodedInfo);
        //복호화된 것을 id, pw로 할당한다. 여기서는 대충 구현
        String id = "";
        String pw = "";
        if(!authentication(id,pw)){
            throw new Error("아이디 혹은 암호 불일치");
        }
        //유저 이름으로 인증함
        String userName= "";
        int i = authorization(userName);

        switch (i){
            case -1:
                throw new Error("셧다운");
            case 0://GM
                break;
            case 1://유료 회원
                break;
            case 2://무료 회원
                break;
            case 3://권한 없음
                break;
            default://기타
                break;
        }

        return connection(decodedInfo);
    }

}
