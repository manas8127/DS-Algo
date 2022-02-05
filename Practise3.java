public class Practise3 {
    
 static class Node{

    int data;
    Node next;

    Node(int d)
    {
        data=d;
    }

 }

 static int findelement(Node head, int k, int n)
 {
    Node work=head;
    n=n-1;
    if(k>n)
    {
        return 0;
    }
    for(int i=0;i<=n;i++)
    {
        if(i==(n-k))
        {
          return work.data;   
        }
        work=work.next;
    }


    return 18;
 }

 public static void main(String[] args) {
    
    Node head=new Node(3);
    head.next=new Node(4);
    head.next.next=new Node(5);

    int k=findelement(head, 2, 3);
    System.out.println(k);

 }

}
