package facade.in.system;

class HelpSystem01 {

    public HelpSystem01() {
        System.out.println("생성자 호출 : " + getClass().getSimpleName());
    }

    public void process(){
        System.out.println("프로세스 호출 : " + getClass().getSimpleName());
    }
}
