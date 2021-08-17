package builder;

public class ComputerFactory {

    private Blueprint print;

    public void setBlueprint(Blueprint print){
        this.print = print;
    }

    public void make(){
        print.setCpu();
        print.setRam();
        print.setStorage();
    }


    public Computer getComputer() {
        return print.getComputer();
    }

}
