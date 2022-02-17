import java.util.*;
public class Graph{

    
    static void addEdge(ArrayList<ArrayList<Integer>> ob, int s, int d)
    {
        ob.get(s).add(d);
        ob.get(d).add(s);
    }

    public static void main(String sd[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int V=sc.nextInt();
        ArrayList<ArrayList<Integer>> am=new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<V;i++)
        {
            am.add(new ArrayList<Integer>());
        }

        boolean flag=false;

        do{
            System.out.println("Enter source and destination");
            int s=sc.nextInt();
            int d=sc.nextInt();
            addEdge(am,s,d);

            System.out.println("Do you wish to continue Y/n");
            char a=sc.next().charAt(0);

            if(a=='n')
            flag=true;
        }while(flag!=true);

        printGraph(am);

        sc.close();
    }

    static void printGraph(ArrayList<ArrayList<Integer>> am)
    {
        for(int i=0;i<am.size();i++)
        {
            System.out.println("\nVertex"+i+":");
            for(int j=0;j<am.get(i).size();j++)
            {
                System.out.print("->"+am.get(i).get(j));
            }
            System.out.println();
        }
    }
}