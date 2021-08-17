package bridge.onbridge;

public class FlashMCF implements MorseCodeFunction{

    @Override
    public void dot() {
        System.out.print("단광");
    }

    @Override
    public void dash() {
        System.out.print("장광");
    }

    @Override
    public void space() {
        System.out.print("무광");
    }

}
