package bridge.nonbridge;

public class PrintMorseCode extends MorseCode {

    //garam(알파벳을 다 구현할 수 없기 때문에 일부만)

    public PrintMorseCode g() {
        dash();
        dash();
        dot();
        space();
        return this;
    }

    public PrintMorseCode a() {
        dot();
        dash();
        space();
        return this;
    }

    public PrintMorseCode r() {
        dot();
        dash();
        dot();
        space();
        return this;

    }

    public PrintMorseCode m() {
        dash();
        dash();
        space();
        return this;
    }

}
