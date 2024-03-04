package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.checkIndex;
import static java.util.Objects.hash;

public class Box <T>{
    private Map<String, T> box;

    public Box() {
        this.box = new HashMap<>();
    }
    public void put(List<String> keys, Inventory<T> values){
        box=new HashMap<>();
        for(int i=0; i<keys.size();i++){
            box.put(keys.get(i),values.get(i));
        }
        box.forEach((k,v)-> System.out.println(String.format("%s: %s",k,v)));
    }
    public T put(String key, T t) {
        return box.put(key, t);
    }

    public T get(String key) {
        return box.get(key);
    }

    public int size(){
        return box.size();
    }

    public void clear(){
        box.clear();
    }
}
