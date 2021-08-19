package flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {

    Map<String,Flyweight> pool;

    public FlyweightFactory() {
        pool = new TreeMap<>();
    }


    public Flyweight getFlyweight(String key){

        Flyweight flyweight = pool.get(key);        //재사용

        if(flyweight == null){
            flyweight = new Flyweight(key);

            pool.put(key,flyweight);    // Treemap 에 들어가서 자리를 차지하고 나중에 getFlyweight 가 호출되면
            // null 일시에 새로 생성       // null 이 아님을 검증한다.
            System.out.println("새로 생성");
        }else {
            System.out.println("재사용");
        }

        return flyweight;
    }

}
