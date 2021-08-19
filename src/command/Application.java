package command;

import java.util.PriorityQueue;

public class Application {

    public static void main(String[] args) {

        PriorityQueue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("가나다라"));
        queue.add(new StringPrintCommand("가"));
        queue.add(new StringPrintCommand("가나다"));
        queue.add(new StringPrintCommand("가나"));
        queue.add(new StringPrintCommand("가나다라마"));


        for(Command command : queue){
            command.execute();
        }
    }
}
