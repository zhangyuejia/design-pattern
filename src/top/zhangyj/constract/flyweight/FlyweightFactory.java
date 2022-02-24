package top.zhangyj.constract.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Flyweight> pool = new HashMap<String, Flyweight>();
    public static Flyweight getFlyweight(String entrinsic){
        Flyweight flyweight;
        if(pool.containsKey(entrinsic)){
            flyweight = pool.get(entrinsic);
        }else{
            flyweight = new ContreteFlyweight1(entrinsic);
            pool.put(entrinsic, flyweight);
        }
        return flyweight;
    }
}
