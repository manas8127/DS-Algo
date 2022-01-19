import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> ob = new Hashtable<Integer, Integer>();

        ob.put(1, 5);
        ob.put(3, 7);
        ob.put(4, 5);
        ob.put(7, 9);

        //ob.remove(7);
        System.out.println(ob);
    }
}
