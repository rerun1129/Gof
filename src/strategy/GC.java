package strategy;

public class GC {

    private Weapon weapon;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){

        if(weapon == null){
            System.out.println("맨손 공격");
            return;
        }
        //위임(어떤 것을 들고 있느냐에 따라서 공격형태가 달라짐)
        weapon.attack();
    }
}
