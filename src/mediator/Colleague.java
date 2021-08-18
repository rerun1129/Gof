package mediator;

public abstract class Colleague {

    private Mediator mediator;          //자기가 어느 중재자에게 속해있는지 알기위해서 정의함

    public boolean join(Mediator mediator){
        if(mediator == null){
            return false;
        }
        this.mediator = mediator;
       return mediator.addColleague(this);
    }
    public void sendData(String data){
        if(mediator != null){
            mediator.mediation(data);
        }
    }
    abstract public void handle(String data);
}
