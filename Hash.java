import java.util.*;

public class Hash {
    
    public static void main(String sd[])
    {
        HashMap<Integer, Character> ob=new HashMap<>();

        ob.put(5,'a');
        ob.put(6,'b');
        ob.put(7,'c');

        //ob.remove(6);

        System.out.println(ob.containsValue('a'));
        System.out.println(ob.containsKey(5));
        System.out.println(ob.size());
        ob.replace(5,'d');
        ob.remove(6);
        System.out.println(ob);
    }
    
}
