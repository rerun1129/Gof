package absFactory2.concrete;

import absFactory2.abs.Button;
import absFactory2.abs.GuiFactory;
import absFactory2.abs.TextArea;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {


        switch (2) {
            case 0:
                return new MacGuiFactory();
            case 1:
                return new WinGuiFactory();
            case 2:
                return new LinuxGuiFactory();
        }
        return null;
    }

    private static int getOsCode(){
        if(System.getProperty("os.name").equals("Mac OS X")){
            return 0;
        }
        return 1;
    }
}



//리눅스 공장
class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("리눅스 버튼 클릭");
    }
}

class LinuxGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}

class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "리눅스 텍스트에리어";
    }
}



//맥 공장
class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("맥 버튼 클릭");
    }
}

class MacGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}

class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "맥 텍스트에리어";
    }
}


//윈도우 공장

class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("윈도우 버튼 클릭");
    }
}

class WinGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}

class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "윈도우 텍스트에리어";
    }
}