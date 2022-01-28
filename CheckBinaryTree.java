class Node
{
    int data;
    Node leftChild;
    Node rightChild;
    public Object root;

    Node(int d)
    {
        data=d;
    }
}




public class CheckBinaryTree
{
    Node root;

    static boolean binarytreecheck(Node node)
    {

        if(node==null)
        return true;


        if(node.leftChild==null && node.rightChild==null)
        return true;

        if(node.leftChild!=null && node.rightChild!=null)
        return (binarytreecheck(node.leftChild)&&binarytreecheck(node.rightChild));

        return false;

    }
    public static void main(String[] args) {

        CheckBinaryTree tree=new CheckBinaryTree();
        tree.root=new Node(1);
        tree.root.leftChild = new Node(2);
        tree.root.rightChild = new Node(3);
        tree.root.leftChild.leftChild = new Node(4);
        tree.root.leftChild.rightChild = new Node(5);
        tree.root.rightChild.leftChild = new Node(6);
        tree.root.rightChild.rightChild = new Node(7);

        if(binarytreecheck(tree.root))
        {
            System.out.println("Tree is full binary tree");
        }
        else
        System.out.println("Tree is not full binary tree");


    
    }


}