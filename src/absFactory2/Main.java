package absFactory2;

import absFactory2.abs.Button;
import absFactory2.abs.GuiFactory;
import absFactory2.abs.TextArea;
import absFactory2.concrete.FactoryInstance;


public class Main {

    public static void main(String[] args) {
        //GuiFactory guiFactory = new LinuxGuiFactory();
        //GuiFactory guiFactory = new MacGuiFactory();
        GuiFactory guiFactory = FactoryInstance.getGuiFactory();

        Button button = guiFactory.createButton();
        TextArea area = guiFactory.createTextArea();

        System.out.println(area.getText());
        button.click();

    }

}
