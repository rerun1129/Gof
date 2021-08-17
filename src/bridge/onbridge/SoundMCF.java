package bridge.onbridge;

public class SoundMCF implements MorseCodeFunction {
    @Override
    public void dot() {
        System.out.print("단음");
    }

    @Override
    public void dash() {
        System.out.print("장음");
    }

    @Override
    public void space() {
        System.out.print("묵음");
    }
}
