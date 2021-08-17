package builder;

public class LgBlueprint extends Blueprint {

    private Computer computer;

    public LgBlueprint() {

        computer = new Computer("디폴트","디폴트","디폴트");

    }

    @Override
    public Computer getComputer() {
        return computer;
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");

    }

    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }
}
