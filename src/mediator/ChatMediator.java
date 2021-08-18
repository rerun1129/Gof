package mediator;

public class ChatMediator extends Mediator{

    @Override
    public void mediation(String data) {

        for (Colleague colleague : colleagues){
            //중재가능성이 있는 data
            colleague.handle(data);
        }
    }
}
