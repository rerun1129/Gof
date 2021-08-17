package absFactory.brand;

import absFactory.abst.BikeFactory;
import absFactory.abst.Body;
import absFactory.abst.Wheel;

public class BrandFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new BrandBody();
    }

    @Override
    public Wheel createWheel() {
        return new BrandWheel();
    }
}
