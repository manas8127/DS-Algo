public class Linklistmethod{

    Node head;

    static class Node{

        int value;
        Node next;

        Node(int d)
        {
            value=d;
            next=null;
        }
    }

    void traversal(){
        Node t=head;
        while(t!=null)
        {
            System.out.println(t.value);
            t=t.next;
        }
    }
    void insertaatabeginning(int number){
        Node newNode=new Node(number);
        newNode.next=head;
        head=newNode;

    }

    void insertatend(int number)
    {
       Node traverse=head;
       while(traverse.next!=null)
       {
           traverse=traverse.next;
       }
       Node newNode=new Node(number);

       traverse.next=newNode;
    }

    void enteratagivenposition(int pos, int number){
        Node traverse=head;
        boolean flag=false;
        int i=2;
        while(traverse!=null)
        {

            if(i==pos)
            {
                Node newNode=new Node(number);
                newNode.next=traverse.next;
                traverse.next=newNode;
                flag=true;
                break;
                
            }
            traverse=traverse.next;
            i+=1;

        }
        if(flag==false)
        {
            System.out.println("Position Not Found");
        }

    }

    void deleteatbeginning(){
        head=head.next;
    }

    void deleteatend()
    {
       Node traverse=head;
       while(traverse.next.next!=null)
       {
           traverse=traverse.next;
       }
       traverse.next=null;
       
    
    }

    void deleteatagivenposition(int pos){
        Node traverse=head;
        boolean flag=false;
        int i=2;
        while(traverse!=null)
        {

            if(i==pos)
            {
                traverse.next=traverse.next.next;
                flag=true;
                
            }
            traverse=traverse.next;
            i+=1;

        }
        if(flag==false)
        {
            System.out.println("Position Not Found");
        }

    }

    
    public static void main(String sd[])
    {
        Linklistmethod list=new Linklistmethod();
        list.insertaatabeginning(6);
        
        list.insertatend(8);

        list.enteratagivenposition(2, 7);
        list.enteratagivenposition(3, 1);
        list.enteratagivenposition(3, 12);
        

        list.traversal();
        System.out.println();
        list.deleteatbeginning();
        list.deleteatend();
        list.deleteatagivenposition(3);
        list.traversal();

    }
}