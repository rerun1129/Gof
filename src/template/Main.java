package template;

import template.db.DefaultGameConnectionHelper;
import template.db.GameConnectHelper;

public class Main {

    public static void main(String[] args) {
        GameConnectHelper helper = new DefaultGameConnectionHelper();
        helper.requestConnection("아이디 암호 등 접속 정보");
    }

}
