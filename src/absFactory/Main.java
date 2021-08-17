package absFactory;

import absFactory.abst.BikeFactory;
import absFactory.abst.Body;
import absFactory.abst.Wheel;
import absFactory.brand.BrandFactory;
import absFactory.brand2.Brand2BikeFactory;

public class Main {

    public static void main(String[] args) {
        //BikeFactory factory = new BrandFactory();
        BikeFactory factory = new Brand2BikeFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }

}
