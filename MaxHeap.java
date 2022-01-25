import java.util.ArrayList;

public class MaxHeap
{

    void heapify(ArrayList<Integer> hs, int i){

        int size=hs.size();
        int largest=i;
        int l=2*i;
        int r=2*i+1;
        if(l<size && hs.get(i)>hs.get(largest))
        largest=l;
        if(r<size && hs.get(i)>hs.get(largest))
        largest=r;

        if(largest!=i)
        {
            int temp=hs.get(largest);
            hs.set(largest,hs.get(i));
            hs.set(i, temp);

            heapify(hs, largest);
        }

    }

    void insert(ArrayList<Integer> hs, int newNum){
        int size=hs.size();
        if(size==0)
        hs.add(newNum);
        else
        {
            hs.add(newNum);
            for(int i=size/2-1;i>=0;i--)
            {
                
                heapify(hs, i);
            }
        }
    }

    void delete(ArrayList<Integer> hs, int n)
    {

        int size=hs.size();

        int i;

        for(i=0;i<size;i++)
        {
            if(n==hs.get(i))
            {
                break;
            }
        }

        int temp=hs.get(i);
        hs.set(i,hs.get(size-1));
        hs.set(size-1,temp);

        hs.remove(size-1);

        for(i=size/2-1;i>=0;i--)
            {
                
                heapify(hs, i);
            }

    }

    void printArray(ArrayList<Integer> hs, int size)
    {
        for(Integer i:hs)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        int sizeof=hs.size();
        // for(int i=0;i<sizeof;i++){
        //     for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<sizeof;j++){
        //         System.out.print(hs.get(j+(int)Math.pow(2,i)-1)+" ");
    
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i <= sizeof / 2; i++) {
            for (int j = 0; j < Math.pow(2, i) && j + Math.pow(2, i) <= sizeof; j++) { // Each row has 2^n nodes
                System.out.print(hs.get(j + (int) Math.pow(2, i) - 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String sd[])

    {

        ArrayList<Integer> object=new ArrayList<>();
        int n=object.size();

        MaxHeap h=new MaxHeap();
        h.insert(object, 3);
        h.insert(object, 9);
        h.insert(object, 2);
        h.insert(object, 1);
        h.insert(object, 4);
        h.insert(object, 5);


        h.printArray(object, n);

        h.insert(object, 7);

        h.printArray(object, n);

        h.delete(object, 2);
        h.printArray(object, n);
    }
}