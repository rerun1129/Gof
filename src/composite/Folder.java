package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

    public Folder(String name) {
        super(name);
    }

    public List<Component> getChildren() {
        return children;
    }

    List<Component> children = new ArrayList<>();

    public boolean addComponent(Component component){
       return children.add(component);              //기본적으로 list의 add, remove는 boolean 값을 리턴한다.
    }

    public boolean removeComponent(Component component){
        return children.remove(component);
    }

}
