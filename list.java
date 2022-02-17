import java.util.*;

public class list {
        

    public static void main(String sd[])
    {

        LinkedList<String> linky=new LinkedList<>();

        linky.add("Rob");
        linky.add("Alex");
        linky.add("Jose");

        // System.out.println(linky);

        // linky.clear();

        //linky.remove("Jose");
        //linky.removeLast();
        //linky.removeFirst();
        System.out.println(linky);

        linky.set(2,"Manas");

        
        System.out.println(linky.getLast());

        Iterator<String> ls=linky.iterator();
        while(ls.hasNext())
        {
            System.out.println(ls.next()+" ");
        }
    }


}
