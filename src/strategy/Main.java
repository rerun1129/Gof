package strategy;

public class Main {

    public static void main(String[] args) {
        GC gc = new GC();

        gc.setWeapon(new Knife());
        gc.attack();
        gc.setWeapon(new Sword());
        gc.attack();
    }
}
