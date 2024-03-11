package util;

import java.util.ArrayList;
import java.util.Objects;


public class Inventory<T> {
    private ArrayList<T> inventory; //랩핑 : 오리지날은 두고 덮어씌우는것

    public Inventory(ArrayList<T> inventory) {
        this.inventory = new ArrayList<>();
    }

    public void add(T t){
        inventory.add(t);
    }

    public T remove(int index){
        return inventory.remove(index);
    };

    public boolean contains(T t) {
        return inventory.contains(t);
    }

    public T get(int i) {
        return inventory.get(i);
    }

//    public void clear() {
//        modCount++;
//        final Object[] es = elementData;
//        for (int to = size, i = size = 0; i < to; i++)
//            es[i] = null;
//    }


}


