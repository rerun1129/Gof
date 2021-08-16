package adapter;

public class AdapterImp implements Adapter{
    @Override
    public Float twiceOf(Float f) {
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        return (float)Math.half(f.doubleValue());
    }
}
