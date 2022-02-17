import java.util.*;
public class Graphlist {
    
    private LinkedList<Integer> adj[];

    // @SuppressWarnings({"unchecked"})
    public Graphlist(int v)
    {
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public static void main(String sd[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of vertices and edges");

        int v=sc.nextInt();
        int e=sc.nextInt();

        Graphlist graph=new Graphlist(v);

        System.out.println("Enter "+e+" edges:");

        for(int i=0;i<e;i++)
        {
            int source=sc.nextInt();
            int destination=sc.nextInt();

            graph.addEdge(source, destination);
            
        }

        sc.close();
    }

}
