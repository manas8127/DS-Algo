import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int d)
    {
        data=d;
    }
}

public class treeTraverse {
    
    static Scanner ob=new Scanner(System.in);
    static void inOrder(Node root)
    {
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);

    }

    static void postOrder(Node root)
    {
        if(root==null) return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String sd[])
    {
        
        // Node ob=new Node(2);
        // ob.left=new Node(4);
        // ob.left.left=new Node(7);
        // ob.right=new Node(1);
        // ob.right.left=new Node(8);
        // ob.right.right=new Node(3);

        Node ob=createTree();

        inOrder(ob);
        System.out.println();
        preOrder(ob);
        System.out.println();
        postOrder(ob);

    }

    static Node createTree() {
        
        Node root=null;
        System.out.println("Enter data: ");
        int data=ob.nextInt();

        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter left for: "+data);
        root.left=createTree();
        System.out.println("Enter right for: "+data);
        root.right=createTree();

        return root;
    }

}
