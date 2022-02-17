import java.util.*;

public class GraphAlgo {

    static boolean visiteddfs[];
    
    static void edge(ArrayList<ArrayList<Integer>> am, int s, int d)
    {
        am.get(s).add(d);
        am.get(d).add(s);

    }

    public static void main(String sd[])
    {

        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();

        ArrayList<ArrayList<Integer>> am=new ArrayList<ArrayList<Integer>>(V);
        visiteddfs=new boolean[V];

        for(int i=0;i<V;i++)
        {
            am.add(new ArrayList<Integer>());
        }

        int e=sc.nextInt();

        for(int i=0;i<e;i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            edge(am,s,d);
        }

        printArray(am);

        BFS(0,am,V);

        System.out.println("DFS Traversal");
        DFS(0, am, V);

        sc.close();
    

    }

   
    static void DFS(int start, ArrayList<ArrayList<Integer>> am,int V)
    {
        
        visiteddfs[start]=true;
        System.out.println(start+" ");

        Iterator<Integer> ite = am.get(start).listIterator();
        while(ite.hasNext())
        {
            int adj=ite.next();
            if(!visiteddfs[adj])
            DFS(adj, am, V);
        }

    }

    static void BFS(int start, ArrayList<ArrayList<Integer>> am,int V)
    {
        boolean visited[]=new boolean[V];
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(start);
        System.out.println("BFS Traversal");
        visited[start]=true;
        while(q.isEmpty()==false)
        {
            int node=q.poll();
            System.out.println(node);
            for(int x:am.get(node))
            {
                if(visited[x]==false)
                {
                    visited[x]=true;
                    q.add(x);
                }
            }
        }

    }

    static void printArray(ArrayList<ArrayList<Integer>> am)
    {
        for(int i=0;i<am.size();i++)
        {
            System.out.println("For vertex "+i);
            for(int j=0;j<am.get(i).size();j++)
            {
                System.out.print("->"+am.get(i).get(j));
            }
            System.out.println();
        }
    }


}
