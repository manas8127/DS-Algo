import java.util.*;

public class MergeSort {

    
    static void merge(int a[], int p, int q, int r)
    {
        int n1=q-p+1;
        int n2=r-q;

        int L[]=new int[n1];
        int M[]=new int[n2];
        
        int i=l;
        int j=mid+1;

        int k=l;

        while(j<=mid && j<=r)
        {
            if(a.get(i)<a.get(j))
            {
                b.set(k,a.get(i));
                i++;
            }
            else{
                b.set(k,a.get(j));
                j++;
            }
            k++;
        }

        if(i>mid){
            while(j<=r)
            {
                b.set(k,a.get(j));
                k++;
                j++;
            }
        }
        else{
            while(i<=mid)
            {
                b.set(k,a.get(i));
                k++;
                i++;
            }
        }

        for(k=l;k<=r;k++)
        {
            a.set(k,b.get(k));
        }

    }
    
    static void mergesort(int a[], int l, int r)
    {

        if(l<r)
        {
            int mid=(l+r)/2;

            mergesort(a, l, mid);
            mergesort(a, mid+1, r);
            merge(a,l,mid,r);
        }

    }

    

    public static void main(String sd[])
    {
        
        ArrayList<Integer> ob=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the numbers of array");

        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            ob.add(sc.nextInt());
        }

        //ob.add(3,6);
        ob.set(2,6);

        System.out.println(ob.toString());
        
        mergesort(ob,0,n-1);
        
    }

}
