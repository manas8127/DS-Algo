public class DoublyLinkedList {
    
    Node head;
    static class Node{

        int value;
        Node next;
        Node prev;


        Node(int d)
        {
            value=d;
            next=null;
            prev=null;
        }
    }


    public static void main(String sd[])
    {   
        Node one=new Node(3);
        Node two=new Node(4);
        Node three=new Node(5);

        one.next=two;
        two.next=three;
        two.prev=one;
        three.prev=two;

        DoublyLinkedList list=new DoublyLinkedList();
        list.head=one;

        while(list.head!=null)
        {
            System.out.println(list.head.value);
            list.head=list.head.next;
        }

        System.out.println("Previous value of 4: "+two.prev.value);
    }

}
