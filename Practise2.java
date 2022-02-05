public class Practise2 {
    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
        }
    }

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
        

        Node head=new Node(3);
        head.next=new Node(4);
        head.next.next=new Node(5);

        print(head);

    }

}
