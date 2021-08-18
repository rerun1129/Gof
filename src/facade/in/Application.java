package facade.in;

import facade.in.system.Facade;

public class Application {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();
    }
}
