package COR2;

public class Application {

    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);

        armor1.setNextDefense(armor2);
        armor1.defense(attack);

        System.out.println(attack.getAmount());



    }
}
