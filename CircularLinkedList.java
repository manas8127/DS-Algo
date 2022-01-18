public class CircularLinkedList {
    

    static class Node{

        int value;
        Node next;

        Node(int d)
        {
            value=d;
            next=null;
        }
    }

    public static void main(String sd[])
    {
        Node one=new Node(5);
        Node two=new Node(6);
        Node three=new Node(7);

        one.next=two;
        two.next=three;
        three.next=one;

        System.out.println(three.next.value);
    }
}
