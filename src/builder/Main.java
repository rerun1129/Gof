package builder;

public class Main {

    public static void main(String[] args) {


        ComputerFactory factory = new ComputerFactory();

        factory.setBlueprint(new LgBlueprint());

        factory.make();

        Computer computer = factory.getComputer();

        System.out.println(computer);

    }

}
