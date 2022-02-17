import java.util.*;

public class InsertionSort {
    

    public static void main(String sd[])
    {
         int a[]={1,5,7,2,4,6};

         for(int i=1;i<a.length;i++)
         {

            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;

         }

         System.out.println(Arrays.toString(a));
    }


}
