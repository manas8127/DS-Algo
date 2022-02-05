import java.util.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data=d;
    }
}


public class Practise
{

    Node head;

    static void print(Node head)
    {
        Node k=head;
        while(k!=null)
        {
            System.out.println(k.data);
            k=k.next;
        }
    }

    public static void main(String[] args) {
        
    Practise ob=new Practise();
    ob.head=new Node(3);
    ob.head.next=new Node(4);
    ob.head.next.next=new Node(5);

    print(ob.head);


    }



}