package state;

public class Light {

    protected LightState lightState;
    private LightState offState = new LightState() {
        @Override
        public void on() {

            System.out.println("불 켜짐");
            lightState = onState;

        }

        @Override
        public void off() {

            System.out.println("동작 없음");
            lightState = offState;
        }
    };

    private LightState onState = new LightState() {
        @Override
        public void on() {
            System.out.println("동작 없음");
            lightState = onState;
        }

        @Override
        public void off() {
            System.out.println("불 꺼짐");
            lightState = offState;
        }
    };


    public Light() {
        lightState = offState;
    }

    public void on(){
        lightState.on();

    }

    public void off(){
        lightState.off();

    }



}


interface LightState{

    void on();
    void off();

}
