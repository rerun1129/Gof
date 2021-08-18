package COR2;

public class Armor implements Defense{

    private Defense nextDefense;
    private int def;

    public void setDef(int def) {
        this.def = def;
    }

    public Armor(int def) {
        this.def = def;
    }

    @Override
    public void defense(Attack attack) {
        process(attack);            //if 문으로 없이 바로 프로세스를 호출할수도 있음.
        if(nextDefense != null){
            nextDefense.defense(attack);
        }
    }

    public void process(Attack attack){
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }

    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
}
