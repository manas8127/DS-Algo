import java.util.*;

public class Que {
    public static void main(String sd[])
    {
        Queue<String> ob=new LinkedList<>();

        ob.add("Manas");
        ob.add("Srivastava");
        ob.add("Practise");
        System.out.println(ob.contains("Manas"));
        System.out.println(ob.size());
        System.out.println(ob.toString());
        System.out.println(ob.peek());
        System.out.println(ob.toString());
        // System.out.println(ob.poll());
        System.out.println(ob.toString());
        System.out.println(ob.toArray()[1]);
        ob.remove("Manas");
        Iterator<String> ni
            = ob.iterator();

        while(ni.hasNext())
        {
            System.out.print(ni.next()+" ");
        }

    }
    


}
