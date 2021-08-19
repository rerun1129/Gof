package memento;

import memento.abc.Memento;
import memento.abc.Originator;

import java.util.Stack;

public class Application {

    public static void main(String[] args) {

        Stack<Memento> mementos = new Stack<>();

        Originator originator = new Originator();

        originator.setState("state 1");
        mementos.push(originator.createMemento());

        originator.setState("state 2");
        mementos.push(originator.createMemento());

        originator.setState("state 3");
        mementos.push(originator.createMemento());

        originator.setState("state final");
        mementos.push(originator.createMemento());

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());  //파이널이 나옴

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState()); //상태3

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState()); //상태2

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState()); //상태1


    }

}
