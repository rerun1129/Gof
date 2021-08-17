package absFactory.brand2;

import absFactory.abst.BikeFactory;
import absFactory.abst.Body;
import absFactory.abst.Wheel;

public class Brand2BikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new Brand2Body();
    }

    @Override
    public Wheel createWheel() {
        return new Brand2Wheel();
    }
}
