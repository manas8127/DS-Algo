import java.util.*;


public class SelectionSort {
    
    static int[] selection(int a[])
    {
        int temp;

        int size=a.length;

        for(int i=0;i<size-1;i++)
        {
            int min=i;
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j])
                {
                    min=j;
                }
            }

            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        return a;

    }
    public static void main(String sd[])
    {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        b=selection(a);

        
        System.out.println(Arrays.toString(b));

        sc.close();


    }


}
