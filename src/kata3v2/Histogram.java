package kata3v2;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Histogram <T>{
    private final Map <T,Integer> map = new HashMap();

    public Integer get (T key){
        return this.map.get(key);
    }

    public Set<T> keySet(){
        return this.map.keySet();
    }

    public void increment(T key){
        this.map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
}