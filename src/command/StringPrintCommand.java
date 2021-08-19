package command;

public class StringPrintCommand implements Command{

    protected String str;

    public StringPrintCommand(String str) {
        this.str = str;
    }
    @Override
    public void execute() {
        System.out.println(this.str);
    }
    @Override
    public int compareTo(Command o) {       //Comparable 을 커맨드가 상속받았으니까 추가로 구현해야됨
        StringPrintCommand other = (StringPrintCommand)o;
        return this.str.length() - other.str.length();
    }
}
